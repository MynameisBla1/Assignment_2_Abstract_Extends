public class Rectangle extends GeometricObject{
    //fields
    private double side1 = 1.0;
    private double side2 = 1.0;
    //default constructor
    public Rectangle(){}
    //constructor
    public Rectangle(double side1, double side2){
        this.side1 = side1;
        this.side2 = side2;
    }
    //Overriding getArea() method in GeometricObject
    public double getArea(){
        return side1*side2; //return the area for the rectangle
    }
    //Overriding getPerimeter() method in GeometricObject
    public double getPerimeter(){
        return 2*(side1+side2); //return the perimeter
    }

}
