public class Question16 {
    int x;
    int y;

    Question16(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public void show() {
        System.out.println("Cloned Content x Value  " + x);
        System.out.println("Cloned Content y Value  " + y);
    }

    Question16(Question16 constructor) {
        this.x = constructor.x;
        this.y = constructor.y;
    }

    public static void main(String[] args) {
        Question16 constructor = new Question16(10, 20);
        constructor.show();
        Question16 constructor1 = new Question16(constructor);
        constructor1.show();

    }
}

