package DateAndTime;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
public class ate11 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        
        DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
        String newDate = df.format(date);
        System.out.println(newDate);
        
        LocalTime time = LocalTime.now();
        System.out.println(time);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss");
        String newTime = time.format(dtf);
        System.out.println(newTime);
        
        
    }
}
