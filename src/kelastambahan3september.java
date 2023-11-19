import java.util.Arrays;
import java.util.Scanner;
public class kelastambahan3september {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Angka yang dibagi");
        int angka = a.nextInt();
        while (angka >= 230 || angka <= -231) {
            System.out.println("Input lagi");
            angka = a.nextInt();
        }
        System.out.println("Angka untuk membagi angka pertama");
        int pembagi = a.nextInt();
        while (pembagi >= 230 || pembagi <= -231) {
            System.out.println("Input lagi");
            pembagi = a.nextInt();
        }
        int w = Math.abs(angka);
        int counter = 0;
        int pembagii = Math.abs(pembagi);
        while (w >= pembagii) {
            w -= pembagii;
            counter++;
        }
        if (angka < 0) {
            counter=counter-counter-counter;
        }
        if (pembagi < 0) {
            counter=counter-counter-counter;
        }
        System.out.println(counter);
        }
    }