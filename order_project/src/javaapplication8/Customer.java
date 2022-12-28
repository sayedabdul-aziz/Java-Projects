
package javaapplication8;

import java.util.Scanner;
public class Customer {

    Scanner sc = new Scanner(System.in);
    private String name;
    private String location;
    private int TypeOFOrder;
    Items items;
    SpecialOrder s;
    NormalOrder n;



    public Customer(String name, String location) {
        this.name = name;
        this.location = location;
    }

    private void ChooseYourOrder() {
        System.out.println("==============================");
        System.out.println("Choose the order's Type: \n1) : Special Order \n2) : Normal Order ");
        int number = sc.nextInt();
        this.TypeOFOrder = number;
    }

    private void EnterYourOrder() {
        items=new Items();
        items.display();
    }

    public void SendOrder() {

        do {
            this.ChooseYourOrder();
            switch (TypeOFOrder) {
                case 1:
                    this.EnterYourOrder();
                    s = new SpecialOrder();
                    s.confirm();
                    break;

                case 2:
                    this.EnterYourOrder();
                    n = new NormalOrder();
                    n.confirm();
                    n.dispatch();
                    break;
                default:
                    System.out.println("Wrong Order");
                    this.ChooseYourOrder();
                    break;
            }
            System.out.println("------------------------------------------");
            System.out.println("Another order ? (Yes/No)");
            String confirm = sc.next();
            if (confirm.equalsIgnoreCase("No")){
                System.out.println("**************************************");
                    this.RecevieOrder();
                break;
            }
        } while (true);
    }

    public void RecevieOrder() {

        if (SpecialOrder.getNumber_SpecialOrder() > 0) {
            s.close();
            s.dispatch();
        }
        System.out.println("*******************************************************************************************");

        if (NormalOrder.getNumber_NormalOrder() > 0) {
            n.close();
            n.receive();
        }
    }
}
