package number3;

public class Student {
    private String name;
    private String group;
    private int course;
    private int knowledgeRating;

    public Student(String name, String group, int course, int knowledgeRating) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.knowledgeRating = knowledgeRating;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getKnowledgeRating() {
        return knowledgeRating;
    }

    public void setKnowledgeRating(int knowledgeRating) {
        this.knowledgeRating = knowledgeRating;
    }
}
