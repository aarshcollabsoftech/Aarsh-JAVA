import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class FinalPracticeSet {
    public static void main(String[] args) {
        

        // ------------- Q1
        ArrayList ar = new ArrayList<>();
        ar.add("Aarsh");
        ar.add("Rushit");
        ar.add("Deval");
        ar.add("Heer");
        ar.add("Vishal");
           ar.add("Tarun");
           for (int i = 0; i < ar.size(); i++) {
                System.out.println(ar.get(i));
           }

        // ------------Q5

           HashSet s = new HashSet<>();
           s.add(10);
           s.add(11);
           s.add(13);
           s.add(15);
           s.add(17);
           s.add(10);
           s.add(13);

           System.out.println(s);
        
        // -----------Q2

        Date d =new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

        //---------Q3 -->Q2 using calender class
            Calendar c =Calendar.getInstance();
            System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));   


        // -------Q4 ----> Q2 using TIME API
          LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy H:m a");
        String myDate = dt.format(df);
        System.out.println(myDate  );
    
    
    } 

}
