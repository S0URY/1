import java.util.Scanner;

public class empat {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("beri meter, tinggi orang, sudut secara urut");
        double meter = a.nextDouble();
        double tinggi = a.nextDouble();
        double sudut = a.nextDouble();
        double y = Math.tan(Math.toRadians(sudut)) * meter;
        double tiang = tinggi + y;
        System.out.println(tiang);

    }
}