import java.util.Scanner;

public class Question4 {
    static String reverseString(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));

        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String Which you want to reverse :- ");
        System.out.println("Reversed String is :- " + reverseString(scanner.nextLine()));
    }
}
