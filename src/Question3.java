import java.util.Scanner;

public class Question3 {
    static String removeCharacter(String str, char ch) {
        StringBuilder stringBuffer = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (ch != str.charAt(i)) {
                stringBuffer.append(str.charAt(i));
            }
        }
        return stringBuffer.toString();

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String and a Character you want to remove :- ");
        System.out.println("After remove that character your String is :- " + removeCharacter(scanner.nextLine(), scanner.next().charAt(0)));
    }
}
