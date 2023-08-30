import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

/***
 * membaca isi daftar pustaka
 */
public class slef_pace {
    public static void readText(String text) {
        try {
            File b = new File("daftarpustaka.txt");
            try {
                Scanner read = new Scanner(b);
                String baca = read.nextLine();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    /***
     * input nama, tahun, judul, kota, penerbit suatu buku yang nantinya disortir oleh program dengan format nama belakang, nama depan. tahun. judul. kota:penerbit
     * @param args
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("ketik nama, tahun, judul, kota, penerbit suatu buku");
        String nama = a.nextLine();
        String naman = nama.substring(nama.lastIndexOf(" "));
        String namana = nama.substring(0, nama.indexOf(" "));
        String tahun = a.nextLine();
        String judul = a.nextLine();
        String kota = a.nextLine();
        String penerbit = a.nextLine();

        System.out.println(namana + "," + naman + "." + " " + "(" + tahun + ")" + "." + " " + judul + "." + " " + kota + ":" + penerbit);

/***
 * input berapa orang yang akan datang dan program akan menentukan berapa banyak pizza box yang dibutuhkan(S berisi 4, M berisi 6, L berisi 8)
 */
        Scanner p = new Scanner(System.in);
        System.out.println("orang yang datang");
        int orang = p.nextInt();
        int large = orang / 8;
        int largee = orang % 8;
        int medium = large / 6;
        int mediumm = large % 6;
        int smol = medium / 4;
        int smoll = medium % 4;
        if (mediumm>4){
            int smoller=smol-1;
            int mid=medium+1;
            System.out.println("L:" + large);
            System.out.println("M:" + mid);
            System.out.println("S:" + smoller);
        }else {
            if (smoll<=0){
                int smolll=smol+1;
                System.out.println("L:" + large);
                System.out.println("M:" + medium);
                System.out.println("S:" + smolll);
            }else {
                System.out.println("L:" + large);
                System.out.println("M:" + medium);
                System.out.println("S:" + smol);
            }
        }

/***
 * bisa menginput 3 angka yang akan disortir dari kecil ke terbesar
 */
        Scanner k = new Scanner(System.in);
        System.out.println("angka yang diurutkan");
        String aa = a.nextLine();
        String bb = a.nextLine();
        String cc = a.nextLine();

        int wan=Integer.parseInt(aa);
        int tu=Integer.parseInt(bb);
        int tri=Integer.parseInt(cc);

        if (wan >= tu && wan >= tri) {
            if (tu >= tri) {
                System.out.println(tri + "," + tu + "," + wan);
            }
             }else if (wan >= tu && wan >= tri) {
              if (tu <= tri) {
                System.out.println(tu + "," + tri + "," + wan);
            }
                } else if (tu >= wan && tu >= tri) {
                  if (wan >= tri) {
                      System.out.println(tri + "," + wan + "," + tu);
            }
                   }else if (tu >= wan && tu >= tri) {
                    if (wan <= tri) {
                      System.out.println(wan + "," + tri + "," + tu);
                        }
                         }
                           else if (tri >= wan && tri >= tu) {
                              if (wan >= tu) {
                               System.out.println(tu + "," + wan + "," + tri);
                              }
                               }
                                   else if (tri >= wan && tri >= tu) {
                                    if (wan <= tu) {
                                     System.out.println(wan + "," + tu + "," + tri);
                                      }
                                         }
    datamahasiswa();
    }public static void datamahasiswa() {
            Scanner mashuk = new Scanner(System.in);
            System.out.println("beri nrp,nama,jurusan,ipk mahasiswa");
            String nrp = mashuk.nextLine();
            String namas = mashuk.nextLine();
            String jurusan = mashuk.nextLine();
            String ipk = mashuk.nextLine();
            System.out.println("NRP:" + nrp);
            System.out.println("Nama siswa:" + namas);
            System.out.println("Jurusan:" + jurusan);
            System.out.println("IPK:" + ipk);

    }
}