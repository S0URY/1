import java.util.Scanner;

public class senin6nov {
    public static void main(String[] args) {
        //inisialisasi integer dan boolean untuk pengecekan input berupa binary atau tidak
        int ceky=0;
        boolean ax=true;
        Scanner a = new Scanner(System.in);
        System.out.println("Input bilangan biner(kombinasi 0 dan 1)");
        //menginput bilangan binary pertama dan dicek apakah merupakan binary atau tidak
        String biner = a.nextLine();
       while (ax) {
           for (int x = 0; x < biner.length(); x++) {
               ceky=0;
               if (biner.charAt(x) != '0' || biner.charAt(x) != '1') {
                   System.out.println("Input lagi, inputan bukan biner(kombinasi 0 dan 1)");
                   biner = a.nextLine();
                   for (x=0;x<biner.length();x++){
                       if (biner.charAt(x)=='1'||biner.charAt(x)=='0'){
                           ceky++;
                       }
                       if (ceky==biner.length()){
                           ax=false;
                       }
                   }
               }
           }
       }
        ax=true;
        System.out.println("Input lagi 1 binary");
       //menginput bilangan binary kedua dan dicek berupa binary atau tidak
        String bineri = a.nextLine();
        while (ax) {
            for (int x = 0; x < bineri.length(); x++) {
                ceky=0;
                if (bineri.charAt(x) != '0' || bineri.charAt(x) != '1') {
                    System.out.println("Input lagi, inputan bukan biner(kombinasi 0 dan 1)");
                    biner = a.nextLine();
                    for (x=0;x<bineri.length();x++){
                        if (bineri.charAt(x)=='1'||bineri.charAt(x)=='0'){
                            ceky++;
                        }
                        if (ceky==bineri.length()){
                            ax=false;
                        }
                    }
                }
            }
        }
        //membuat string ketiga untuk memasukkan hasil penjumlahan dan pengurangan binary pertama dan kedua
        String n = " ";
        //inisialisasi integer untuk jika ada kelebihan saat menjumlah/mengurangi
        int plus = 0;
        //menyamakan binary jika ada yang panjangnya berbeda
        if (biner.length() < bineri.length()) {
            biner = "0" + biner;
        }
        if (bineri.length() < biner.length()) {
            bineri = "0" + bineri;
        }
        //kumpulan if perhitungan angka yang terletak di bagian paling akhir bilangan binary
        if (bineri.charAt(bineri.length() - 1) == biner.charAt(biner.length() - 1) && bineri.charAt(bineri.length() - 1) == '1') {
            if (plus == 0) {
                //perhitungan 1+1=10, 10 dalam desimal artinya 2 lalu yang diambil 0 saja lalu 1 disimpan untuk menambah hitungan lanjutan
                n = "0";
                plus = 1;
            }
        }
        if (bineri.charAt(bineri.length() - 1) == biner.charAt(biner.length() - 1) && bineri.charAt(bineri.length() - 1) == '0') {
            if (plus == 0) {
                //perhitungan 0+0=0, tidak ada kelebihan jadi plus tetap 0
                n = "0";
                plus=0;
            }
        }
        if (bineri.charAt(bineri.length() - 1) != biner.charAt(biner.length() - 1)) {
            if (plus == 0) {
                //perhitungan 1+0 atau 0+1 yang hasilnya 1, tidak ada kelebihan jadi plus tetap 0
                n = "1";
                plus = 0;
            }
        }
        //loop dari urutan atas ke bawah/kanan ke kiri selain angka paling akhir
            for (int x = bineri.length() - 1 - 1; x >= 0; x--) {
                if (bineri.charAt(x) == biner.charAt(x) && bineri.charAt(x) == '1') {
                    //perhitungan dasar 1+1
                    if (plus == 0) {
                        if (x == 0) {
                            //jika urutan awal dan kedua angka 1
                            n = "10".concat(n);
                        } else {
                            //jika urutan bukan awal dan keduanya 1 hasilnya 10 atau 0 dan lebih 1
                            n = "0".concat(n);
                            plus = 1;
                        }
                    } else if (plus == 1) {
                        //jika plus==1
                        //perhitungan 1+1=0+1=1
                        //plus ganti ke 0 karena sudah dipakai
                        n = "1".concat(n);
                        plus = 0;
                    }
                } else if (bineri.charAt(x) == biner.charAt(x) && bineri.charAt(x) == '0') {
                    //perhitungan dasar 0+0
                    if (plus == 0) {
                        //jika plus==0 maka penjumlahan 0+0=0
                        n = "0".concat(n);
                    } else if (plus == 1) {
                        //jika plus==1 maka penjumlahan 0+0=0+1=1 lalu plus ganti ke 0 karena sudah dipakai dalam perhitungan
                        n = "1".concat(n);
                        plus = 0;
                    }
                } else if (bineri.charAt(x) != biner.charAt(x)) {
                    //perhitungan dasar 1+0 atau 0+1
                    if (plus == 0) {
                        //1+0 atau 0+1=1, tidak ada kelebihan jadi plus diberi nilai 0
                        n = "1".concat(n);
                        plus = 0;
                    } else if (plus == 1) {
                        //1+0 atau 0+1=1+1=0, kelebihan 1 maka disimpan
                        if (x == 0) {
                            //jika diurutan paling awal maka 1+0 atau 0+1=1+1=10
                            n = "10".concat(n);
                        } else {
                            //1+0 atau 0+1=1+1=0 dan karena lebih 1 plus diberi nilai 1
                            n = "0".concat(n);
                            plus = 1;
                        }
                    }
                }
            }
            //print hasil penjumlahan biner
            System.out.println("Penjumlahan biner=" + n);
            plus = 0;
            n = " ";
            if (bineri.charAt(bineri.length() - 1) == biner.charAt(biner.length() - 1) && bineri.charAt(bineri.length() - 1) == '1') {
                if (plus == 0) {
                    //perhitunan 1-1=0
                    n = "0";
                }
            }
            if (bineri.charAt(bineri.length() - 1) == biner.charAt(biner.length() - 1) && bineri.charAt(bineri.length() - 1) == '0') {
                if (plus == 0) {
                    //perhitungan 0-0=0
                    n = "0";
                }
            }
            if (biner.charAt(biner.length()-1)>bineri.charAt(bineri.length()-1)){
                if (plus==0){
                    //perhitungan 1-0=1
                    n="1";
                }
            }
            if (biner.charAt(biner.length()-1)<bineri.charAt(bineri.length()-1)){
                if (plus==0){
                    //perhitungan 0-1=1 dan kekurangan 1 jadi plus diubah ke 1
                    n="1";
                    plus=1;
                }
            }
            for (int x = bineri.length() - 1 - 1; x >= 0; x--){
                if (bineri.charAt(x) == biner.charAt(x) && bineri.charAt(x) == '1') {
                    if (plus == 0) {
                        //perhitungan 1-1=0
                        n = "0".concat(n);
                    }else if (plus==1){
                        //perhitungan 1-1=0-1=1 karena kurang 1 maka plus diubah ke 1
                        n="1".concat(n);
                        plus=1;
                    }
                }
                else if (bineri.charAt(x) == biner.charAt(x) && bineri.charAt(x) == '0') {
                    if (plus == 0) {
                        //perhitungan 0-0=0
                        n = "0".concat(n);
                    }else if (plus==1){
                        //perhitungan 1-0=1
                        n="1".concat(n);
                        plus=0;
                    }
                }
               else if (biner.charAt(x)>bineri.charAt(x)){
                    if (plus==0){
                        //perhitungan 1-0=1
                        n="1".concat(n);
                    }else if (plus==1){
                        n="0".concat(n);
                        //perhitungan 1-0=1-1=0
                    }
                }
                else if (biner.charAt(x)<bineri.charAt(x)){
                    if (plus==0){
                        //perhitungan 0-1=1, karena kurang satu maka plus diberi nilai 1
                        n="1".concat(n);
                        plus=1;
                    }else if (plus==1){
                        //perhitungan 1-1=0, plus jadi 0 karena sudah dipakai
                        n="0".concat(n);
                        plus=0;
                    }
                }
            }
            //print hasil pengurangan binary
        System.out.println("Pengurangan biner="+n);
        }
    }
    /*
    buat scanner agar dapat menginput angka
    pengurangan penjumlahan biner
input 2 string untuk 2 angka biner
inisialisasi 1 integer baru yang digunakan untuk mengecek jika string biner berupa biner atau tidak.
jika integer untuk mengecek tidak sama dengan panjang string maka string itu diinput ulang. jika sudah mengecek 1 string, ganti isi integer yang digunakan untuk mengecek menjadi 0 dan gunakan integer yang sama.
jika sudah mengecek string yang lainnya lalu buat loop mundur kebawah agar dapat melakukan pengurangan atau penjumlahan mundur ke belakang
dari angka terakhir ke awal(contohnya: 1101 dan 1100 maka dikurangi/dijumlah dari angka ke empat yaitu 1 dan 0 lalu angka ketiga 0 dan 0, dst).
     */