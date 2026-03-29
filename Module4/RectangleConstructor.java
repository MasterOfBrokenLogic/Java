class Rectangle {
    int length, breadth;

    Rectangle() {
        length = 1;
        breadth = 1;
    }

    Rectangle(int side) {
        length = side;
        breadth = side;
    }

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    int area() {
        return length * breadth;
    }
}

public class RectangleConstructor {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle(4, 6);

        System.out.println("Area of r1 = " + r1.area());
        System.out.println("Area of r2 = " + r2.area());
        System.out.println("Area of r3 = " + r3.area());
    }
}
