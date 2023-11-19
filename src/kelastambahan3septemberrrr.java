import java.util.Scanner;

public class kelastambahan3septemberrrr {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        String[][] a = {{"|_", "|_", "|_", "|_", "|_"}, {"|_", "|_", "|_", "|_", "|_"}, {"|_", "|_", "|_", "|_", "|_"}, {"|_", "|_", "|_", "|_", "|_"}, {"|_", "|_", "|_", "|_", "|_"}, {"|_", "|_", "|_", "|_", "|_"}};
        int z = a.length;
        int zz = a[0].length;
        int boo = 0;
        System.out.println(z);
        System.out.println(zz);
        for (int x = 0; x < z; x++) {
            for (int y = 0; y < zz; y++) {
                System.out.print(a[x][y] + " ");
            }
            System.out.println();
        }
        int code = 0;
        while (code == 0) {
            System.out.println("Pilihan aksi");
            System.out.println("1. Input kapal");
            System.out.println("2. Tunjukan peta+kapal");
            System.out.println("3. Exit");
            int cois = q.nextInt();
            if (cois == 1) {
                System.out.println("Panjang kapal berapa kotak");
                int pkapal = q.nextInt();
                while (pkapal > zz || pkapal < 0) {
                    System.out.println("Input lagi");
                    pkapal = q.nextInt();
                }
                System.out.println("Lebar kapal berapa kotak");
                int lkapal = q.nextInt();
                while (lkapal > z || lkapal < 0) {
                    System.out.println("Input lagi");
                    lkapal = q.nextInt();
                }
                System.out.println("Mulai di kolom mana(jika 0 maka keluarnya di awal, jika contohnya 2 maka keluar di 3, dst)");
                int kolompeta = q.nextInt();
                while (kolompeta >= z || kolompeta < 0) {
                    System.out.println("Input lagi");
                    kolompeta = q.nextInt();
                }
                System.out.println("Mulai di baris mana(jika 0 maka keluarnya di awal, jika contohnya 2 maka keluar di 3, dst)");
                int barispeta = q.nextInt();
                while (barispeta >= zz || barispeta < 0) {
                    System.out.println("Input lagi");
                    barispeta = q.nextInt();
                }
                System.out.println("Penanda kapal(beri simbol)");
                String simbol = q.next();
                for (int x = 0; x < pkapal; x++) {
                    for (int y = 0; y < lkapal; y++) {
                        if (!a[kolompeta + x][barispeta + y].equals("|_")) {
                            boo = 1;
                            break;
                        }
                    }
                }
                if (boo == 1) {
                    System.out.println("Input tidak valid");
                }else{
                    for (int x = 0; x < pkapal; x++) {
                        for (int y = 0; y < lkapal; y++) {
                            a[kolompeta + x][barispeta + y] = simbol;
                        }
                    }
                }
                boo = 0;
            }
                if (cois == 2) {
                    for (int x = 0; x < z; x++) {
                        for (int y = 0; y < zz; y++) {
                            System.out.print(a[x][y] + " ");
                        }
                        System.out.println();
                    }
                }
                if (cois == 3) {
                    code = 1;
                }
            }
        }
    }