public class EquilateralTriangle extends Triangle{
    //field
    private double side;
    //constructor
    public EquilateralTriangle(double side){
        super(side,side,side);   //call super and pass side for side1, side2, and side3
        this.side = side;
    }

}
