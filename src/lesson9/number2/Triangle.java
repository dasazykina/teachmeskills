package lesson9.number2;

public class Triangle extends Figure{
    private int sideOne;
    private int sideTwo;
    private int sideThree;
    private int height;


    public Triangle(int sideOne, int sideTwo, int sideThree, int height) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double) (sideOne * height) / 2;
    }

    @Override
    public double getPerimeter() {
        return sideOne + sideTwo + sideThree;
    }
}
