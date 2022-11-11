
package bank_account;

import java.util.Scanner;

public class Bank_Account {

    public static void main(String[] args) {
         Account a1 = new Account("Ali Ahmed", "1234", 5000);
         Account a2 = new Account("Amira Ali", "123", 6000);
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter u name :");
         String name = sc.nextLine(); //Ali Ahmed
         System.out.println("Enter u pass :");
         String pass = sc.next();   //1234
         if(a1.checkName(name)&& a1.checkPass(pass)){
         System.out.println("hello," + name+"\nU Balance is :" + a1.checkBalance());
         while(true){
         System.out.println("Choose the operation"
                 + "\n1)deposite"
                 + "\n2)withdraw"
                 + "\n3)check Balance"
                 + "\n4)transfer");
         int ope = sc.nextInt();
         switch(ope){
             case 1:
                   System.out.println("*******deposite operation*******");
                   System.out.println("Enter the amount");
                   double amount = sc.nextDouble();
                   a1.deposite(amount);
                   System.out.println("Done , U Balance is :" +a1.checkBalance());
                   break;
             case 2:
                   System.out.println("*******withdraw operation*******");
                   System.out.println("Enter the amount");
                   double am = sc.nextDouble();
                    if(a1.withdraw(am)){
                        System.out.println("Done , U Balance is :" +a1.checkBalance());
                    }else{
                        System.out.println("U Balance is not enough");
                    }
                     break;
             case 3:
                    System.out.println("*******check Balance operation*******");
                     System.out.println("U Balance is :" +a1.checkBalance());
                     break;
             case 4:
                    System.out.println("*******Transfer operation*******");
                    sc.nextLine();
                    System.out.println("Enter Account name :");
                    String other = sc.nextLine(); 
                    System.out.println("Enter the ammount :");
                    double t_amount = sc.nextDouble();
                    
                    if(a1.transfer(a2, t_amount)){
                        System.out.println("Done , U Balance is :" +a1.checkBalance());
                    }else{
                        System.out.println("U Balance is not enough");
                    }
                     break;
             default:
                 System.out.println("Wrong operation , plz try again");
            } 
             System.out.println("Another operation (Yes/no) ?");
             String res = sc.next(); //yes/no
             if(res.equalsIgnoreCase("no")){
                 break;
             }
         }
         }else{
             System.out.println("Account is not exist !!");
         }
    }
    
}
