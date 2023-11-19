import java.util.Scanner;

/* Two bucket puzzle
1L:0 0, 0 4, 4 0, 4 4, 7 1, 0 1
Penjelasan:dua ember kosong, isi ember 4L, tuang 4L ke 7L, isi ember 4L lagi
, tuang isi 4L ke 7L(7L di 7L dan 1L di 4L), buang 7L

2L:0 0, 7 0, 3 4, 3 0, 0 3, 7 3, 6 4, 6 0, 2 4, 2 0
Penjelasan:dua ember kosong, isi ember 7 liter, tuang 7L ke 4L(jadinya 3L di 7L dan 4L di 4L), buang isi 4L
, pindah isi 7L ke 4L, isi 7L lagi, isi 4L dengan 7L(7L isinya jadi 6L, 4L jadi 4L), buang isi 4L
, isi 4L dengan isi 7L(7L isinya 2L, 4L isinya 4L), buang 4L

3L:0 0, 7 0, 3 4, 3 0
Penjelasan:dua ember kosong, isi ember 7 liter, tuang 7L ke 4L(jadinya 3L di 7L dan 4L di 4L), buang isi 4L

4L:0 0, 0 4
Penjelasan:dua ember kosong, isi ember 4L

5L:0 0, 0 4, 4 0, 4 4, 7 1, 0 1, 1 0, 1 4, 5 0
Penjelasan:dua ember kosong, isi ember 4L, tuang 4L ke 7L, isi ember 4L lagi
, tuang isi 4L ke 7L(7L di 7L dan 1L di 4L), buang 7L, pindah isi ember 4L ke ember 7L, isi ember 4L
, tuang 4L ke isi 7L

6L:0 0, 7 0, 3 4, 3 0, 0 3, 7 3, 6 4, 6 0
Penjelasan:dua ember kosong, isi ember 7 liter, tuang 7L ke 4L(jadinya 3L di 7L dan 4L di 4L), buang isi 4L
, pindah isi 7L ke 4L, isi 7L lagi, isi 4L dengan 7L(7L isinya jadi 6L, 4L jadi 4L), buang isi 4L

7L:0 0, 7 0
Penjelasan:dua ember kosong, isi ember 7 liter
 */
public class patternproblem26oktober {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Input jumlah");
        //input jumlah pagar
        int jumlah = a.nextInt();
        System.out.println("Input tinggi pagar");
        //input tinggi pagar
        int tinggi = a.nextInt();
        //tinggii itu tinggi yang dipakai dalam membuat gambar nanti karena bagian pertama dan akhir berupa
        //garis saja
        int tinggii = tinggi - 2;
        System.out.println("Input lebar tiap kotak");
        //lebar kotak dalam satu pagar, juga menentukan seberapa lebar suatu gambar nanti
        int lebar = a.nextInt();
        if (tinggi<=1){
            //jika tinggi 1 maka print tidak valid
            System.out.println("Tinggi tidak valid");
        }else {
            for (int x = 0; x < (lebar * jumlah) + (jumlah + 1); x++) {
                //print bagian atas
                System.out.print("-");
            }
            //ke baris lanjutan
            System.out.println();
            //loop pertama untuk tinggi pagar
            for (int w = 0; w < tinggii; w++) {
                //loop kedua untuk banyak pagar berapa
                for (int x = 0; x <= jumlah; x++) {
                    System.out.print("|");
                    //loop ketiga untuk berapa lebar 1 pagar
                    for (int y = 0; y < lebar; y++) {
                        System.out.print(" ");
                    }
                }
                //memastikan "|" dapat membuat garis lurus kebawah
                System.out.println();
            }
            if (tinggi > 1) {
                for (int x = 0; x < (lebar * jumlah) + (jumlah + 1); x++) {
                    //print bagian bawah
                    System.out.print("-");
                }
            }
        }
        }
    }