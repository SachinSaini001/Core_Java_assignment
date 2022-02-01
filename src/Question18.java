interface MyInterface {
    void display(int a, int b);
}

public class Question18 {

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void mul(int a, int b) {
        System.out.println(a * b);
    }

    public static void main(String[] args) {
        Question18 question18 = new Question18();
        MyInterface ref = question18::add;
        MyInterface ref1 = question18::mul;
        ref.display(2, 5);
        ref1.display(2, 5);
    }
}