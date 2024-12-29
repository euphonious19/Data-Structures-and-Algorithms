import java.util.*;
// Print subarrays and total subarrays 
public class SubarraysPrint {
    public static void printSybarrays(int numbers[]){
        int ts=0;
        for(int i=0 ; i<numbers.length ; i++){
            int start =i;
            for(int j=i ; j<numbers.length ; j++){
                int end=j;
                for(int k=start; k<=end ; k++ ){
                    System.out.print(numbers[k] +" ");
                }
                System.out.println();
                ts++ ;
            }
            System.out.println();
        }
        System.out.println("Total subarrays: " + ts);

    }
    public static void main(String[] args) {
        int numbers []={2, 4, 6, 8, 10};
        printSybarrays(numbers);
        
    }
    
}
