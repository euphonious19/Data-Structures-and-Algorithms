import java.util.Scanner;

public class AreaAndCircumferenceOfCircleCalc {

    public static float areaCal(float r){
        float area=3.14f * r * r ;
        return area;
    }

    public static float circumferenceCal(float r){
        float circumf = 2* 3.14f * r ;
        return circumf ;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter r : ");
        float r = sc.nextInt() ;

        System.out.println("Area of circle : " + areaCal(r));
        System.out.println("Circumference of circle : " + circumferenceCal(r));  
    }  
}
