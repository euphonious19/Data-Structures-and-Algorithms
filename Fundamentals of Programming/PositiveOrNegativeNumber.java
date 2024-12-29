import java.util.Scanner;

public class PositiveOrNegativeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check whether it's positive or negative");
        int number=sc.nextInt();

        if(number>1){
            System.out.println("POSITIVE NUMBER");
        } else if(number==0){
            System.out.println("NEITHER POSITIVE NORE NEGATIVE");
        } else{
            System.out.println("NEGATIVE NUMBER");
        }
    }
    
}
