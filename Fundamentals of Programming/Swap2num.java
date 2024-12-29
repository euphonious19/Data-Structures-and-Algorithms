public class Swap2num {
    public static void swap(int a , int b){
         //SWap 
         int temp=a ;
         a=b;
         b=temp;

         System.out.println("a: " + a);
         System.out.println("b: " +b);


    }
    public static void main(String[] args) {

        // Value exchanges : Swap 
        int a=5 , b=10;
/*
        //SWap 
        int temp=a ;
         a=b;
         b=temp;

         System.out.println("a: " + a);
         System.out.println("b: " +b);
*/
        swap(a, b);
    }
    
}
