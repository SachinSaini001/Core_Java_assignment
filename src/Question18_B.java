interface EmployeeEmpty {
    Question18_B_Employee get();
}

interface EmployeeWithName {
    Question18_B_Employee get(String name);
}

class Question18_B_Employee {
    private String name;

    Question18_B_Employee() {
        System.out.println("Empty Constructor");
    }

    Question18_B_Employee(String name) {
        System.out.println("Name Constructor");
        this.name = name;
    }

    public String toString() {
        return "name: " + name;
    }

    public static void main(String[] args) {
        EmployeeEmpty empEmpty = Question18_B_Employee::new;
        System.out.println("Reference-1");
        System.out.println(empEmpty.get());

        EmployeeWithName empWithName = Question18_B_Employee::new;
        System.out.println("Reference-2");
        System.out.println(empWithName.get("Sachin"));

    }
}
