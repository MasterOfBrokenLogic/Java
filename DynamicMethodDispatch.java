class ParentD {
    void show() {
        System.out.println("This is parent class");
    }
}

class ChildD extends ParentD {
    void show() {
        System.out.println("This is child class");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        ParentD p;

        p = new ParentD();
        p.show();

        p = new ChildD();
        p.show();
    }
}
