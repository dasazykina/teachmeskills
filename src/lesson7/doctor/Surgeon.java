package lesson7.doctor;

public class Surgeon extends Doctor{
    public Surgeon(String name) {
        super(name);
    }
    @Override
    public void treat() {
        System.out.println("Surgical treatment");
    }

}
