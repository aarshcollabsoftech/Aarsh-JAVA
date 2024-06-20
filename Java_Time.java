import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Java_Time {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);
      
        LocalDate d = LocalDate.now();
        System.out.println(d);
    }
}
