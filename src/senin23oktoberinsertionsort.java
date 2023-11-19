import java.util.Random;
import java.util.Scanner;

public class senin23oktoberinsertionsort {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        Random w=new Random();
        int batas=a.nextInt();
        int []awei=new int[batas];
        int temp=0;
        int n=0;
        for (int x=0;x<awei.length;x++){
            temp=awei[x];
            n=x-1;
            while (n>=0&&awei[n]>temp){
                awei[n+1]=awei[n];
                n=n-1;
            }
            awei[n+1]=temp;
        }
        for (int x=0;x<awei.length;x++){
            System.out.print(awei[x]+" ");
        }
    }
}
