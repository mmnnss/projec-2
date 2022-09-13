import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter The m ->");
        int m=input.nextInt();
        System.out.println("Enter The d ->");
        int d=input.nextInt();
        System.out.println("Enter The a ");
        int a=input.nextInt();
        int r;
        r=(m+d+a)/3;
        System.out.println(r);

    }
}
