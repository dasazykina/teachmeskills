package lesson9.number2;

public class Starter {
    public static void main(String[] args) {
        Circle circleOne = new Circle(2);
        Triangle triangleOne = new Triangle(3,2,4,2);
        Rectangle rectangleOne = new Rectangle(4,5);
        Circle circleTwo = new Circle(6);
        Rectangle rectangleTwo = new Rectangle(7,10);


        Figure[] array = new Figure[]{circleOne, circleTwo, rectangleOne, rectangleTwo, triangleOne};

        int sumOfPerimeters = 0;
        
        for (int i = 0; i < array.length; i++){
            sumOfPerimeters += array[i].getPerimeter();
        }
        System.out.println(sumOfPerimeters);


    }
}
