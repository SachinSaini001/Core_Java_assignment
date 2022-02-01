interface MyInterface3 {
    default void defaultMethod() {
        System.out.println("Default Method");
    }

    interface MyInterface4 {
        default void defaultMethod() {
            System.out.println("Default Method 2");
        }
    }

    class Question18_F implements MyInterface3, MyInterface4 {
        public void defaultMethod() {
            MyInterface3.super.defaultMethod();
            MyInterface4.super.defaultMethod();
        }

        public static void main(String[] args) {
            Question18_F question18_f = new Question18_F();
            question18_f.defaultMethod();

        }


    }
}