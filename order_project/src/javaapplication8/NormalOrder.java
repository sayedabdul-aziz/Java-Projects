
package javaapplication8;

public class NormalOrder extends Order {
    private static String number = "0";

    public NormalOrder() {
        String Snum = NormalOrder.number;
        int num = Integer.valueOf(Snum);
        num++;
        NormalOrder.number = String.valueOf(num);
    }

    public static int getNumber_NormalOrder() {
        String Snum = NormalOrder.number;
        int num = Integer.valueOf(Snum);
        return num;
    }
    @Override
    public void confirm() {
        System.out.println("This Normal Order  " + NormalOrder.getNumber_NormalOrder() + "  has been confirmed");
        super.date();
    }
    @Override
    public void close() {
        System.out.println("All your Normal orders had been confirmed");
    }

    public void dispatch() {
        System.out.println("Usually,Your request will be received within 3 hours.  ");
    }

    public void receive() {
        System.out.println("Your all Normal requests will be sent one day after receiving it.");
    }
}
    
