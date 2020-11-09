package DatabaseTest;
import java.sql.*;
class DbjsTest1{
    public static void main(String args[]){
        try{
            String database="student.mdb";//Here database exists in the current directory

            Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/aks", "root","V@mp1r330");
            Statement st=c.createStatement();
            ResultSet rs=st.executeQuery("select * from employee");

            while(rs.next()){
                System.out.println(rs.getString("id") + " " + rs.getString("name"));
            }
            c.close();

        }catch(Exception ee){System.out.println(ee);}

    }}