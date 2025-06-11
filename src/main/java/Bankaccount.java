import javax.xml.transform.Source;
import java.util.*;
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
Scanner sc=new Scanner(System.in);
System.out.println("Enter the choice");
int choice=sc.nextInt();
if(choice == 1){
    ac.deposit(100);
} else if (choice ==2) {
    ac.withdrawl(77);
} else if (choice ==3) {
    ac.displau();
}
else{
    sc.close();
}

}

}
