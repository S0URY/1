import java.util.Random;
import java.util.Scanner;
//program dapat diinput tahun dan dapat menentukan jika tahun itu termasuk tahun kabisat atau tidak
public class pertemuanlima {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("masukkan tahun");
        int thn= a.nextInt();;
        if (thn%400==0){
            System.out.println("kabisat");
              }else {
              if (thn%100==0){
                System.out.println("bukan kabisat");
                 }
              else if (thn%4==0) {
                System.out.println("kabisat");                
                 }
              else if (thn%4!=0) {
                System.out.println("bukan kabisat");
              }
            //5 angka diinput untuk mengetahui hasil akhirnya titiknya berada di dalam atau luar atau tepat di lingkaran

            System.out.println("5 angka yang dihitung");
            int wan= a.nextInt(); //a
            int tu=a.nextInt(); //b
            int tri=a.nextInt(); //r
            int fol=a.nextInt(); //x
            int faif=a.nextInt(); //y

                 int folwan=fol-wan;
                 int folwann=folwan*folwan;
                 int faitu=faif-tu;
                  int faiftu=faitu*faitu;
                  int trii=tri*tri;

                  if (faiftu==trii){
                      System.out.println("berada tepat di lingkaran");

                  } else if (faiftu<trii){
                      System.out.println("berada di dalam lingkaran");

                   }if (faiftu>trii){
                        System.out.println("berada di luar lingkaran");
            }

                  //main batu gunting kertas, jika menang data kata-kata "u win", jika kalah maka kalian skill issue, jika tie what
            System.out.println("Pilih Gunting(1), Batu(2), Kertas(3)");
            int player=a.nextInt();
            Random bruh = new Random();
                int bot = bruh.nextInt(3) + 1;
            System.out.println("Bot:"+bot);
            System.out.println("U:"+player);
            if (player==1&&bot==2){
                System.out.println("skill issue");
                      } else if (player==1&&bot==3) {
                            System.out.println("u win");
                     } else if (player==bot) {
                            System.out.println("what");
                     } else if (player==2&&bot==1) {
                            System.out.println("u win");
                     } else if (player==2&&bot==3) {
                            System.out.println("skill issue");
                    } else if (player==3&&bot==1) {
                            System.out.println("skill issue");
                    }else{
                            System.out.println("u win");
            }
        }
    }
}