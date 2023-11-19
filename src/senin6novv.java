import java.util.Random;
import java.util.Scanner;

public class senin6novv {
    public static void main(String[] args) {
        //buat random untuk mengisi array pertama
        Scanner a=new Scanner(System.in);
        Random rando=new Random();
        //input baris dan kolom untuk array pertama
        int baris= a.nextInt();
        int kolom=a.nextInt();
        //inisialisasi untuk batas array resize
        int barisbaru=0;
        int kolombaru=0;
        //pembuatan array pertama
        int [][]awei=new int[baris][kolom];
        //loop untuk pengisian array pertama
        for (int x=0;x<baris;x++){
            for (int y=0;y<kolom;y++){
                awei[x][y]=rando.nextInt(100)+1;
            }
        }
        //mengecek berapa banyak angka ganjil dalam int kolom dan int baris
        for (int x=0;x<=baris;x++){
            if (x%2==1&&x>0){
                barisbaru++;
            }
        }
        for (int x=0;x<=kolom;x++){
            if (x%2==1&&x>0){
                kolombaru++;
            }
        }
        //print array pertama untuk petunjuk
        System.out.println("Array utuh:");
        for (int x=0;x<baris;x++){
            for (int y=0;y<kolom;y++){
                System.out.print(awei[x][y]+" ");
            }
            System.out.println();
        }
        //inisialisasi 2 integer lagi untuk penanda letak angka yang dimasukkan ke array resize
        int n=0;
        int m=0;
        //buat array baru dengan batas baru
        int [][]are=new int[barisbaru][kolombaru];
        //memasukkan angka di baris dan kolom ganjil ke array yang baru dibuat
        for (int x=0;x<baris;x++){
            for (int y=0;y<kolom;y++){
                if (x%2==0){
                    if (y%2==0){
                        //angka array pertama dengan urutan baris x dan kolom y dimasukkan ke array kedua dengan urutan baris n dan kolom m
                        //m akan bertambah tiap loop, jika m==kolombaru maka m diubah ke 0 kembali dan n ditambah 1
                        are[n][m]=awei[x][y];
                        m++;
                        if (m==kolombaru){
                            n++;
                            m=0;
                        }
                    }
                }
            }
        }
        //print array kedua yang sudah dimasukkan angkanya dari loop
        System.out.println();
        System.out.println("Array yang sudah dimodifikasi:");
        for (int x=0;x<barisbaru;x++){
            for (int y=0;y<kolombaru;y++){
                System.out.print(are[x][y]+" ");
            }
            System.out.println();
        }
    }
}
/*
resize array dengan memasukkan angka yang berada di baris dan kolom ganjil
buat scanner agar dapat menginput angka
buat random untuk dapat mengisi array 2d/matriks
lalu masukkan inputan baris kolom array 2d/matriks
inisialisasi integer yang digunakan sebagai batas array yang sudah diresize
inisialisasi integer lain yang digunakan untuk memasukkan angka di array itu ke array memiliki batas resize
buat loop dalam loop masing-masing batas baris dan kolom untuk mengisi array yang akan diresize
cek batas yang dibutuhkan untuk array yang sudah diresize dengan mengambil batas dan kolom array sebelumnya dan diloop
jika saat loop itu ada angka ganjil maka integer inisialisasi untuk batas array 2d/matriks yang diresize dapat ditambah 1 per angka ganjil
setelah dapat batas baru dapat membuat array baru dengan batas baru itu
membuat 2 loop, loop kedua diisi pengecekan baris dan kolom ganjil dalam array pertama, jika ada maka dimasukkan ke array yang dimodifikasi menggunakan integer sisanya yang diinisialisasi tadi untuk mengganti tempatnya
 */