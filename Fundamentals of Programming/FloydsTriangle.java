import java.util.Scanner;

public class FloydsTriangle {
    public static void floyds_Triangle(int n ){
        int counter=1; // Counter keep on increasing 
        //Outer Loop :-> Total number of lines
        for(int i=1 ; i<=n ; i++){
            //Inner Loop :-> How many times we have to print counter
            for (int j=1 ; j<=i ; j++){
                System.out.print(counter + " ");
                counter++ ;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();

        floyds_Triangle(n);
        
    }
    
}
