import java.util.Scanner;

public class FunctionMethods {
    public static void printHelloWorld(){
        System.out.println("Hello World");
        return ;
    }
    /*
     public static void calculateSum(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");
        int a= sc.nextInt();
        System.out.print("Enter b: ");
        int b=sc.nextInt();

        int sum=(a+b) ;

        System.out.println("Sum of 2 Numbers a and b : " + sum);
        

    } */

    /* public static void sumCalcu(int num1 , int num2){
        int sum = num1 + num2 ;
         System.out.println("Sum of 2 Numbers a and b : " + sum);

    } */

    //returning int value 
    public static int calSum(int num1, int num2){ // num1 , num2 are parameters or formal parameters
        int sum = num1 + num2 ;
        return sum;
    }

    public static void main(String[] args) {
       //  printHelloWorld(); // function call
       //  calculateSum(); // Function call
/*
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");
        int a= sc.nextInt();
        System.out.print("Enter b: ");
        int b=sc.nextInt();

        // sumCalcu(a, b);
*/      
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter num1: ");
       int num1= sc.nextInt();
       System.out.print("Enter num2: ");
       int num2=sc.nextInt();
       System.out.println("Sum: " + calSum(num1, num2)); //  num1 and num2 are actual parameters or arguments
        
    }
    
}
