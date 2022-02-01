import java.util.Scanner;

public class Question5 {
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number :- ");
        System.out.println("Factorial of Number is :- " + factorial(scanner.nextInt()));
    }
}
