import java.util.Random;
import java.util.Scanner;

public class kamisoktober19 {
    public static void main(String[] args) {
        //soal:buat game tebak-tebakan dimana user diminta input angka 1-100, jika salah diberi clue jawaban lebih besar atau jawaban lebih kecil. Jika tebakan benar maka muncul info tebakan benar
        Scanner a=new Scanner(System.in);
        Random r=new Random();
        System.out.println("Input tebakan angka antara 1-100");
        int jawaban=r.nextInt(100)+1;
        int jawab=a.nextInt();
        int gagal=0;
        for (int x=0;x<2;x++){
            if (jawab==jawaban){
                System.out.println("Tebakan jawaban benar");
                break;
            }else if (jawab<jawaban){
                System.out.println("Tebakan lebih kecil dari Jawaban");
                System.out.println("Tebak lagi antara 1-100");
                jawab=a.nextInt();
                gagal++;
            }else if (jawab>jawaban){
                System.out.println("Tebakan lebih besar dari Jawaban");
                System.out.println("Tebak lagi antara 1-100");
                jawab=a.nextInt();
                gagal++;
            }
        }
        if (gagal==2){
            System.out.println("Gagal");
            System.out.println(jawaban);
        }
    }

}
