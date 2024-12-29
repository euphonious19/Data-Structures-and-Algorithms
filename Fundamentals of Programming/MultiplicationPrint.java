import java.util.* ;

public class MultiplicationPrint {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number for writing it's multiplication table :");
        int num= sc.nextInt();
        for(int i=1; i<=10 ; i++){
            System.out.println(num + "*" + i + "=" + num*i);
        }
        System.out.println();
        
    }
    
}
