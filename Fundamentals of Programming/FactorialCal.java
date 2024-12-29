import java.util.Scanner;

public class FactorialCal {
    public static int factCalcu(int n){
        int f=1;
        for(int i=1 ; i<=n ; i++){
            f= f*i ;
        }
        return f; //Fcatorial of n

    }
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();

        System.out.println("Factorial of n : " + factCalcu(n));

    }
    
}
