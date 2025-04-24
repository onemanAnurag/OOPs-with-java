import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers");
    int num1 = input.nextInt();
    int num2 = input.nextInt();
        //   int[] a = new int[5];
//        System.out.println("Hello");
//        System.out.println(a[3]);
//        System.out.println(a[8]);
//        System.out.println("Hello wveryone");
        try{
            int[] a = new int[5];

            int res = num1/num2;
            System.out.println(a[6]);


        }
        catch(ArithmeticException e){
            System.out.println("Oops! Something went wrong: "+e.getMessage());
        }
        catch(Throwable th){
            System.out.println("General Exception");
        }
        finally {
            System.out.println("This is the finally block");
        }
    }
}
