import java.util.Scanner;

public class SumOfNaturalNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n : "); // till n we want to calculate the sum
        int n=sc.nextInt();

        int sum=0 ;
        int i=1;

        while(i<= n){
            sum += i;
            i++ ;
            
        }
        System.out.println("SUM : " +  sum);
    }
    
}
