interface MyInterface1 {
    default void defaultMethod() {
        System.out.println("default method");
    }

    static void staticMethod() {
        System.out.println("static method");
    }
}

public class Question18_D implements MyInterface1 {
    public static void main(String[] args) {
        Question18_D question18_d = new Question18_D();
        question18_d.defaultMethod();
        MyInterface1.staticMethod();
    }
}