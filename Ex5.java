import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter The Value Of Q->");
        int q=input.nextInt();
        System.out.println("Enter The Value Of Y->");
        int y=input.nextInt();
        q=q*y;
        y=q/y;
        q=q/y;
        System.out.println("The q is");
        System.out.println(q);
        System.out.println("The  Y is");
        System.out.println(y);
    }
}
