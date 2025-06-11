import javax.xml.transform.Source;

class Account {
    private int balance;
    Account(int balance){
        this.balance=balance;
    }
    public void deposit(int amount){
        if(amount>0){
            balance=balance+amount;
            System.out.println("the amount succesfully deposited");
        }
        else{
            System.out.println("the amount not deposit");
        }
    }
    public void withdrawl (int amount){
        if(amount<balance){
            balance=balance-amount;
            System.out.println("the amount succesfully withdrawl");
        }
        else{
            System.out.println("the amount withdrawl successfully");
        }
    }
    public void displau(){
        System.out.println(balance);
    }
}


public class Bankaccount {
public static void main(String args[]){
    Account ac=new Account(100);
ac.deposit(100);
ac.withdrawl(50);
ac.displau();
ac.displau();
}

}
