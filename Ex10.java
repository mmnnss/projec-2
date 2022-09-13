public class Ex10 {
    public static void main(String[] args) {
        int x=20, y=25, n,max,min,distance,diff;
        double b;
        n=x+y;
        System.out.println(n);
        diff=x-y;
        System.out.println(diff);
        n=x*y;
        System.out.println(n);
        b=(x+y)/2;
        System.out.println(b);
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
