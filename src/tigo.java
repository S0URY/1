import java.util.Scanner;

public class tigo {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("beri angka jam awal dan menit awal secara urut");
        int b=a.nextInt();
        int bb=a.nextInt();
        System.out.println("beri angka jam akhir dan menit akhir secara urut");
        int c=a.nextInt();
        int cc=a.nextInt();
        int jawalBaru=b*60+bb;
        int jakhirbaru=c*60+cc;
        int selisihM=jakhirbaru-jawalBaru;
        int pp=selisihM/60;
        int ll=selisihM%60;
        System.out.println(pp+":"+ll);

    }



}


