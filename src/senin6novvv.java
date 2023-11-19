import java.util.Locale;
import java.util.Scanner;

public class senin6novvv {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Input bilangan hexadecimal");
        String hex = a.nextLine();
        hex = hex.toUpperCase();
        System.out.println("Input bilangan hexadecimal yang lain");
        String hexa = a.nextLine();
        hexa = hexa.toUpperCase();
        while (hex.length() > hexa.length()) {
            hexa = "0" + hexa;
        }
        while (hex.length() < hexa.length()) {
            hex = "0" + hex;
        }
        int hexes = Integer.parseInt(hex, 16) - Integer.parseInt(hexa, 16);
        int hexess=Integer.parseInt(hex, 16) + Integer.parseInt(hexa, 16);
        System.out.println("Penjumlahan hexa:"+hexess);
        System.out.println("Pengurangan hexa:"+hexes);

    }
}