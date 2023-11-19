import java.util.Scanner;

public class novvv15 {
    public static void main(String[] args) {
        //mayoritas bantuan online
        Scanner a = new Scanner(System.in);
        System.out.println("Masukkan kata-kata");
        String kalimat = a.nextLine();
        //input dipisah komanya
        String[] kaleemat = kalimat.split(",\\s*");
        String[] mmmm = new String[kaleemat.length];
        int ceky = 0;
        for (String kata : kaleemat) {
            //jika kata hanya ada huruf alfabet biasa/kapital saja maka dimasukkan ke array mmmm
            if (kata.matches("[a-zA-Z]+")) {
                mmmm[ceky++] = kata;
            }
        }
        for (int x = 0; x < ceky - 1; x++) {
            for (int y = x + 1; y < ceky; y++) {
                //sorting dengan kondisi jika huruf abjadnya jika abjadnya sendiri tingkatannya tinggi atau tidak juga memperhatikan kapitalisasi huruf
                if (mmmm[x].toLowerCase().compareTo(mmmm[y].toLowerCase()) > 0 ||
                        (mmmm[x].equalsIgnoreCase(mmmm[y]) && mmmm[x].compareTo(mmmm[y]) > 0)) {
                    String temp = mmmm[x];
                    mmmm[x] = mmmm[y];
                    mmmm[y] = temp;
                }
            }
        }
        System.out.println("Hasil sortir");
        for (int x = 0; x < ceky; x++) {
            System.out.print(mmmm[x]);
            if (x < ceky - 1) {
                System.out.print(", ");
            }
        }
    }
}