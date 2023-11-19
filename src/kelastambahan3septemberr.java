import java.util.Arrays;
import java.util.Scanner;

public class kelastambahan3septemberr {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Limit array");
        int u = a.nextInt();
        int[] aa = new int[u];
        System.out.println("Isi array sesuai limitnya");
        for (int x = 0; x < u; x++) {
            aa[x] = a.nextInt();
        }
        Arrays.sort(aa);
        int i = 0;
        System.out.print(aa[0]+" ");
        for (int x = 1; x < u; x++) {
            if (aa[x]!=aa[x-1]) System.out.print(aa[x]+" ");
        }
        //loop diatas untuk membuang duplikat di array 1 dimensi
        //Cara lain untuk hasil sama
        //int temp=aa[0];
        //int bb[]=new int[u];
        //bb[0]=temp;
        //int idxfinal=1;
        //for(int i=1;i<n;i++){
        //if(temp!=bb[i]){
        //bb[idxfinal]=aa[i];
        //idxfinal++;
        //temp=aa[i];
        //}
        //}
        //int []cc=bb;
        //bb=new int[idxfinal];
        //for(int i=0;i<idxfinal;i++){
        //bb[i]=cc[i];
        //}
        //for(int i:bb){
        //System.out.print(i+" ");
        //}
    }
}
