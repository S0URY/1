import java.util.Scanner;

//kode dibawah akan mengambil inputan angka yang diinput
// dan mengambil angka yang diinput dan diprint satu per satu sesuai seberapa banyak
// (contohnya 213 nantinya 2 akan diprint 2 kali, 1 sekali, 3 tiga kali)
public class tugas6septemberrrrrr {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
         int wan= a.nextInt();
        String wann=wan + "";
        int digit=wann.length();
        for (int i = 0; i < digit; i++) {
            String angak = wann.charAt(i) + "";
            for (int j = 0; j < Integer.parseInt(angak); j++) {
                System.out.print(angak);
            }
            System.out.println();
        }
    }
}
