import java.util.Arrays;
import java.util.Scanner;

public class oktoberrr25 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Input baris kolom array");
        //inputan batas matriks pertama
        int baris= a.nextInt();
        int kolom=a.nextInt();
        //inisialisasi variabel yang digunakan nanti
        double m=0;
        double mm=0;
        //buat matriks dengan inputan tadi
        double [][]matwiksh=new double[baris][kolom];
        System.out.println("Input isi matriks");
        //mengisi matriks dengan inputan angka sendiri
        for (int x=0;x<baris;x++){
            for (int y=0;y<kolom;y++){
                int isi=a.nextInt();
                matwiksh[x][y]=isi;
            }
        }
        //print matriks pertama
        for (int x=0;x<matwiksh.length;x++){
            for (int y=0;y<matwiksh[0].length;y++){
                System.out.print(matwiksh[x][y]+" ");
            }
            System.out.println();
        }
        //buat matriks kedua dan isinya matriks pertama dengan 0 di sebelah angka terakhir di matriks pertama
        double [][]matix=new double[baris][kolom+1];
        for (int x=0;x<baris;x++){
            for (int y=0;y<kolom;y++){
                matix[x][y]=matwiksh[x][y];
            }
        }
        //gunakan salah satu variabel yang digunakan untuk membantu dalam penjumlahan rata-rata kolom matriks
        for (int x=0;x<matix.length;x++){
            m=0;
            for (int y=0;y<matix[0].length;y++){
                m=m+matix[x][y];
            }
            matix[0+x][kolom]=m/kolom;
        }
        //gunakan variabel yang belum digunakan untuk membantu dalam penjumlahan rata-rata baris matriks
        //pembuatan array baru yang akan diletakkan dibawah matriks kedua dengan panjang kolom+1
        //inisialisasi variabel baru yang digunakan untuk membantu memasukkan nilai rata-rata ke array
        //pengisian array membiarkan angka terakhir 0
        double []mawix=new double[kolom+1];
        int l=0;
        for (int x=0;x<kolom;x++){
            mm=0;
            for (int y=0;y<baris;y++){
                mm=mm+matwiksh[y][x];
            }
            mawix[l]=mm/baris;
            l++;
        }
        System.out.println();
        //print matriks kedua
        for (int x=0;x<matix.length;x++){
            for (int y=0;y<matix[0].length;y++){
                System.out.print(matix[x][y]+" ");
            }
            System.out.println();
        }
        //print array dibawah matriks kedua
        for (int x=0;x<mawix.length;x++){
            System.out.print(mawix[x]+" ");
        }
    }
}
