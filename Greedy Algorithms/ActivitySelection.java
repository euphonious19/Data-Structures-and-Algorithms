import java.util.*;
public class ActivitySelection { //TC : O(n)
    public static void main(String[] args) {
        // Activities sorted on the basis of end time
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};

        int maxAct=0; //count
        ArrayList <Integer> ans = new ArrayList<>(); // to store activity idx

        maxAct =1 ; //first activity is always selected because it finishes the earliest
        ans.add(0); //first acativity added in the ans
        int lastEnd=end[0]; // Last ending time

        for(int i=1 ; i<end.length ;i++){
            if(start[i]>= lastEnd){
                //activity select
                maxAct++ ;
                ans.add(i); //ith acitivity added to my ans
                lastEnd=end[i]; //Updating last end
            }
        }
        System.out.println("Maximum  activities: " + maxAct);

        for(int i=0; i<ans.size();i++){
            System.out.print("A"+ans.get(i) + " ");
        }
        System.out.println();
    }
}