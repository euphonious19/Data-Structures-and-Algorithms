import java.util.Scanner;

public class Print1To10Number {
    public static void main(String[] args) {
        /* int count=1;
        while(count<=10){
            System.out.println(count);
            count++ ;
        }
        */ 
        int count =1 ;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number till when you want to print the number: " + " ");
        int range = sc.nextInt();

        while(count <= range){
            System.out.print( " " + count);
            count++ ;
        }
    }
    
}
