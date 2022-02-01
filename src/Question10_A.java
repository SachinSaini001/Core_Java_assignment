import java.util.Scanner;

class Question10_A {
    void keyboard(String word) {
        int count = 0;
        while (!word.equals("done") && count == 0) {
            if (word.charAt(0) == word.charAt(word.length() - 1)) {
                System.out.println("First and last character are equals for the word");
            } else {
                System.out.println("First and last character are not equals for the word");
            }
            count += 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.next();
        Question10_A question7_a = new Question10_A();
        question7_a.keyboard(word);

    }
}