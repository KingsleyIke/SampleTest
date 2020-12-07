import java.util.Scanner;

class Rectangle extends Shape implements Interface  {

    @Override
    int diameter() {
        return 4;
    }

    @Override
    String Colour() {
        return null;
    }

    @Override
    String sides() {
        return null;
    }

    @Override
    int area() {
        return 0;
    }

    void number () {
        super.number();
        System.out.println("How many shapes do you want to create");
    }

    @Override
    public int numberofSide() {
        return 0;
    }

    @Override
    public boolean threeDimension() {
        return false;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public int breadth() {
        return 0;
    }

    @Override
    public String text() {
        return null;
    }

    int check() {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num % 5 == 0 && num % 3 == 0) {
            System.out.println("fooboo");
        } else if (num % 5 == 0) {
            System.out.println("boo");
        } else if (num % 3 == 0) {
            System.out.println("foo");
        }  else {
            System.out.println("Not applicable");
        }
        return num;
    }
}