import java.util.Scanner;

public class kamis2novKPKFPB {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //inputan dua angka, seperti di soal sebelumnya(kpk dari 1011 dan 933 seingatku)
        int satu = s.nextInt();
        int dua = s.nextInt();
        //inisialisasi 3 integer, satu untuk mengecek angka pertama habis dibagi berapa
        //kedua untuk mengecek angka kedua habis dibagi berapa
        //ketiga untuk hasil akhir nanti
        int pembagisatu = 0;
        int pembagidua = 0;
        int fakktor = 0;
        while (true) {
            //loop terus sampai angka satu habis dibagi dengan pembagisatu dan lebih dari satu karena modulus 1 itu 0
            pembagisatu++;
            if (satu % pembagisatu == 0 && pembagisatu > 1) {
                break;
            }
        }
        while (true) {
            //loop terus sampai angka satu habis dibagi dengan pembagidua dan lebih dari satu karena modulus 1 itu 0
            pembagidua++;
            if (dua % pembagidua == 0 && pembagidua > 1) {
                break;
            }
        }
        //hasil pembagisatu dan pembagidua akan digunakan untuk mengganti satu dan dua
        // dengan nilai yang didapat dari nilai satu sebelumnya dibagi pembagisatu dan nilai dua sebelumnya dibagi pembagidua
        satu = satu / pembagisatu;
        dua = dua / pembagidua;
        //jika pembagisatu sama dengan pembagidua maka integer terakhir diinisialisasi akan digunakan untuk print hasil kpk dua angka tersebut
        if (pembagisatu == pembagidua) {
            fakktor = pembagisatu * satu * dua;
            System.out.println(fakktor);
        } else {
            fakktor = pembagisatu * pembagidua * satu * dua;
            System.out.println(fakktor);
        }
    }
}
        /*//line 42 sampai 53 itu kpk tapi lebih sederhana
        int bil1=s.nextInt();
        int bil2=s.nextInt();
        int kali=1;
        while ((bil1*kali)%bil2!=0){
            kali=kali+1;
        }
        System.out.println(bil1*kali);
        int angka=1;
        while (angka%bil1!=0&&angka%bil2!=0){
            angka=angka+1;
        }
        System.out.println(angka);
        //bagian bawah fpb
        int faktoer=0;
        if (bil1>bil2){
            faktoer=bil2;
        }if (bil1<bil2){
            faktoer=bil1;
        }
        while (faktoer%bil1!=0&&faktoer%bil2!=0){
            faktoer=faktoer-1;
        }
    }
}*/