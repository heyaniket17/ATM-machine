package Atmmachine;
import java.util.*;
class ATM{
    float balance;
    int pin = 5392;

    public void checkpin(){
        System.out.println("enter your pin:");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if(enteredpin == pin){
            menu();
        }
        else{
            System.out.println("Enter a valid PIN");
        }
    }

    public void menu(){
        System.out.println("Enter your choices");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt == 1){
            checkbalance();
        }
        else if(opt == 2){
            withdraw();
        }
        else if(opt == 3){
            deposit();
        }
        else if(opt == 4){
            return;
        }
        else{
            System.out.println("Enter a valid Choice");
        }
    }
    public void checkbalance(){
        System.out.println("Balance:" + balance);
        menu();
    }

    public void withdraw(){
        System.out.println("Enter Amount to withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount>balance){
            System.out.println("Insufficient Balance");
        }
        else{
            balance = balance - amount;
            System.out.println("Money Withdrawal Successful");
        }
        menu();
    }

    public void deposit(){
        System.out.println("Enter the amount to be deposited");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        balance = balance + amount;
        System.out.println("Money deposited successfully");
        menu();

    }

}
public class Main {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();
    }

}
