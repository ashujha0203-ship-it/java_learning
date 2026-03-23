abstract class Shape
{
    public abstract double area();
    public abstract double perimeter();
}

class Circle extends Shape{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double area()
    {
        return Math.PI * radius * radius;
    }
    @Override
    public double perimeter()
    {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape
{
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area()
    {
        return length * breadth;
    }

    @Override
    public double perimeter()
    {
        return 2 * (length + breadth);
    }
}

class Triangle extends Shape
{
    private double base;
    private double height;
    private double sides;

    public Triangle(double base, double height, double sides)
    {
        this.base = base;
        this.height = height;
        this.sides = sides;
    }

    @Override
    public double area()
    {
        return (base * height)/2;
    }

    @Override
    public double perimeter()
    {
        return (sides + sides + sides);
    }
}

public class Day1 {
    public static void main(String[] args)
    {
        double radius = 8;
        
        double length = 5;
        double breadth = 6;

        double base = 5;
        double height = 6;
        double sides = 3;


        Shape obj = new Circle(radius);
        double circleArea = obj.area();
        double circlePerimeter = obj.perimeter();
        System.out.println("The Area of the Circle: " + circleArea);
        System.out.println("The Perimeter of the Circle: " + circlePerimeter);

        Shape obj1 = new Rectangle(length, breadth);
        double rectangleArea = obj1.area();
        double rectanglePerimeter = obj1.perimeter();
        System.out.println("The Area of Rectangle: " + rectangleArea);
        System.out.println("The Perimeter of Rectangle: " + rectanglePerimeter);


        Shape obj2 = new Triangle(base, height, sides);
        double triangleArea = obj2.area();
        double traianglePerimeter = obj2.perimeter();
        System.out.println("The the Area of Triangle: " + triangleArea);
        System.out.println("The Perimeter of Triangle: " + traianglePerimeter);


    }
}
