import java.util.Scanner;

class AgeNotWithinRangeException extends Exception {
    AgeNotWithinRangeException(String msg) {
        super(msg);
    }
}

class Student {
    int roll;
    String name;
    int age;
    String course;

    Student(int roll, String name, int age, String course) throws AgeNotWithinRangeException {
        if(age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age not within range (15-21)");
        }

        this.roll = roll;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void display() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class AgeNotWithinRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter roll: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter course: ");
            String course = sc.nextLine();

            Student s = new Student(roll, name, age, course);
            s.display();

        } catch(AgeNotWithinRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}
