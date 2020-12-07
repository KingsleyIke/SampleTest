import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

            Rectangle rectangle = new Rectangle();
            rectangle.diameter();
            System.out.println("Overridden Diameter is " + rectangle.diameter());

            rectangle.Colour();
            System.out.println("Overridden Colour is " + rectangle.Colour());

            rectangle.sides();
            System.out.println("Overridden sides is " + rectangle.sides());

            rectangle.area();
            System.out.println("Overridden area is " + rectangle.area());

            rectangle.number();

            rectangle.numberofSide();
            System.out.println("Overridden number of side from interface is " + rectangle.numberofSide());

            rectangle.threeDimension();
            System.out.println("Overridden threeDimension from interface is " + rectangle.threeDimension());

        do {
            System.out.println("Enter number to check and press enter");
            rectangle.check();

        } while (1!=4);


    }
}




