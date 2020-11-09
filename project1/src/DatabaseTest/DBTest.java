package DatabaseTest;

import  java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.*;
import java.sql.*;

public class DBTest {

    //    public static void main(String[] args) throws SQLException, ClassNotFoundException {
    public static void main(String[] args) {
        try {
            //Register Driver
            Class.forName("com.mysql.jdbc.Driver");

            //Get Connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aks", "root", "V@mp1r330");

            //here .. is database name, root is username and password is urs
            System.out.println("DB connected.....");

            //Create statement
            Statement stmt = con.createStatement();

            //Execute query
            String selectQuery = "select * from employee";
            ResultSet rs = stmt.executeQuery(selectQuery);
            while (rs.next())
                System.out.println(rs.getString("id") + " " + rs.getString("name"));
            con.close();

//            int result = stmt.executeUpdate("insert into aks.employee values(6,'Gita Khanal')");
//            System.out.println(result+ "Row affected");
//            con.close();
//            int result = stmt.executeUpdate(("delete from aks where id = 1"));
//            System.out.println(result + "Row Deleted..");
//            con.close;


//            String INSERT_RECORD = "insert into aks.employee(id, date_column, "
//                    + "time_column, timestamp_column) values(?,?,?)";
//            String INSERT_RECORD = " insert into aks.employee(id, name) values(?,?) ";
//            Connection conn = null;
//            String query = "select * from aks.employee where id=?";
//            PreparedStatement pstmt = null;
//            try{
//                conn = getConnection();
//            pstmt = con.prepareStatement(INSERT_RECORD);
//            pstmt.setString(1, "6");
//            pstmt.setString(2, "Ramita Kharel");
//            pstmt.executeUpdate();

//            pstmt = con.prepareStatement(query);
//            pstmt.setString(1,"6");
//            ResultSet rs = pstmt.executeQuery();
//            while (rs.next()) {
//                System.out.println(rs.getString("id") + " " + rs.getString("name"));
////                System.out.println("id:"+rs.getString(1)+"name: "+ rs.getString(2));
//            }
//            pstmt.close();
//            con.close();


//            java.util.Date date = new java.util.Date();
//            long t = date.getTime();
//            java.sql.Date sqlDate = new java.sql.Date(t);
//            java.sql.Date sqlTime = new java.sql.Date(t);
//            java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(t);
//            System.out.println("sqlDate= " + sqlDate);
//            System.out.println("sqlTime = " + sqlTime);
//            System.out.println("sqlTimestamp = " + sqlTimestamp);
//            pstmt.setDate(2, sqlDate);
//            pstmt.setTime(3, sqlTime);
//            pstmt.setTimestamp(4, sqlTimestamp);
//            pstmt.executeUpdate();
//        }catch(Exception e) {
//            e.printStackTrace();
//            System.out.println("Failed to insert the record");
//        }finally {
//            pstmt.close();
//            con.close();
//        }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}