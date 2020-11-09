package BankingSystem;

import java.util.*;

/**
 * Created by explore on 7/14/17.
 */
public class BankingMain {
    /***************************types of account***********************************************/
    private static Map<String,Account> accountList=new HashMap(){{
        put("FixedDeposit",new FixedDepositAccount());
        put("CurrentAccount",new CurrentAccount());
    }};

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("////////////////////////Banking Transaction/////////////////////////////////");
        System.out.println("1.Add 2.delete 3.deposit 4.withdrawal 5.check balance 6.exit");

        boolean addResult=false;
        boolean deleteResult=false;



        CustomerService customerService=new CustomerService();

        Customer customer=new Customer();
        //to add customer
        System.out.println("Enter the name of customer");
        customer.setCustomerName(scanner.next());
        System.out.println("Enter the address of customer");
        customer.setCustomerAddress(scanner.next());
        System.out.println("Enter the contact of customer");
        customer.setCustomerAddress(scanner.next());
        System.out.println("Enter the account type of customer:\n1.FixedDeposit and 2.CurrentAccount");

        Account account=getCustomerAccount(scanner.next()); //account selected by customer
        AccountService accountService=new AccountService();
        account.setAmount(20000.00);
        int accountId=accountService.addAccount(account);
        customer.setAccountId(accountId);
        addResult=customerService.addCustomer(customer);

        //AccountService accountService=new AccountService();
        //to deposit amount
        accountService.deposit(2,2000);
        //to withdrawal amount
        accountService.withdrawal(2,1000);

        if(addResult){
            System.out.println("Customer added Successfully");

        }else{
            System.out.println("error");
        }



        //to delete customer
        System.out.println("Enter the id of customer whose data is to be deleted");
        deleteResult=customerService.deleteCustomer(scanner.nextInt());
        if(deleteResult){
            System.out.println("Customer deleted Successfully");

        }else{
            System.out.println("error");
        }


    }

    //to return the object of fixed deposit or current account at the run time
    public static Account getCustomerAccount(String input){
        return accountList.get(input);
    }

}
