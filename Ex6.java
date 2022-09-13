public class Ex6 {
    public static void main(String[] args) {
        String V ="NOOF";
        String F="AFRAH",y;
        int n;
        n=V.length()+F.length();
        System.out.println(n);
       y= V.substring(1,2);
        System.out.println(y);
       y= V.substring(V.length()/2,V.length());
        System.out.println(y);
        y=V+F;
        System.out.println(y);
        y=F+V;
        System.out.println(y);
    }
}
