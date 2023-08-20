import java.util.Scanner;

public class leemo {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("masukkan angka untuk jumlah pegawai");
        double pigawai=a.nextDouble();
        double asusransi=Math.pow(10,-3)*Math.pow(pigawai,2)-5*Math.log(pigawai)+60;
        System.out.println(asusransi);


    }
}

