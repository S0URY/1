import java.util.Scanner;

public class pertemuanempata {
    public static void main(String[] args) {
        Scanner aaa=new Scanner(System.in);
        int a=aaa.nextInt();
        if (a>=10){
            int n=a%10;
            System.out.println(n);
        }else if (a<100 &&a>=100){
            int z=a%100;
            System.out.println(z);
        } else if (a<1000 &&a>=1000) {
 int y=a%1000;
            System.out.println(y);
        }else {
            System.out.println("do it yosef");
        }

    }
}
