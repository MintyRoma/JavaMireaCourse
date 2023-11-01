import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Double> numbers = new Stack<>();

        String input = sc.nextLine();
        ArrayList<String> splitted = new ArrayList<>(Arrays.asList(input.split(" ")));
        for (String data:splitted) {
            try {
                if (data.equals("+") || data.equals("-") || data.equals("*") | data.equals("/"))
                {
                    double A = numbers.pop();
                    double B = numbers.pop();
                    switch (data)
                    {
                        case "+":
                            numbers.push(A+B);
                            break;
                        case "-":
                            numbers.push(B-A);
                            break;
                        case "*":
                            numbers.push(A*B);
                            break;
                        case "/":
                            numbers.push(B/A);
                            break;
                    }
                }
                else
                {
                    double number = Double.parseDouble(data);
                    numbers.push(number);
                }
            }
            catch (Exception ex) {
                System.out.println("Ошибка!");
                System.out.println(ex.getMessage());
                return;
            }
        }
        if (numbers.size()!=1)
        {
            System.out.println("Выражение составлено неверно!");
        }
        else {
            System.out.println("Результат: "+numbers.peek());
        }
    }
}