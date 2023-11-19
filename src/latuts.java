import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class latuts {
    public static void main(String[] args) {
        Random a = new Random();
        Scanner c = new Scanner(System.in);
        System.out.println("Batas baris array 2d");
        int q = c.nextInt();
        while (q < 0) {
            q = c.nextInt();
        }
        System.out.println("Batas kolom array 2d");
        int w = c.nextInt();
        while (w < 0) {
            w = c.nextInt();
        }
        int[][] are = new int[q][w];
        for (int x = 0; x < q; x++) {
            for (int y = 0; y < w; y++) {
                are[x][y] = a.nextInt(10) + 1;
            }
        }
        for (int x = 0; x < q; x++) {
            for (int y = 0; y < w; y++) {
                System.out.print(are[x][y] + " ");
            }
            System.out.println();
        }
        int[][] A = new int[q][w];
        int[][] B = new int[q][w];
        for (int x = 0; x < q; x++) {
            System.arraycopy(are[x], 0, A[x], 0, q);
        }
        for (int x = 0; x < q; x++) {
            System.arraycopy(are[x], 0, B[x], 0, q);
        }
        System.out.println("Menu:");
        System.out.println("a. Tanpa Sort");
        System.out.println("b. Sort per kolom");
        System.out.println("c. Sort per baris");
        System.out.println("Ketik pilihan");
        String input = c.next();
        if (input.equalsIgnoreCase("a")) {
            for (int x = 0; x < q; x++) {
                for (int y = 0; y < w; y++) {
                    System.out.print(are[x][y] + " ");
                }
                System.out.println();
            }
        }
        if (input.equalsIgnoreCase("b")) {
            for (int x=0;x<w;x++){
                for (int y=0;y<q-1;y++){
                    for (int z=0;z<q-1-y;z++){
                        if (A[z][x]>=A[z+1][x]){
                            int temp=A[z][x];
                            A[z][x]=A[z+1][x];
                            A[z+1][x]=temp;
                        }
                    }
                }
            }
            for (int []m:A){
                for (int y:m){
                    System.out.print(y+" ");
                }
                System.out.println();
            }
        }
        if (input.equalsIgnoreCase("c")) {
            for (int x = 0; x < are[0].length; x++) {
                Arrays.sort(are[x]);
            }
            for (int x = 0; x < q; x++) {
                for (int y = 0; y < w; y++) {
                    System.out.print(are[x][y] + " ");
                }
                System.out.println();
            }
        }
    }
}