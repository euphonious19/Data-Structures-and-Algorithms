import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int number=sc.nextInt();

        int larger=(a>b) ? a : b;
        System.out.println(larger);

        String type= ((number %2) == 0) ? "Even" : "Odd" ;
        System.out.println(type);
    }
    
}
