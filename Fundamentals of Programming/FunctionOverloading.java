import java.util.Scanner;

public class FunctionOverloading {  //Uisng different number of parameters
    public static int sum(int a , int b){
        return a+b;
    }
    public static int sum(int a , int b , int c){
        return a+b+c ;
    }
/* 
    public static float sum(float a , float b){
        return a+b ;
    }
*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        System.out.print("Enter a :");
        int a=sc.nextInt(); // float a =sc.nextInt();  
        System.out.print("Enter b : ");
        int b=sc.nextInt(); // float b=sc.nextInt() ;
        System.out.print("Enter c: ");
        int c=sc.nextInt();

        System.out.println("Sum of 2 numbers:" + sum(a, b));
        System.out.println("Sum of 3 numbers: " + sum(a, b , c));
        // System.out.println("Sum of 2 numbers using Fun overloading of different data types : " + sum(a, b));
        
    }
    
}
