import java.util.Scanner;

public class novv8 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Masukkan x untuk titik pertama");
        int x= a.nextInt();
        System.out.println("Masukkan y untuk titik pertama");
        int y= a.nextInt();
        System.out.println("Masukkan x untuk titik kedua");
        int xx= a.nextInt();
        System.out.println("Masukkan y untuk titik kedua");
        int yy= a.nextInt();
        System.out.println("Masukkan x untuk titik ketiga");
        int xxx= a.nextInt();
        System.out.println("Masukkan y untuk titik ketiga");
        int yyy= a.nextInt();
        System.out.println("Masukkan x untuk titik keempat");
        int xxxx=a.nextInt();
        System.out.println("Masukkan y untuk titik keempat");
        int yyyy= a.nextInt();
        int p1=Math.abs(x-xx);
        int l1=Math.abs(y-yy);
        int p2=Math.abs(xxx-xxxx);
        int l2=Math.abs(yyy-yyyy);
        int luas1=p1*l1;
        int luas2=p2*l2;
        int piris=0;
        int liris=0;
        int irisluas=0;
        if (p1!=p2&&l1==l2) {
            for (int p = 0; p <= Math.max(x, xx); p++) {
                if (p == Math.max(x, xx)) {
                    piris = p;
                    break;
                }
            }
            for (int l = 0; l <= Math.max(yyy, yyyy); l++) {
                if (l == Math.max(yyy, yyyy)) {
                    liris = l;
                    break;
                }
            }
            irisluas = piris * liris;
            int luasgabung = luas1 + luas2 - irisluas;
            System.out.println(luasgabung);
        }else {
            System.out.println(luas1);
        }
    }
}
