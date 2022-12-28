package javaapplication8;

import java.util.Scanner;

public class Items {

    static int[] id = {1, 2, 3, 4, 5, 6, 7};
    static String[] names = {"SHAWERMA", "CHICKEN", "SOGOQ", "BEEF", "FISH", "Oreo", "Cola"};
    static int[] prices = {80, 90, 65, 120, 68, 45, 30};
    double total;
    Scanner sc = new Scanner(System.in);

    public void display() {
        System.out.println("ID        name        price");
        for (int i = 0; i < id.length; i++) {
            System.out.println(id[i] + "        " + names[i] + "        " + prices[i]);
        }
        System.out.println("------------------------------------------");
        int item_num =0;
        while (true) {
            System.out.print("Enter ID of item :  ");
            int num = sc.nextInt();
            if (num == id[0] || num == id[1] || num == id[2] || num == id[3] || num == id[4] || num == id[5] || num == id[6]) {
                System.out.println("Enter quntity");
                int qun = sc.nextInt();
                this.total += qun * prices[num - 1];
                
                System.out.println("------------------------------------------");
                System.out.println("Another order ? (Yes/No)");
                String confirm = sc.next();
                if (confirm.equalsIgnoreCase("No")) {
                    
                    System.out.println("Total is : " + this.total);
                    break;
                }
                item_num++;
            } else {
                System.out.println("Invalid id number , plz try again!!");
            }
        }
    }

}
