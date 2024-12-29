import java.util.Scanner;

public class ConversionOfRupeesIntoPaise{
    public static int rsToPaise(int rs){
        int paise = rs*100 ;
        return paise;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter amount you want to convert into paise : ");
        int rs=sc.nextInt();

        int paise=rsToPaise(rs);

        System.out.println("Rupees to Paise : " + paise );
       
        


    }
}