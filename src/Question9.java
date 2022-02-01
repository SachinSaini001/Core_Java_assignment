abstract class Bank {
    abstract void getDetails();
}

class SBI extends Bank {
    void getDetails() {

        String Bank_name = "SBI Bank";
        float rate_of_interest = 10.2f;

        System.out.println("Bank name :" + Bank_name);
        System.out.println("Rate of Interest :" + rate_of_interest);
    }
}

class BOI extends Bank {
    void getDetails() {
        String Bank_name = "BOI Bank";
        float rate_of_interest = 10.0f;

        System.out.println("Bank name :" + Bank_name);
        System.out.println("Rate of Interest :" + rate_of_interest);
    }
}

class ICICI extends Bank {
    void getDetails() {

        String Bank_name = "ICICI Bank";
        float rate_of_interest = 9.0f;

        System.out.println("Bank name :" + Bank_name);
        System.out.println("Rate of Interest :" + rate_of_interest);
    }
}

public class Question9 {
    public static void main(String[] args) {

        Bank b_sbi = new SBI();
        b_sbi.getDetails();

        System.out.println("----------------------------------------");

        Bank b_boi = new BOI();
        b_boi.getDetails();

        System.out.println("----------------------------------------");

        Bank bankIc = new ICICI();
        bankIc.getDetails();
    }
}