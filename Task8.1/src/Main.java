import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Date is deprecated. Maybe better to use Calendar instead

        final String name = "Roma";
        final Date created = new Date();
        created.setMonth(Calendar.SEPTEMBER);
        created.setDate(20);
        created.setYear(2023);

        System.out.println("Executor: "+ name +"\n"+
                "Task presented: "+created +"\n" +
                "Completed: "+ new Date());
    }
}