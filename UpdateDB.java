import java.sql.*;

public class UpdateDB {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", "root", "password");

            Statement st = con.createStatement();

            st.executeUpdate("UPDATE student SET name='Alex' WHERE id=1");

            System.out.println("Record updated");

            con.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
