abstract public class Shape {
    protected double numSides;

    abstract void getNumSides();

    public void calculatePerimeter(int units){
        System.out.println(units*numSides);
    }
}
