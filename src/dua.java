import java.util.Scanner;

public class dua {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("masukkan angka untuk jumlah bensin per meter, waktu, percepatan secara urut");
        double gasperhour= a.nextDouble();
        double t=a.nextDouble();
        double v=a.nextDouble();
        double startspeed=0;
        double startspeedandt=startspeed*t;
        double tt=t*t;
        double setengahkalivkaliwaktukuadrat=0.5*v*tt;
        double distance=startspeedandt+setengahkalivkaliwaktukuadrat;
        double consume=distance*gasperhour;
        System.out.println(consume);
    }
}

