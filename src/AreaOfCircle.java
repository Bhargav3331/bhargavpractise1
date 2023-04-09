import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the radius of Circle");
        double r = s.nextDouble();
        double area = (22*r*r)/7;
        System.out.println("The area of Circle is : " + area);
    }
}