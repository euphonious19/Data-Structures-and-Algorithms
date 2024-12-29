import java.util.Scanner;

public class linearSearch {
    public static int search(int nums [] , int target){
        for(int i=0; i<nums.length ;i++){
            if(nums[i] == target){
                return i ;
            }
        }
        return -1 ;
    }
    public static void main(String[] args) {
        int [] nums = {2,4, 14,29, 19,16,5,9,2,1,4} ;
        Scanner sc=new Scanner(System.in) ;
        System.out.print("Enter target : ");
        int target=sc.nextInt();

        int idx=search(nums, target);
        if(idx==-1){
            System.out.println("Element not found!");
        } else{
            System.out.println("Element founf at index : " + idx);
        }
        System.out.println("Array length: " + nums.length + ", Current index: " + idx);
        
    }
    
}
