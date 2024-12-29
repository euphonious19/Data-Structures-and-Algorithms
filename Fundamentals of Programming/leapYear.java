import java.util.*;
public class leapYear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year= sc.nextInt();

        // USING CONDITIONAL STATEMENTS 
/*
        if(year % 4 == 0 ){
            System.out.println("LEAP YEAR");
        } else if ( year % 100 != 0){
            System.out.println("LEAP YEAR");
        } else if(year % 400 == 0){
            System.out.println("LEAP YEAR");
        }
        else {
            System.out.println("NOT A LEAP YEAR");
        }

*/
        String leapYearCheck = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ) ? "LEAP YEAR" : "NOT A LEAP YEAR " ;
        System.out.println(leapYearCheck);
    }

    
}
