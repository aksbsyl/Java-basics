package BankingSystem;

import java.sql.*;

import static BankingSystem.DatabaseConnection.getDbConnection;

/**
 * Created by explore on 7/14/17.
 */
public class AccountService {
    //for database connection
    Connection con=null;

    public AccountService() { con=getDbConnection();
    }


    public int addAccount(Account account){
        int last_inserted_id=0;
        int status;

        try {
            PreparedStatement preparedStatement=con.prepareStatement("insert into Account(amount,interest,initial_deposit)values(?,?,?)", Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setDouble(1,account.getAmount());
            preparedStatement.setFloat(2,account.getInterest());
            preparedStatement.setDouble(3,account.getInitialDeposit());

            status=preparedStatement.executeUpdate();
            ResultSet keys=preparedStatement.getGeneratedKeys();
            keys.next(); //to go to first key
            last_inserted_id=keys.getInt(1);


            //System.out.println(last_inserted_id);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return last_inserted_id;

    }

    public void deposit(int accountId,double amount){
        int accountAmount=0;
        int status;

        //get the last updated amount of accountId
        try {
            PreparedStatement preparedStatement=con.prepareStatement("Select amount from Account where id=?");
            preparedStatement.setInt(1,accountId);
            ResultSet resultSet=preparedStatement.executeQuery();
            resultSet.next();
            accountAmount=resultSet.getInt(1);

            PreparedStatement preparedStatementUpdate=con.prepareStatement("Update Account set amount=? where id=?");
            preparedStatementUpdate.setDouble(1,accountAmount+amount);
            preparedStatementUpdate.setInt(2,accountId);
            status=preparedStatementUpdate.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(accountAmount+amount);
    }

    public void withdrawal(int accountId,double amount){
        int accountAmount=0;
        int status;

        //get the last updated amount of accountId
        try {
            PreparedStatement preparedStatement=con.prepareStatement("Select amount from Account where id=?");
            preparedStatement.setInt(1,accountId);
            ResultSet resultSet=preparedStatement.executeQuery();
            resultSet.next();
            accountAmount=resultSet.getInt(1);

            PreparedStatement preparedStatementUpdate=con.prepareStatement("Update Account set amount=? where id=?");
            preparedStatementUpdate.setDouble(1,accountAmount-amount);
            preparedStatementUpdate.setInt(2,accountId);
            status=preparedStatementUpdate.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(accountAmount-amount);

    }
}


