/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author teams
 */
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