import java.util.Scanner;

public class Question22 {
    public static void check(int num) {
        int sum = 0, digit;
        int length = String.valueOf(num).length();
        if (length == 9) {
            while (num > 0) {
                digit = num % 10;
                sum = sum + digit;
                num = num / 10;
            }
            System.out.println("Sum of digit of card number : " + sum);
            if (sum % 10 == 0)
                System.out.println("OKAY");
            else
                System.out.println(" NOT OKAY");
        } else
            System.out.println("You have exceed the digit. Try Again! ");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 9 digit number to check : ");
        int num = scanner.nextInt();
        check(num);
    }
}
