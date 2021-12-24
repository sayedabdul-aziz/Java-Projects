
package orderProject;

import java.util.Scanner;

public class OrderApp {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter U Name : ");
        String name = sc.nextLine();
        System.out.println("Enter U Location : ");
        String Location = sc.nextLine();
        System.out.println("Hello, "+ name );
        System.out.println("Special Order(S) or Normal Order(N) ?");
        char ch = sc.next().charAt(0);
        switch(ch){
         case 'S':
         case 's':
            SpcialOrder s1 = new SpcialOrder("100");
            s1.confirm();
            System.out.println("Plz Enter U order :");
            sc.nextLine();
            String order1 = sc.nextLine();
            System.out.print("U order is : " + order1 + ", ");
            s1.send();
            s1.close();
            break;
        case 'N' :
        case 'n' :
            NormalOrder n1 = new NormalOrder("1000");
            n1.confirm();
            System.out.println("Plz Enter U order :");
            
            sc.nextLine();
            String order2 = sc.nextLine();
            System.out.print("U order is : " + order2 + ",");
            n1.send();
           
            n1.recive();
            n1.close();
            break;
        default:
            System.out.println("Wrong Order ! , plz try again !");
        } 
    }
    
}
