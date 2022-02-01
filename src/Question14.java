public class Question14 {
    public static void main(String[] args) {
        try {
            Class<?> loadClass = Class.forName("java.lang.StringF");
            System.out.println("class loaded Successfully "+loadClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

