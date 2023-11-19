import java.util.Scanner;
//menginput hari antara 0-364 untuk bumi dan 0-686 untuk mars. output berupa berapa banyak loop yang dibutuhkan agar kedua-duanya sama hasilnya
public class tugas6septemberrrr {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int b, m, kont=0;
        do {
            System.out.println("Masukkan angaka antara 0-364");
            b = a.nextInt();
        } while (0>b || 364<b);
        do {
            System.out.println("Masukkan angaka antara 0-686");
            m = a.nextInt();
        } while (0>m || 686<m);

        while (b!=m){
            kont++;
            b++;
            if (b==365){
                b=0;
            }
            m++;
            if (m==687){
                m=0;
            }
            System.out.println(kont);
        }
        System.out.println(kont);
    }
}
