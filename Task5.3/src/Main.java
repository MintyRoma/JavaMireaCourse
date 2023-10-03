import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = 0 ,B=0;
        A = scanner.nextInt();
        B = scanner.nextInt();
        Reprint(A,B);
    }

    public static void Reprint(int start, int target)
    {
        System.out.println(start);
        if(start==target) return;
        if (start<target) Reprint(start+1, target);
        else Reprint(start-1,target);
    }
}