class Singleton {

    private static Singleton singleton = null;
    public String st;

    private Singleton() {
        st = "singleton class.";
    }

    public static Singleton getInstance() {

        if (singleton == null)
            System.out.println("Object initialization");
        singleton = new Singleton();
        return singleton;
    }
}

class Question15 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        System.out.println("String s1 = " + singleton.st);
        System.out.println("String s2 =" + singleton1.st);
    }
}

