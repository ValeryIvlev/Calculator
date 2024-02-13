import java.io.BufferedReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите математическое выражение из двух числ, например: 2 + 2 ");
        System.out.println("Поддерживаемые операции: +, -, *, /, ^, %");
        String mathFrom = sc.nextLine().strip();

        calculator.result(mathFrom);

    }
}
