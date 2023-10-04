import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date nowDate = new Date();
        Calendar cal = Calendar.getInstance();

        SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd \nhh:mm");
        System.out.println(format.format(nowDate));

        System.out.println(cal.get(Calendar.YEAR)+"."+(cal.get(Calendar.MONTH)+1)+"."+cal.get(Calendar.DAY_OF_MONTH)+"\n" +
                cal.get(Calendar.HOUR)+":"+cal.get(Calendar.MINUTE));
    }
}