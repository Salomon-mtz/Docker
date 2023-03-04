import java.io.*;
public class GeneratePerimeter {
    public static void main(String args[])throws IOException{
        ShapeFactory planFactory = new ShapeFactory();

        System.out.print("Enter the name of the Shape for which the perimeter will be calculated: ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String shapeName=br.readLine();
        System.out.print("Enter the length of the side of the shape: ");git
        int units=Integer.parseInt(br.readLine());

        Shape p = planFactory.getShape(shapeName);
        //call getRate() method and calculateBill()method of DomesticPaln.

        System.out.print("Perimeter of "+shapeName+" of  "+units+" units is: ");
        p.getNumSides();
        p.calculatePerimeter(units);
    }
}
