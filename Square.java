public class Square extends Rectangle{
    //field
    private double side;
    //constructor
    public Square(double side){
        super(side,side); //pass the value of the side to Rectangle's constructor
        this.side = side;
    }
    //Overriding getArea() method in Rectangle class
    public double getArea(){
        return Math.pow(side,2);    //return the area of the square
    }
    //Overriding getPerimeter() method in Rectangle class
    public double getPerimeter(){
        return side*4;      //return the perimeter
    }
}
