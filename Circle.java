public class Circle extends GeometricObject{
    //fields
    private double x = 0.0;
    private double y = 0.0;
    private double radius = 1.0;
    //constructor
    public Circle (double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    //default constructor
    public Circle(){}
    //Get method for x
    public double getX() {
        return x;
    }
    //Get method for y
    public double getY() {
        return y;
    }
    //get the radius
    public double getRadius() {
        return radius;
    }
    //overriding getArea() method
    public double getArea(){
        return Math.PI*Math.pow(radius,2); //return the area of the circle
    }
    //overriding getPerimeter() method
    public double getPerimeter(){
        return 2*Math.PI*radius; //return the perimeter of the circle
    }
}
