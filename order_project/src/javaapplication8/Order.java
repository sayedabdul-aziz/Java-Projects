
package javaapplication8;

import java.util.Date;
public abstract class Order {
    private static String number = "0";
    Date date = new Date();
    public Order() {
        String Snum = Order.number;
        int num = Integer.valueOf(Snum);
        num++;
        Order.number = String.valueOf(num);
    }
    public String getNumber_Order() {
        return Order.number;
    }
    public void date() {
        System.out.println(date.toString());
    }
    public abstract void confirm();
    public abstract void close();
}
