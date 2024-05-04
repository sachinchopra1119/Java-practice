import java.util.Scanner;
public class swapping {

    public static void main(String[] args) {
        int m;
        int n;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        System.out.println("Before swap");
        System.out.println("m: "+m);
        System.out.println("m: "+n);
        int temp=m;
        m=n;
        n=temp;
        System.out.println("after swap");
        System.out.println("m: "+m);
        System.out.println("m: "+n);

    }
}
