package number3;

import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;
import java.util.List;

public class Starter {
    public static void main(String[] args) {
        Student student1 = new Student("Anna", "Math", 1,2);
        Student student2 = new Student("Masha", "Math", 1,3);
        Student student3 = new Student("Dasha", "Math", 1,5);
        Student student4 = new Student("Alina", "Math", 1,4);
        Student student5 = new Student("Vadim", "Math", 1,2);
        Student student6 = new Student("Ilya", "Math", 1,3);
        Student student7 = new Student("Maxim", "Math", 1,5);
        Student student8 = new Student("Ivan", "Math", 1,4);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);

        deduct(students);
        graduate(students);
        printStudents(students, 2);
    }

    public static void deduct(List<Student> students) {
        List<Student> deductStudents = new ArrayList<>();
        for (Student s : students) {
            if (s.getKnowledgeRating() < 3) {
                deductStudents.add(s);
            }
        }
        students.removeAll(deductStudents);
    }

    public static void graduate(List<Student> students) {
        for (Student s : students) {
            if (s.getKnowledgeRating() >= 3) {
                s.setCourse(s.getCourse() + 1);
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        for (Student s : students) {
            if (s.getCourse() == course) {
                System.out.println(s.getName());
            }
        }
    }
}
