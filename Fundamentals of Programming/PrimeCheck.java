import java.util.Scanner;

public class PrimeCheck {

    public static boolean isPrime(int n){
    /*
        boolean isPrime = true ;
        for (int i=2 ; i<=n-1 ; i++){
            if(n % i== 0){ //Completely dividing
                isPrime = false ;
                break ;
            }
        }
        return isPrime ;
    }
        
    */

    /* 
     // only for n>2
        // Corner Case 
        if(n==2 ){
            return true ;
        }
        for (int i=2 ; i<=n-1 ; i++){
             if(n % i== 0){ //Completely dividing
                return false ;
             }
        }
        return true ;
    }
    */

    // Optimized method 
         if(n== 2){
            return true ;
         }

         for(int i=2 ; i<=Math.sqrt(n) ; i++){
            if(n % i == 0){
               return false ;
            }
         }
         return true ;
        }
        

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();

        System.out.println(isPrime(n));
        
    }

    
}
