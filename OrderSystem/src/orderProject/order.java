
package orderProject;
import java.time.LocalDateTime;
public abstract class order {
   LocalDateTime date ;
   String number ;

    public order(String num) {
     number = num ;
     date = LocalDateTime.now();
    }
   
   abstract void confirm();
   abstract void close();
}
