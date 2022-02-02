class EmpDetail {
    private Employee[] detail;

    public void setDetail(Employee[] detail) {
        this.detail = detail;
    }

    public Employee[] getDetail() {
        return detail;
    }
}

class Employee {
    final private long EmpId;
    final private String EmpName;
    final private String EmpDesignation;

    public Employee(long EmpId, String EmpName, String EmpDesignation) {
        this.EmpId = EmpId;
        this.EmpName = EmpName;
        this.EmpDesignation = EmpDesignation;
    }

    public long getEmpId() {
        return EmpId;
    }

    public String getEmpName() {

        return EmpName;
    }

    public String getEmpDesignation() {

        return EmpDesignation;
    }
}

class Question21 {
    public static void main(String[] args) {
        EmpDetail emp = new EmpDetail();
        Employee[] obj = new Employee[4];
        obj[0] = new Employee(1564, "Sachin", "SDE");
        obj[1] = new Employee(1658, "Sachin1", "INTERN");
        obj[2] = new Employee(1895, "Alex", "SDE2");
        obj[3] = new Employee(1647, "Carry", "SDE");
        emp.setDetail(obj);
        Employee[] emp1 = emp.getDetail();
        for (Employee employeeDetail : emp1) {
            System.out.println("Name --> " + employeeDetail.getEmpName() + "\n"
                    + "Employee ID --> " + employeeDetail.getEmpId() + "\n"
                    + "Designation --> " + employeeDetail.getEmpDesignation());
        }
    }
}