import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double r,area ,pi=3.14;
        System.out.println("Enter The r");
       r=input.nextDouble();
        area=r*r*pi;
        System.out.println("The area is "+area);

    }
}
