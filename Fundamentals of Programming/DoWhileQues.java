import java.util.* ;
public class DoWhileQues {
    public static void main(String[] args) {
        /*
        int count=1;
        do{
            System.out.println("YOU ARE SO STRONG!");
            count++ ;
        } while(count <=10 );

        */
         /* Scanner sc=new Scanner(System.in);

        do{ 
            System.out.print("Enter n: ");
            int n=sc.nextInt();
            if(n % 10 == 0){
                break ;
            }
            System.out.println(n);

        } while(true);
         */
        /* for(int i=1 ; i<=5 ; i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
        */
        // Display all numbers entered by user except multiple of 10
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("Enter the number:");
            int n=sc.nextInt();

            if( n % 10 == 0){
                continue ;
            }
            System.out.println("Number was : "+n);
        } while(true) ;
    }
}
