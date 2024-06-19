import java.util.Date;

public class DateAndTime{
    public static void main(String[] args) {
               System.out.println(System.currentTimeMillis()/1000/3600/24/365);
               // Quiz if we can save current data & time using currentmillis in long 
               System.out.println(Long.MAX_VALUE);
                System.out.println(System.currentTimeMillis());
                System.out.println("*********************************");
                Date d =new Date();
                System.out.println(d);
                System.out.println(d.getTime());
                System.out.println(d.getDate());
                System.out.println(d.getMonth());
                System.out.println(1900+d.getYear());
                System.out.println(d.getHours());
                System.out.println(d.getMinutes());
                System.out.println(d.getSeconds());
 
 
            }
}
