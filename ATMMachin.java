//package ATMMachin;

import java.util.Scanner;

class ATM{
    float Balance;
    int PIN=1234;
    public void checkpin(){
       System.out.println("enter your pin");
       Scanner sc=new Scanner(System.in);
       int enterpin=sc.nextInt();
       if(enterpin==PIN){
           menu();
       }
       else{
           System.out.println("enter a valid pin");
           menu();
       }
    }
    public void menu() {
        System.out.println("emter your choice");
        System.out.println("1. check A/C Balance");
        System.out.println("2. withdral money");
        System.out.println("3. deposite money");
        System.out.println("4. exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if (opt == 1) {
            checkBalance();
        } else if (opt == 2) {
            withdrawMoney();
        } else if (opt == 3) {
            depositMoney();
        } else if (opt == 4) {
            return;
        } else {
            System.out.println("enter a valide choice");
        }
    }
public void checkBalance(){
        System.out.println("Balace: "+ Balance);
        menu();
}
public void withdrawMoney(){
        System.out.println("enter amount to withdraw: ");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        if(amount>Balance){
            System.out.println("insufficient Balance");
        }
        else{
            Balance=Balance-amount;
            System.out.println("money withdrawl successful ");
        }
      menu();
}
public void depositMoney(){
        System.out.println("enter the amount");
        Scanner sc=new Scanner(System.in);
        float amount= sc.nextFloat();
        Balance=Balance+amount;
        System.out.println("money deposit successfully");
        menu();
}


}
public class ATMMachin {
    public static void main(String[] args){
        ATM obj=new ATM();
        obj.checkpin();
    }
}
