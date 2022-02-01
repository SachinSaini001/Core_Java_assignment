public class Question17 {

    static  void check_exception(int []arr, int n ){
        try{
            n= n /0;
            System.out.println(arr[10]);
        }
        catch(ArithmeticException e){
            System.out.println("Exception! Can't divide by zero");
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception! Array index out of bound");
        }
        finally {
            System.out.println("Finally block");
        }

    }
    public static void main (String[] args) {
        int []arr = {1,2,3,4,5};
        int n =10;
        check_exception(arr,n);
    }
}