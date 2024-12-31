import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[]={1,2,5,10,20, 50,100, 500,2000};
        Arrays.sort(coins , Comparator.reverseOrder()); // For this Integer class object need to be present
        int countOfCoins=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter amount: ");
        int amount =sc.nextInt();

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<coins.length ; i++){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    countOfCoins++ ;
                    ans.add(coins[i]);
                    amount = amount - coins[i];
                }
            }
        }
        System.out.println("Total minimum coins used : " + countOfCoins);

        // Printing coins/notes used
        for(int i=0;i<ans.size() ; i++){
            System.out.print(ans.get(i)+ " ");
        }
        System.out.println();
    }
}
