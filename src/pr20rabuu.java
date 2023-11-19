import java.util.Arrays;
import java.util.Scanner;

public class pr20rabuu {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        float[] m = {1, 3, 5, 2, 3};
        int l = 0;
        int x = 0;
        int choice = 0;
        int limit = 0;
        float max = 0;
        float min = 0;
        float mean = 0;
        int z = 0;
        int u = 0;
        int replaced = 0;
        int pengurutan = 0;
        while (l >= 0) {
            x = 0;
            //mengeprint isi array yang lebih dari 0
            System.out.println("Array: ");
            for (x = 0; x < m.length; x++) {
                if (m[x] > 0)
                    System.out.print((int) m[x] + " ");
            }
            //memilih antara angka 1 sampai 5 dengan instruksinya sendiri-sendiri. jika memilih 5 contohnya program akan ditutup
            System.out.println();
            System.out.println("Pilih menu:\n" + "1. Input Array\n" + "2. Max & min\n" + "3. Mean\n" + "4. Remove value\n" + "5. Sorting\n" + "0. Exit");
            choice = 0;
            choice = a.nextInt();
            //pilihan 1 untuk mengganti array yang ditunjukkan dengan array buatan sendiri
            if (choice == 1) {
                System.out.println("batas array");
                limit = a.nextInt();
                while (limit < 0 || limit > 100) {
                    limit = a.nextInt();
                }
                System.out.println("isi array");
                m = new float[limit];
                for (x = 0; x < limit; x++) {
                    m[x] = a.nextFloat();
                }
            }//pilihan 2 akan mencari angka terbesar dan terkecil suatu array
            else if (choice == 2) {
                max = m[0];
                min = m[0];
                for (x = 0; x < m.length - 1; x++) {

                    if (min > (int) m[x + 1]) {
                        min = (int) m[x + 1];
                    }
                    if (max < (int) m[x + 1]) {
                        max = (int) m[x + 1];
                    }
                }
                System.out.println("Max: " + max);
                System.out.println("Min: " + min);
            }//pilihan ketiga akan mencari rata-rata/mean array
            else if (choice == 3) {
                for (x = 0; x < m.length; x++) {
                    u = (int) m[x] + u;
                }
                mean = (float) u / m.length;
                System.out.println("Mean: " + mean);
            }//pilihan keempat dapat dipilih untuk membuang 1 angka dalam array
            else if (choice == 4) {
                System.out.println("angka yang dibuang");
                float[] mm = new float[m.length];
                int p = a.nextInt();
                for (x = 0; x < m.length; x++) {
                    if (m[x] != p) {
                        mm[x] = m[x];
                    }
                }
                for (x = 0; x < mm.length; x++) {
                    m[x] = mm[x];
                }
                System.out.println("Array baru: ");
                for (x = 0; x < m.length; x++) {
                    System.out.print(m[x] + " ");
                }
            }//memilih 5 akan mengurutkan array sesuai pilihan yang dipilih(antara terbesar atau terkecil)
            if (choice == 5) {
                float[] xy = new float[m.length];
                int ab = 0;
                System.out.println("Pilih diurut bagaimana:");
                System.out.println("1. Dari terbesar\n" + "2. Dari terkecil");
                pengurutan = a.nextInt();
                switch (pengurutan) {
                    case 1:
                        for (x=0;x<m.length;x++){
                            m[x]=m[x]*-1;
                        }
                        Arrays.sort(m);
                        for (x=0;x<m.length;x++){
                            m[x]=m[x]*-1;
                        }
                        Arrays.sort(m);
                        System.out.println("Array yang diurutkan:");
                        for (x = 0; x < m.length; x++) {
                            System.out.print(m[x] + " ");break;
                        }
                    case 2:
                        Arrays.sort(m);
                        System.out.println("Array yang diurutkan");
                        for (x=0;x<m.length;x++){
                            System.out.print(m[x]+" ");break;
                        }
                        }
                }
            //pilihan 0 akan membatalkan program
            if (choice==0) {
                break;
            }
            }
        }
    }