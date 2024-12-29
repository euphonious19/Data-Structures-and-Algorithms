import java.util.Scanner;

public class InvertedStarPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n :");
        int n=sc.nextInt();
        for(int line=1 ; line<=n; line++){
            for(int invertedStar=1 ; invertedStar<=(n-line+1) ; invertedStar++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
