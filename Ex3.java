import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter The Length is");
        int length=input.nextInt();
        System.out.println("Enter The Width is");
        int w=input.nextInt();
        int area=length*w;
        System.out.println("The Area is"+area);
    }
}
