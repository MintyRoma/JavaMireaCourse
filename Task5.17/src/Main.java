import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(RecursiveMax());
    }

    private static int RecursiveMax() {
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        if(digit==0) return 0;
        int next = RecursiveMax();
        return next>digit?next:digit;
    }
}