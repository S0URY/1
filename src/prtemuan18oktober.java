import java.util.Scanner;

public class prtemuan18oktober {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Angka input batas mencari bilangan prima");
        int n= a.nextInt();
        for (int x=2;x<=n;x++){
            int pemfaktor=0;
            for (int y=1;y<=x;y++){
                if (x%y==0){
                    pemfaktor++;
                }
                }
            if (pemfaktor==2){
                System.out.print(x+" ");
            }
        }
        //atas soal nomor 1
        //lihat soal ada cari angka prima dibawah angka n jadi buat Scanner dan int n sebagai batas angka yang digunakan untuk mencari prima
        //buat loop pertama dengan kondisi x=2;x<=n;x++ yang berisi int pemfaktor=0;
        //buat loop lagi dalam loop pertama dengan kondisi y=1;y<=x;y++ berisi if dimana jika x%y=0 maka pemfaktor ditambah 1
        //jika pemfaktor sama dengan 2 maka angka diprint, pemfaktor harus sama dengan 2 karena angka prima hanya punya 2 faktor/pembagi. angka 1 dan angka itu sendiri
        System.out.println();
        System.out.println("Batas array, satu input saja. jadinya A x A ukurannya");
        int q= a.nextInt();
        String [][]awway=new String[q][q];
        int penanda=1;
        for (int x=0;x<q;x++){
            for (int y=0;y<q;y++){
                if (penanda%2==1){
                    awway[x][y]="+";
                    penanda++;
                }else{
                    awway[x][y]="-";
                    penanda++;
                }
            }
            penanda++;
        }
        for (int x=0;x<q;x++){
            for (int y=0;y<q;y++){
                System.out.print(awway[x][y]+" ");
            }
            System.out.println();
        }
        //soal kedua mulai dari line 24
        //pertama buat variabel baru untuk batas array, karena hanya diminta 1 inputan maka 1 variabel saja
        //hasil inputan digunakan untuk vatas array baru yang dibuat(array string karena nanti diisi + atau -
        //buat variabel int baru lagi sebagai penanda urutan keberapa yang dimulai dengan 1
        //buat loop pertama kondisinya x=0;x<batas array;x++
        //dalam loop pertama buat loop kedua kondisinya y=0;y<batas array;y++ yang berisi if jika penanda dimodulus 2 sama dengan 1 maka masukkan + di posisi matriks itu, dan diisi - jika hasilnya sama dengan 0
        //apapun hasil ifnya penanda harus naik 1. setelah loop 2 selesai maka penanda ditambah 1 lagi
        //setelah loop selesai bisa diprint arraynya menggunakan loop
    }
}