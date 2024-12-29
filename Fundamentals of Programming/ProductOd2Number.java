import java.util.Scanner;

public class ProductOd2Number {
    public static int prod(int a , int b){
        int prod=a*b ;
        return prod;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.println("Product of 2 numbers : " + prod(a, b));
        
    }
    
}
