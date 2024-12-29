import java.util.* ;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to calculate it's factorial: ");
        int num = sc.nextInt();
        int factorial = 1 ; // base condition 
        for(int i=1 ; i<= num ; i ++ ){
            factorial *= i ;
        }
        System.out.println("Factorial : " + factorial);

    }
    
}
