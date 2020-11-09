package week3;

public class AccountTest {
        public static void main(String[] args) {
            //creating instance of Account class
            EncapsulationAccount acc=new EncapsulationAccount();
            //setting values through setter methods
            acc.setAcc_no(7560504000L);
            acc.setName("Sanuu Thapa");
            acc.setEmail("Santhapa@javatpoint.com");
            acc.setAmount(500000f);
            //getting values through getter methods
            System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());
        }
}
