
package bankacc;

import java.util.Scanner;


public class BankAcc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount b1 = new BankAccount("Sayed", "14112000", 2000);
        BankAccount b2 = new BankAccount("Ali", "26122020", 1000);
        System.out.println("Enter U Name : ");
        String name = sc.nextLine();
         System.out.println("Enter U Password : ");
        String pass = sc.next();
        if(b1.checkName(name) && b1.checkPass(pass)){
            System.out.println("hello "+ name +"\nU balance is : "+b1.checkBalance() );
            System.out.println("Choose the operation :\n1 ---> Deposit\n2 ---> Withdraw\n3 ---> Transfer");
            int ope = sc.nextInt();
            switch (ope) {
                case 1:
                        System.out.println("********* Deposit Operation ***********\n");
                        System.out.println("Enter U amount");
                        double amount = sc.nextDouble();
                        b1.deposit(amount);
                        System.out.println("Done Sayed\n"+"U balance is : "+b1.checkBalance());
                        break;
                case 2:
                        System.out.println("********* Withdraw Operation ***********\n");
                        System.out.println("Enter U amount");
                        double am = sc.nextDouble();
                        b1.withdraw(am);
                        System.out.println("Done Sayed\n"+"U balance is : "+b1.checkBalance());
                        break;
                case 3:
                        System.out.println("********* Transfer Operation ***********\n");
                        System.out.println("Enter Account Name : ");
                        String str = sc.nextLine();
                        sc.nextLine();
                        System.out.println("Enter Account pass : ");
                        String pas = sc.next();
                    if(b2.checkName(str) && b2.checkPass(pas)){
                        System.out.println("Enter U amount");
                        double a = sc.nextDouble();
                        b1.transfer(b2, a);
                        System.out.println("Done Sayed\n"+"U balance is : "+b1.checkBalance());
                        
                    } else {
                        
                        System.out.println("Wrong");   
                    }
                        break;
                        default:
            
                        System.out.println("Wrong operation, please Try again");
                         }
                          
        }
             
         else
            System.out.println("incorrect name or password , plz try again !");
        
        
   
        
    }
    
}
