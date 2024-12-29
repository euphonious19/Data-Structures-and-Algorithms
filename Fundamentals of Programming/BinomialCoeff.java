import java.util.Scanner;

public class BinomialCoeff {
    public static int factCalcu(int n){
        int f=1;
        for(int i=1 ; i<=n ; i++){
            f= f*i ;
        }
        return f; //Fcatorial of n

    }
    public static int binomalCoeff(int n , int r){
        int n_fact = factCalcu(n) ;
        int r_fact = factCalcu(r) ;
        int n_r_fact = factCalcu(n-r) ;

        int biCoeff = n_fact/ (r_fact * n_r_fact) ;
        return biCoeff ;

    }
    
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        System.out.print("Enter r: ");
        int r=sc.nextInt();

        System.out.println("Binomial Coefficient : " + binomalCoeff(n, r));
        
    }
}
