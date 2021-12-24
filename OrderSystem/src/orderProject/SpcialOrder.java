
package orderProject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SpcialOrder extends order{

    public SpcialOrder(String num) {
        super(num);
         date = LocalDateTime.now();
    }

    @Override
    void confirm() {
         System.out.println("Normal Order is Confirmed !");
    }

    @Override
    void close() {
         System.out.println("Thanks dear");
    }
    void send(){  

     DateTimeFormatter d = DateTimeFormatter.ofPattern("dd-MM-yyyy 'at' hh:mm:ss a");
     String str = d.format(date.plusMinutes(5));  
        System.out.println("The order is sending in : " +str);
    }
    
}
