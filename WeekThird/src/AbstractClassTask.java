import java.util.Scanner;

abstract class Shape {
    abstract void perimeter();
    abstract void area();

}

class Circle  extends Shape {
    double radius;

    Circle(double x) {
        this.radius = x;
    }

    @Override
    void perimeter() {
        double perimeter = (Math.PI*radius*2);
        System.out.println("Circle's perimeter is : " + perimeter);
    }

    @Override
    void area() {
        double area = (Math.PI*radius*radius);
        System.out.println("Circle's area is : " + area);
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double x, double y){
        this.length = x;
        this.width = y;
    }

    @Override
    void perimeter() {
        double perimeter = 2*(length+width);
        System.out.println("Rectangle's perimeter is : " + perimeter);
    }

    @Override
    void area() {
        double area = length*width;
        System.out.println("Rectangle's area is : " + area);
    }
}

public class AbstractClassTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Click\n"+"1 for Circle : \n"+"2 for Rectangle : ");
        int n = sc.nextInt();

        if (n==1)
        {
            System.out.println("Enter the radius of Circle : ");
            double r = sc.nextDouble();
            Circle circle = new Circle(r);
            circle.area();
            circle.perimeter();
        }
        else if (n==2)
        {
            System.out.println("Enter the length and width of Rectangle : ");
            double l = sc.nextDouble();
            double w = sc.nextDouble();
            Rectangle rectangle = new Rectangle(l,w);
            rectangle.area();
            rectangle.perimeter();

        }
        else
        {
            System.out.println("Invalid input!.");
        }

    }
}