import java.util.Scanner;

public class rabu1nov {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Input password");
        String paswed=a.nextLine();
        while (paswed.contains(" ")
                ||paswed.contains("#")
                ||paswed.contains("$")
                ||paswed.contains("%")
                ||paswed.contains("&")
                ||paswed.contains("^")
                ||paswed.contains("'")
                ||paswed.contains("\"")
                ||paswed.contains("?")
                ||paswed.contains("/")
                || paswed.contains("(")
                ||paswed.contains("*")
                ||paswed.contains(")")
        ||paswed.contains("+")
        ||paswed.contains("-")
        ||paswed.contains(":")
        ||paswed.contains(";")
        ||paswed.contains("{")
        ||paswed.contains("}")
        ||paswed.contains("[")
        ||paswed.contains("]")
        ||paswed.contains(">")
        ||paswed.contains("<")
        ||paswed.contains("=")
        ||paswed.contains("@")
        ||paswed.contains("!")
        ||paswed.contains("_")
        ||paswed.contains("\\")||paswed.length()<1||paswed.length()>50){
            System.out.println("Inputan password salah, input lagi(hanya diperbolehkan untuk menggunakan huruf, angka, titik, tanda seru saja");
            paswed=a.nextLine();
        }
        int checker=0;
        int panjang=0;
        int aiueo=0;
        while (true) {
            if (paswed.length() < 6) {
                panjang = 6 - paswed.length();
                checker = panjang + checker;
                System.out.println(checker);
                break;
            }
            if (paswed.length() > 20) {
                panjang = 20 - paswed.length();
                checker = panjang + checker;
                System.out.println(checker);
                break;
            }
            for (int x = 1; x < paswed.length()-1; x++) {
                if (paswed.charAt(x) == paswed.charAt(x - 1)) {
                    if (paswed.charAt(x) == paswed.charAt(x + 1)) {
                        checker++;
                    }
                }
                else if (paswed.charAt(x) >= 65 || paswed.charAt(x) <= 90) {
                    checker++;
                }
               else if (paswed.charAt(x) >= 97 || paswed.charAt(x) <= 122) {
                    checker++;
                }
            }
            System.out.println(checker);
            break;
        }
    }
}