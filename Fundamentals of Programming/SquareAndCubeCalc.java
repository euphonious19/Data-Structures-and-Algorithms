import java.util.Scanner;

public class SquareAndCubeCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to  calculate it's square : ");
        int n=sc.nextInt();
        
        int square=n*n ;
        System.out.println("Square : " + square);

        System.out.print("Enter a number to  calculate it's cube : ");
        int m=sc.nextInt();
        

        int cube=m*m*m ;
        System.out.println("Cube : " + cube);
    }
    
}
