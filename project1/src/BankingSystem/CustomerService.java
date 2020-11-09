package BankingSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static bankingSystem15.DatabaseConnection.getDbConnection;

/**
 * Created by explore on 7/14/17.
 */
public class CustomerService {
    //for database connection
    private Connection con;

    //for database connection
    public CustomerService(){
        con=getDbConnection();
    }

    //to add new customer
    public boolean addCustomer(Customer customer){
        int status=0;
        try {
            PreparedStatement preparedStatement=con.prepareStatement("insert into Customer(name,address,account_id)values(?,?,?)");
            preparedStatement.setString(1,customer.getCustomerName());
            preparedStatement.setString(2,customer.getCustomerAddress());
            preparedStatement.setInt(3,customer.getAccountId());

            status=preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        if(status==0){
            return false;
        }else{
            return true;

        }
    }

    //to delete the customer
    public boolean deleteCustomer(int customerId){
        int status=0;
        try {
            PreparedStatement preparedStatement=con.prepareStatement("Delete from Customer where id=?");
            preparedStatement.setInt(1,customerId);
            status=preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        if(status==0){
            return false;
        }else{
            return true;
        }

    }
}
