import java.util.Locale;
import java.util.Scanner;

public class nov9kamis {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int banyak= a.nextInt();
        int ceky=0;
        for (int x=0;x<=banyak;x++){
            String kolor= a.nextLine();
            kolor=kolor.toLowerCase();
            if (koloriter(kolor)){
                ceky++;
            }
        }
        if (ceky>0){
            System.out.println(ceky);
        }else {
            System.out.println("I must watch Star Wars with my daughter");
        }
    }
    public static boolean koloriter(String kolor){
        String kolorz=" ";
        kolor=kolor.toLowerCase();
        int tes=0;
        for (int x=0;x<kolor.length();x++){
            if (kolor.charAt(x)=='p') {
                if (kolor.charAt(x + 1) == 'i') {
                    if (kolor.charAt(x + 1 + 1) == 'n') {
                        if (kolor.charAt(x + 1 + 1 + 1) == 'k') {
                            tes++;
                        }
                    }
                }
            }
                if (kolor.charAt(x)=='r') {
                    if (kolor.charAt(x + 1) == 'o') {
                        if (kolor.charAt(x + 1 + 1) == 's') {
                            if (kolor.charAt(x + 1 + 1 + 1) == 'e') {
                                tes++;
                            }
                        }
                    }
                }
            }
        if (tes>0){
            return true;
        }
        return false;
    }
}
/*
buat Scanner yang akan menerima input integer dan string sebanyak integer
string akan dicek jika ada kata pink atau rose di sebuah string
jika ada maka counter naik 1, jika tidak dibiarkan
jika counter>0 maka print total sesi yang dapat dihadiri
jika counter<=0 maka print I must watch Star Wars with my daughter
 */