package javaapplication8;
public class SpecialOrder extends Order {

    private static String number = "0";
    public SpecialOrder() {
        String Snum = SpecialOrder.number;
        int num = Integer.valueOf(Snum);
        num++;
        SpecialOrder.number = String.valueOf(num);
    }

    public static int getNumber_SpecialOrder() {
        String Snum = SpecialOrder.number;
        int num = Integer.valueOf(Snum);
        return num;
    }

    @Override
    public void confirm() {
        System.out.println("This Special Order  " + SpecialOrder.getNumber_SpecialOrder() + "  has been confirmed");
        super.date();
    }
    @Override
    public void close() {
        System.out.println("All your Special orders had been confirmed");
    }
    public void dispatch() {
        System.out.println("You will receive your all Special orders within 1 hour");

    }
}
