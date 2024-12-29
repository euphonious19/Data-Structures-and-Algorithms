import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();

        if(n==2){
            System.out.println("n is prime");
        } else {
            boolean isPrime=true ;

        // for(int i=2 ; i<=n-1 ; i++ ){
        for(int i=2 ; i<=Math.sqrt(n) ; i++ ){
            if(n % i == 0){ // n is a multiple of i(i is not equal to 1 and i)
                isPrime = false ;
            }
        }
        if(isPrime == true){
            System.out.println("n is prime");
        } else {
            System.out.println("n is not prime");
        }
        }

        
    }
    
}
