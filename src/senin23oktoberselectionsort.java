import java.util.Random;
import java.util.Scanner;

public class senin23oktoberselectionsort {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Random r = new Random();
        int n = a.nextInt();
        int[] c = new int[n];
        int simpan = 0;
        int simpani=0;
        for (int x = 0; x < c.length; x++) {
            c[x] = r.nextInt(10) + 1;
            System.out.print(c[x] + " ");
        }
        for (int x = 0; x < c.length-1; x++) {
           for (int y=x+1;y<c.length;y++){
               if (c[x]>c[y]){
                   int save=c[y];
                   c[y]=c[x];
                   c[x]=save;
               }
           }
        }
        System.out.println();
        for (int x = 0; x < c.length; x++) {
            System.out.print(c[x] + " ");
        }
    }
}