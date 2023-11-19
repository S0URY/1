import java.util.Scanner;

public class novvv8 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Masukkan baris array 2d/matriks");
        int baris = a.nextInt();
        System.out.println("Masukkan kolom array 2d/matriks");
        int kolom = a.nextInt();
        int[][] are = new int[baris][kolom];
        System.out.println("Input isi matriks sebanyak batas yang diinput(hanya isi 0 atau 1");
        for (int x = 0; x < baris; x++) {
            for (int y = 0; y < kolom; y++) {
                are[x][y] = a.nextInt();
                while (are[x][y] != 1 && are[x][y] != 0) {
                    System.out.println("Inputan tidak valid, input ulang dengan 0 atau 1");
                    are[x][y] = a.nextInt();
                }
            }
        }
        int bariscek = 0;
        int kolomcek = 0;
        for (int x = 0; x < baris; x++) {
            for (int y = 0; y < kolom; y++) {
                if (are[x][y] == 1) {
                    bariscek = 1;
                    int ceky = 1;
                    while (x + bariscek < baris && y + bariscek < kolom && ceky>0) {
                        for (int i = x; i <= x + bariscek; i++) {
                            for (int j = y; j <= y + bariscek; j++) {
                                if (are[i][j] != 1) {
                                    ceky = 0;
                                    break;
                                }
                            }
                            if (ceky<1) {
                                break;
                            }
                        }
                        if (ceky>0) {
                            bariscek++;
                        }
                    }
                    if (bariscek > kolomcek) {
                        kolomcek = bariscek;
                    }
                }
            }
        }
        System.out.println(kolomcek*kolomcek);
    }
}
//note: meminta banyak bantu dengan online buat mayoritas kode soalnya tidak tau mau mulai dimana
//bisa koding buat baca berapa banyak suatu hal tapi koding untuk mencari berapa banyak sesuatu itu dalam aspek tertentu
//dalam kasus ini mencari persegi, itu agak bingung dan tidak tahu mau mulai dimana karena tidak ada ide yang muncul