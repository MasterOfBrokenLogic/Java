import java.sql.*;

public class InsertDB {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", "root", "password");

            Statement st = con.createStatement();

            st.executeUpdate("INSERT INTO student VALUES(1,'John')");

            System.out.println("Record inserted");

            con.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}