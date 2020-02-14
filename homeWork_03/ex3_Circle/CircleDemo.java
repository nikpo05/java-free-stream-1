package lesson3_Circle;

public class CircleDemo {
    public static void main(String[] args) {
        Circle newCircle = new Circle();
        newCircle.radius = 4.5;
        double area = newCircle.calculateArea();
        System.out.println("Circle area = " + area);
    }
}
