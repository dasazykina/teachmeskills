package lesson7.doctor;

public class Dentist extends Doctor {
    public Dentist(String name) {
        super(name);
    }

    @Override
    public void treat() {
        System.out.println("Dental treatment");
    }
}
