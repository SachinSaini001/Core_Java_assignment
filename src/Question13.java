import java.util.Scanner;

interface Library {
    void Registration();
    void RequestBook();
    void FeedBack();
    void BookInformation();
}
 class LibraryManagement implements Library {

     String name, email, address, bookName, feedBack;
     int bookID;
     long phoneNum;
     public static final int Max_Book_Issued = 5;
     public static final int Max_lending_Days = 10;

     @Override
     public void Registration() {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter you name : ");
         name = sc.nextLine();
         System.out.println("Enter your email address : ");
         email = sc.nextLine();
         System.out.println("Enter you Phone Number : ");
         phoneNum = sc.nextInt();
     }

     @Override
     public void RequestBook() {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Book name : ");
         bookName = sc.nextLine();
         System.out.println("Enter Book ID : ");
         bookID = sc.nextInt();
         switch (bookID) {
             case 1 -> {
                 System.out.println("Book issued : " + bookName + ", with Book ID : " + bookID + "\n");
                 System.out.println("Return the book with in : " + Max_lending_Days + " days" + "\n");
                 System.out.println("After " + Max_lending_Days + " days you will be charge Rs. 50 /- per day ");
             }
             case 2 -> {
                 System.out.println("Book issued : " + bookName + "with Book ID : " + bookID + "\n");
                 System.out.println("Return the book with in : " + Max_lending_Days + " days" + "\n");
                 System.out.println("After " + Max_lending_Days + " days you will be charge Rs. 50 /- per day ");
             }
             case 3 -> {
                 System.out.println("Book issued : " + bookName + "with Book ID : " + bookID + "\n");
                 System.out.println("Return the book with in : " + Max_lending_Days + " days" + "\n");
                 System.out.println("After " + Max_lending_Days + " days you will be charge Rs. 150 /- per day ");
             }
             case 4 -> {
                 System.out.println("Book issued : " + bookName + "with Book ID : " + bookID + "\n");
                 System.out.println("Return the book with in : " + Max_lending_Days + " days" + "\n");
                 System.out.println("After " + Max_lending_Days + " days you will be charge Rs. 250 /- per day ");
             }
             case 5 -> {
                 System.out.println("Book issued : " + bookName + "with Book ID : " + bookID + "\n");
                 System.out.println("Return the book with in : " + Max_lending_Days + " days" + "\n");
                 System.out.println("After " + Max_lending_Days + " days you will be charge Rs. 350 /- per day ");
             }
             case 6 -> {
                 System.out.println("Book issued : " + bookName + "with Book ID : " + bookID + "\n");
                 System.out.println("Return the book with in : " + Max_lending_Days + " days" + "\n");
                 System.out.println("After " + Max_lending_Days + " days you will be charge Rs. 1500/- per day ");
             }
             case 7 -> {
                 System.out.println("Book issued : " + bookName + "with Book ID : " + bookID + "\n");
                 System.out.println("Return the book with in : " + Max_lending_Days + " days" + "\n");
                 System.out.println("After " + Max_lending_Days + " days you will be charge Rs. 450 /- per day ");
             }
             case 8 -> {
                 System.out.println("Book issued : " + bookName + "with Book ID : " + bookID + "\n");
                 System.out.println("Return the book with in : " + Max_lending_Days + " days" + "\n");
                 System.out.println("After " + Max_lending_Days + " days you will be charge Rs. 550 /- per day ");
             }
             case 9 -> {
                 System.out.println("Book issued : " + bookName + "with Book ID : " + bookID + "\n");
                 System.out.println("Return the book with in : " + Max_lending_Days + " days" + "\n");
                 System.out.println("After " + Max_lending_Days + " days you will be charge Rs. 650 /- per day ");
             }
             case 10 -> {
                 System.out.println("Book issued : " + bookName + "with Book ID : " + bookID + "\n");
                 System.out.println("Return the book with in : " + Max_lending_Days + " days" + "\n");
                 System.out.println("After " + Max_lending_Days + " days you will be charge Rs. 750 /- per day ");
             }
             case 11 -> {
                 System.out.println("Book issued : " + bookName + "with Book ID : " + bookID + "\n");
                 System.out.println("Return the book with in : " + Max_lending_Days + " days" + "\n");
                 System.out.println("After " + Max_lending_Days + " days you will be charge Rs. 850 /- per day ");
             }
             case 12 -> {
                 System.out.println("Book issued : " + bookName + "with Book ID : " + bookID + "\n");
                 System.out.println("Return the book with in : " + Max_lending_Days + " days" + "\n");
                 System.out.println("After " + Max_lending_Days + " days you will be charge Rs. 1000/- per day ");
             }
             case 13 -> {
                 System.out.println("Book issued : " + bookName + "with Book ID : " + bookID + "\n");
                 System.out.println("Return the book with in : " + Max_lending_Days + " days" + "\n");
                 System.out.println("After " + Max_lending_Days + " days you will be charge Rs. 950 /- per day ");
             }
             case 14 -> {
                 System.out.println("Book issued : " + bookName + "with Book ID : " + bookID + "\n");
                 System.out.println("Return the book with in : " + Max_lending_Days + " days" + "\n");
                 System.out.println("After " + Max_lending_Days + " days you will be charge Rs. 500 /- per day ");
             }
         }
     }

     @Override
     public void FeedBack() {
         Scanner sc = new Scanner(System.in);
         System.out.println("Please give feedback : ");
         feedBack = sc.next();
         if ( feedBack != null)
             System.out.println("THANK YOU");
         else
             System.out.println("Please give your valuable feedback. ");
     }

     @Override
     public void BookInformation() {
         System.out.println("Maximum book can be issued : " + Max_Book_Issued);
         System.out.println("Total number of books are : ");
         System.out.println(" Harry’S COMPLAINT - Book ID --> 1 ");
         System.out.println(" The Great Gatsby - Book ID --> 2 ");
         System.out.println(" Don Quixote - Book ID --> 3 ");
         System.out.println(" One Hundred Years of Solitude - Book ID --> 4 ");
         System.out.println(" Invisible Man - Book ID --> 5 ");
         System.out.println(" One Night at Call Center - Book ID --> 6 ");
         System.out.println(" War and Peace - Book ID --> 7 ");
         System.out.println(" Hamlet by William Shakespeare - Book ID --> 8 ");
         System.out.println(" The Color Purple - Book ID --> 9 ");
         System.out.println(" Madame Bovary - Book ID --> 10 ");
         System.out.println(" The Divine Comedy - Book ID --> 11 ");
         System.out.println(" Lolita - Book ID --> 112 ");
         System.out.println(" The Brothers Karamazov - Book ID --> 13 ");
         System.out.println(" Crime and Punishment - Book ID --> 14 ");

     }
 }
 class Main {
     public static void main(String[] args) {
         System.out.println("Press 1 to check availability : ");
         System.out.println("Press 2 to issue book : ");
         System.out.println("Press 3 for give feedback : ");
         System.out.println("Press 4 to exit : ");
         Scanner sc = new Scanner(System.in);
         int choice = sc.nextInt();
         switch (choice) {
             case 1 -> {
                 LibraryManagement lm1 = new LibraryManagement();
                 lm1.BookInformation();
             }
             case 2 -> {
                 LibraryManagement lm2 = new LibraryManagement();
                 lm2.Registration();
                 lm2.RequestBook();
             }
             case 3 -> {
                 LibraryManagement lm3 = new LibraryManagement();
                 lm3.FeedBack();
             }
             case 4 -> System.out.println("Thank You");
         }
     }
 }