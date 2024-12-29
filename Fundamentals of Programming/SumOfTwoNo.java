import java.util.Scanner;

public class SumOfTwoNo{
    public static void main(String[] args) {
        //Code to calculate sum  : single line comment 

        /* 

        int a =10;
        int b=5 ;
        int sum=a+b;
        System.out.println("Sum of two number :"  + sum);

        */

        //Taking input from users and printing it's sum

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1=sc.nextInt();

        System.out.print("Enter num2 : ");
        int num2=sc.nextInt();

        int sum= num1+num2 ;
        System.out.println("Sum of num1 and num2 : " + sum);
    }
}