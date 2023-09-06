import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long data = scanner.nextLong();
        System.out.println(reverse(data,0));
    }

    public static long reverse(long number, long res)
    {
        if(number==0) return res;
        long digit = number%10;
        return reverse(number/10, res*10+digit);
    }
}