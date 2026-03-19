class Shape {
    public float area(){
        return 0;
    }

    public float perimeter(){
        return 0;
    }
}



class Circle extends Shape{
    public float area(float radius){
        float pi = 3.14f;
        return (pi * radius * radius);
    }
    
    public float perimeter(float radius){
        float pi = 3.14f;
        return 2*(pi * radius);
    }
}


class Rectangle extends Shape{
    public float area(float length, float breadth){
        return (length * breadth);
    }

    public float perimeter(float length, float breadth){
        return 2*(length + breadth);
    }
}


class Triangle extends Shape{
    public float area(float base, float height){
        return base * height;
    }

    public float perimeter(float sides1,float sides2,float sides3){
        return (sides1+sides2+sides3);
    }
}



public class Main{
    public static void main(String[] args){
        Circle obj = new Circle();
        // obj.area(5);
        // obj.perimeter(5);
        System.out.println("Area of Circle: " +obj.area(5));
        System.out.println("Perimeter of Circle: " +obj.perimeter(5));

        Rectangle obj1 = new Rectangle();
        // obj1.area(3, 4);
        // obj1.perimeter(3,4);
        System.out.println("Area of Rectangle: " +obj1.area(3, 4));
        System.out.println("Perimeter of Rectangle: " +obj1.perimeter(3,4));

        Triangle obj2 = new Triangle();
        // obj2.area(2,3);
        // obj2.perimeter(6, 3, 2);
        System.out.println("Area of Triangle: " +obj2.area(2,3));
        System.out.println("Perimeter of Triangle: " +obj2.perimeter(6, 3, 2));
    }
}