import com.sun.tools.javac.Main;

import javax.swing.plaf.basic.BasicDesktopIconUI;
import java.util.Random;
import java.util.Scanner;

public class aeiou {
    public static void main(String[] args) {
        Scanner nama = new Scanner(System.in);
System.out.println("ketik angka");

        int a = nama.nextInt();
        int b = nama.nextInt();
        int c = nama.nextInt();
        int d = nama.nextInt();
        int tigasisi = a+b+c;
        double z = tigasisi* 0.5d;
        double f = z-a;
        double g = z-b;
        double h = z-c;
        double i = z*f;
        double j = z*g;
        double k = z*h;
        double l = i*j*k;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        double aiu = Math.sqrt(l);
        System.out.println("L segitiga=" +aiu);
double lingkaran = Math.PI*d;
        System.out.println("lingkaran="+lingkaran);


    }
}
