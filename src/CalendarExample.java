import java.text.ParseException;
import java.time.Instant;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class CalendarExample {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2021-01-24T12:03:02Z"));

        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        int minutes = cal.get(Calendar.MINUTE);
        int month = 1 + cal.get(Calendar.MONTH);

        System.out.println("Minutes: " + minutes);
        System.out.println("Month: " + month);
    }
}
