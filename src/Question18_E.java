interface MyInterface2 {
    default void defaultMethod() {
        System.out.println("default method");
    }
}

public class Question18_E implements MyInterface2 {
    public void defaultMethod() {
        System.out.println("override default method");
    }

    public static void main(String[] args) {
        Question18_D question18_d = new Question18_D();
        question18_d.defaultMethod();
    }
}