import java.util.*;
public class PassFailUsingTernary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();

        String reportCard= (marks >=33) ? "PASS" : "FAIL" ;
        System.out.println(reportCard);
    }
    
}
