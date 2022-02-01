import java.util.Scanner;

public class Question1 {
    public static boolean stringChecker(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'p' && str.charAt(i + 2) == 'p')
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String ");
        System.out.println(stringChecker(scanner.nextLine()) + " P-P is present in that String");

    }
}