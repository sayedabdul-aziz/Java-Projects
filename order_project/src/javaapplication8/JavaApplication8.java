
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author Sayed Abdulaziz
 */
public class JavaApplication8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our App !!!\n==============================");
        System.out.println("Plz, Enter Your Name : ");
        String name = sc.nextLine();
        System.out.println("Plz, Enter Your Location : ");
        String location = sc.nextLine();
        System.out.println("Hello, "+name);
        Customer ob1 = new Customer(name, location);

        ob1.SendOrder();

    }
}

