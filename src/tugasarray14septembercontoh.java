import java.util.Scanner;

public class tugasarray14septembercontoh {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[5];
        for (int q = 0; q < 5; q++) {
            a[q] = p.nextInt();
        }
            for (int x = 0; x < 5; x++) {
                b[x] = p.nextInt();
            }
            for (int i = 0; i < 5; i++) {
                c[i] = a[i] + b[i];
                System.out.println("Jumlah ke-" + (i + 1) + ":" + c[i]);
            }
        }
    }