import java.util.Scanner;

//inputan berupa 3 angka, angka 1 dan 2 sebagai awalan dan ketiga sebagai batas, akan dibuat deretan angka fibonacci
public class tugas6septemberrr {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int wan= a.nextInt();
        int tu= a.nextInt();
        int lim= a.nextInt();
        int n=0;
        int tri=0;
        System.out.println(wan);
        while (tri<lim){
            System.out.println(tu);
            tri = wan+tu;
            wan=tu;
            tu=tri;
        }
    }
}
