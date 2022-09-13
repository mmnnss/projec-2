import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter The X->");
        int x=input.nextInt();

        System.out.println("Enter The Y->");
        int y=input.nextInt();

        int n,max,min,distance,diff;
        n=x+y;
        System.out.println(n);
        diff=x-y;
        System.out.println(diff);
        n=x*y;
        System.out.println(n);
        n=(x+y)/2;
        System.out.println(n);
        distance=diff;
        if(distance>0){System.out.println(diff);}
        if(distance<0){System.out.println(-1*diff);}
        max=x;
        if(y>max)max=y;
        System.out.println(max);
        min=x;
        if(y<min)min=y;
        System.out.println(min);
    }
}
