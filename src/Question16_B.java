public class Question16_B implements Cloneable {
    String name;
    int id;

    // constructor
    Question16_B(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            Question16_B s1 = new Question16_B("Sachin", 12345);
            Question16_B s2 = (Question16_B) s1.clone();
            System.out.println("Employee Name :- " + s1.name + "  and Id is  " + s1.id);
            System.out.println("Employee Name :-  " + s2.name + "  and Id is  " + s2.id);
        } catch (CloneNotSupportedException c) {
            c.printStackTrace();
        }
    }
}
