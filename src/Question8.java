public class Question8 {

    static String First_Name;
    static String Last_Name;
    static int Age;


    static String First_name = "Sachin";
    static String Last_name = "Singh";
    static int age = 23;


    //static block
    static {
        System.out.println("print by static block -------");
        First_Name = "Sachin";
        Last_Name = "Kumar";
        Age = 24;
    }


    //static method
    public static void print(String f_name, String l_name, int age) {
        System.out.println("print by static Method-------");

        System.out.println("First name : " + f_name + "\n" + "Last name : " + l_name + "\n" + "age : " + age);

    }

    public static void main(String[] args) {

        //by static block
        System.out.println("First Name : " + First_Name + "\n" + "Last Name : " + Last_Name + "\n" + "Age : " + Age + "\n");


        //by static variable
        System.out.println("print by static variable -------");
        System.out.println("First name : " + First_name + "\n" + "Last name : " + Last_name + "\n" + "age : " + age + "\n");


        //by static method
        print("Sachin", "S", 21);

    }
}