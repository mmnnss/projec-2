import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter The  X->");
        int c=input.nextInt();

        System.out.println("Enter The  X->");
        int z=input.nextInt();
        double t;
        t=z*z;
        System.out.println(t);
        t=z*z*z;

        System.out.println(t);
       t= Math.pow(c,z);

        System.out.println(t);

    }
}
