import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        for(int line=1 ; line<= n ; line++){
            for (int hp=1; hp<=line ; hp++){
                System.out.print(hp);
            }
            System.out.println();
        }
        
    }
    
}
