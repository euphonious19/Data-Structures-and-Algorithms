import java.util.*;
public class ConditionalStatements{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age= sc.nextInt();
        System.out.println("Enter age:" + age);
        if(age>=18){
            System.out.println("Vote");
        } else{
            System.out.println("Can't Vote");
        }
    }
        
}