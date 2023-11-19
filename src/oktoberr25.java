import java.util.Scanner;

public class oktoberr25 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Input deret angka");
        //input deret angka dimasukkan ke string
        String m= a.next();
        //buat 2 array, satu dengan batas m.length dan satu dengan batas 10(cek angka 0-9)
        int []tes=new int[m.length()];
        int []testis=new int[10];
        //memasukkan angka di string m ke array tes
        for (int x=0;x<m.length();x++){
            int q=m.charAt(x+0)-48;
            tes[x]=q;
        }
        //pengecekan frekuensi angka dalam array pertama dan seberapa sering angka itu muncul
        // angka akan dimasukkan ke array ke dua urutan itu(contoh 0 sering muncul 2 kali maka isi 2 di array index ke 0
        // angka 3 muncul 5 kali maka diisi 5 untuk array index ke 3
        for (int x=0;x<tes.length;x++){
            int temp=tes[x];
                if (temp==tes[x]&&temp==0){
                    testis[0]=testis[0]+1;
                }
                else if (temp==tes[x]&&temp==1){
                    testis[1]=testis[1]+1;
                }else if (temp==tes[x]&&temp==2){
                    testis[2]=testis[2]+1;
                }
                else if (temp==tes[x]&&temp==3){
                    testis[3]=testis[3]+1;
                }else if (temp==tes[x]&&temp==4){
                    testis[4]=testis[4]+1;
                }else if (temp==tes[x]&&temp==5){
                    testis[5]=testis[5]+1;
                }
                else if (temp==tes[x]&&temp==6){
                    testis[6]=testis[6]+1;
                }else if (temp==tes[x]&&temp==7){
                    testis[7]=testis[7]+1;
                }else if (temp==tes[x]&&temp==8){
                    testis[8]=testis[8]+1;
                }
                else if (temp==tes[x]&&temp==9){
                    testis[9]=testis[9]+1;
            }
        }
        //inisialisasi variabel untuk membantu mencari kedua angka terbesar
        int max=0;
        int maxi=0;
        for (int x=0;x<10;x++){
            //jika max lebih kecil dari angka dalam testis indeks x maka maxi diisi max dan max diisi angka testis indeks x
            if (max<testis[x]){
                maxi=max;
                max=testis[x];
            }
            //jika maxi lebih kecil dari angka dalam testis index x dan angka dalam testis index x lebih kecil dari max
            //masukkan angka dalam testis indeks x ke maxi
            if (maxi<testis[x]&&testis[x]<max){
                maxi=testis[x];
            }
        }
        for (int x=0;x<10;x++){
            //jika angka dalam testis indeks x sama dengan maxi maka print isi int x dan int maxi
            if (testis[x]==maxi){
                System.out.println(x+" "+maxi);
            }
        }
    }
}
