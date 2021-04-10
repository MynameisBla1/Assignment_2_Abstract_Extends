/*
Y Tran
0668096
Assignment 2, Part 1
Description: In this program, we apply polymorphism concept. In the end, the program will display
the area and the perimeter of each element in the array.
*/
public class Test {
    public static void main(String[] args) {
        //an array of GeometricObject of size 5
        GeometricObject gObjectArray [] = new GeometricObject [5];
        //1st element is a Circle object
        gObjectArray[0] = new Circle(5,5,5);
        //2nd element is an EquilateralTriangle object
        gObjectArray[1] = new EquilateralTriangle(5);
        //3rd element is a Triangle object
        gObjectArray[2] = new Triangle(5,5,5);
        //the 4th element of the array is a Rectangle object
        gObjectArray[3] = new Rectangle(5,5);
        //the 5th element of the array is a Square object
        gObjectArray[4] = new Square(5);
        //pass each element in the array to printAreaAndPerimeter() method
        for (int i=0; i<gObjectArray.length;i++)
            printAreaAndPerimeter(gObjectArray[i]);
    }

    //printAreaAndPerimeter() method
    private static void printAreaAndPerimeter(GeometricObject gObject) {
        //get the area and perimeter of the passed GeometricObject
        double Area = gObject.getArea();
        double Perimeter = gObject.getPerimeter();
        //display the area and perimeter of the passed GeometricObject
        System.out.println("Area: " + Area);
        System.out.println("Perimeter: "+ Perimeter);
        System.out.println("******************************************");
    }
}
