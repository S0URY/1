import java.util.Scanner;

public class tugasarray14september {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[5];
            for (int r=0;r<5;r++) {
                if (r==0){
                    System.out.println("Data a");
                }
                a[r] = p.nextInt();
            }
            for (int m = 0; m < 5; m++) {
                if (m==0){
                    System.out.println("Data b");
                }
                b[m]= p.nextInt();
            }
            for (int u=0;u<5;u++) {
                if (a[u] == b[u]) {
                    if (u==0){
                        System.out.println("Hasil step 1:");//membandingkan array a dan b, jika ada yang sama maka diprint
                    }
                    c[u] = a[u];
                    System.out.println(c[u]);
                }
            }
                for (int z=0;z<5;z++){
                    if (z==0){
                        System.out.println("Hasil step 2:");//mengambil satu anggka di array a dan dicek apakah angka itu ada yang sama di semua isi array b. jika ada diprint
                    }
                    if (a[0]==b[z]) {
                            c[z]=a[0];
                            System.out.println(c[z]);
                        }
                    else if (a[1]==b[z]){
                        c[z]=a[1];
                        System.out.println(c[z]);
                    } else if (a[2]==b[z]) {
                        c[z]=a[2];
                        System.out.println(c[z]);
                    } else if (a[3]==b[z]) {
                        c[z]=a[3];
                        System.out.println(c[z]);
                    } else if (a[4]==b[z]) {
                        c[z]=a[4];
                        System.out.println(c[z]);
                    }
                }
                    }
                }