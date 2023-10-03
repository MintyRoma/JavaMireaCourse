import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Enter date as \"DD MM YYYY\":");
        input = scanner.nextLine();

        SimpleDateFormat formater = new SimpleDateFormat("dd MM yyyy");
        try {
            Date selected = formater.parse(input);
            Date now = new Date();
            long delta = Math.abs(selected.getTime()-now.getTime());
            long days = TimeUnit.MILLISECONDS.toDays(delta);
            System.out.println("Days: " + days);
        }
        catch (Exception e)
        {
            System.out.println("Error: "+e.getMessage());
        }

    }
}