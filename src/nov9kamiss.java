import java.util.Scanner;

public class nov9kamiss {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int foetoe=a.nextInt();
        int taim=0;
        int destance=0;
        int haispid=0;
        int [][]dishtance=new int[foetoe][2];
        for (int x=0;x<foetoe;x++) {
            dishtance [x][0]= a.nextInt();
            dishtance [x][1]= a.nextInt();
        }
        for (int x=0;x<foetoe;x++){
            if (dishtance[x][0]>taim){
                taim=dishtance[x][0];
            }
            if (dishtance[x][1]>destance){
                destance=dishtance[x][1];
            }
        }
        int temp=0;
        int tempy=0;
        for (int x=0;x<foetoe;x++){
            if (dishtance[x][0]<taim){
                temp=dishtance[x][0];
            }
            if (dishtance[x][1]<destance){
                tempy=dishtance[x][1];
            }
        }
        taim=taim-temp;
        destance=destance-tempy;
        haispid=destance/taim;
        System.out.println(haispid);
    }
}
/*
buat scanner untuk mengambil inputan integer yang digunakan untuk mengisi batas array 2d berapa*2
batas yang ditentukan akan digunakan untuk membuat loop yang dipakai untuk mengisi array 2d
inisialisasi 5 variabel, 2 variabel untuk yang terbesar dalam waktu dan kecepatan, 2 variabel untuk yang terbesar kedua dalam waktu dan kecepatan, sisanya untuk mencari kecepatan tertinggi
buat loop 1 untuk mencari yang paling besar inputannya yang dimasukkan ke 2 variabel
buat loop 2 untuk mencari yang paling besar kedua inputannya yang dimasukkan ke 2 variabel lain
kurangi dua variabel dengan kelompok masing-masing(waktu terbesar-waktu terbesar kedua, jarak terbesar-jarak terbesar kedua)
ambil sisa variabel lalu masukkan selisih jarak/selisih waktu
print hasil hitungan yang dideskripsikan di line 46
 */