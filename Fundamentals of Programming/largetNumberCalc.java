import java.util.*;
public class largetNumberCalc {
    public static int getLargest(int numbers[]){
        int larget=Integer.MIN_VALUE ; // Initialization of larget with -infinity

        for(int i=0 ; i<numbers.length ; i++){
            if(larget < numbers[i]){
                larget=numbers[i];
            }
        }
        return larget ;
    }

    //Smallest number calc
    public static int getSmallest(int numbers[]){
        int smallest=Integer.MAX_VALUE; // to find smallest number  , initialization is done with +infinity

        for(int i=0 ; i<numbers.length ; i++){
            if(smallest > numbers[i]){
                smallest=numbers[i] ;
            }
        }
        return smallest ;
    }
    public static void main(String[] args) {
        int numbers[] = { 1 , 2, 6, 3, 5};

        System.out.println("Larget number : " + getLargest(numbers));
        System.out.println("Smallest number : " + getSmallest(numbers));
    }
    
}
