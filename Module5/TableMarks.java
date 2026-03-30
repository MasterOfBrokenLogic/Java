import javax.swing.*;

public class TableMarks {
    public static void main(String[] args) {
        JFrame f = new JFrame("Marks");

        String data[][] = {
            {"1", "John", "85"},
            {"2", "Alex", "90"},
            {"3", "Sam", "78"}
        };

        String col[] = {"Roll", "Name", "Marks"};

        JTable t = new JTable(data, col);
        t.setBounds(30, 40, 200, 200);

        JScrollPane sp = new JScrollPane(t);

        f.add(sp);

        f.setSize(300, 250);
        f.setVisible(true);
    }
}