import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Student a = new Student(1,"Alex", "Timberlake", 10, sdf.parse("2005-12-03"));
            Student b = new Student(2,"Daniel", "Akigo", 8, sdf.parse("2009-05-17"));
            Student c = new Student(3,"Rimma", "Akaryan", 10, sdf.parse("2002-01-22"));

            System.out.println(a.toString(Student.DateType.LONG));
            System.out.println(b.toString(Student.DateType.DEFAULT));
            System.out.println(c.toString(Student.DateType.SHORT));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}