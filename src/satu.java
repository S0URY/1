import java.util.Scanner;

public class satu {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("beri uang");
        int ab= a.nextInt();
        int q=ab/10000;
        int ww=ab%10000;
        int aa=ww%5000;
        int bb=aa%2000;
        int z=ww/5000;
        int y=aa/2000;
        int x=bb/1000;
        int cc=bb%1000;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(q);



    }
}
