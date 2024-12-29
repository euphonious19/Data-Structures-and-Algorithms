import java.util.* ;
public class binarySearch {
    public static int search(int numbers[] , int target){
        int start=0;
        int end=numbers.length -1 ;

        while(start <= end ){
            int mid= (start+end) / 2 ;
            //comparisons
            if(numbers[mid] == target ){
                return mid ;
            }
            if(numbers[mid] < target){ //right half
                start=mid+1 ;
                
            } else {
                //left half 
                end=mid -1 ;
            }
        }
        return -1 ;

    }
    public static void main(String[] args) {
        int[] numbers={2, 4, 6,8,10,12,14};
        int key=10;

        System.out.println("Index for target : " + search(numbers, key));
        
    }
    
}
