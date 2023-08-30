import java.util.Scanner;

public class tgsprtmn5 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("ketik satu huruf/angka yang akan dikonvert ke kode morse");
        char mos = a.next().charAt(0);
        String molsh=morsh.toMorse(mos);
        System.out.println(molsh);
//di atas ini digunakan untuk mendapatkan angka/huruf yang akan diubah ke kode morse lewat inputan user
//yang di bawah ini sampai baris ke 27 itu kode untuk inputan data dan hasil akhir dari fungsi yang di bawah yang diminta di soal 2
        System.out.println("masukkan nama, nrp dan 3 nilai");
        String nama=a.next();
        String naman=a.next();
        String namann=a.next();
        String nrp=a.next();
        double n1=a.nextDouble();
        double n2= a.nextDouble();
        double n3=a.nextDouble();

        double overalln=overall(n1, n2, n3);
        double score=angka(overalln);
        String rank=grade(score);
        System.out.println("Nama:"+nama+" "+naman+" "+namann);
        System.out.println("NRP:"+nrp);
        System.out.println("Predikat:"+rank);
    }

//morsh dan toMorse itu digunakan untuk membantu mengubah hasil inputan dari soal nomor 1 menjadi kode morse
    public class morsh {
        public static String toMorse(char mos) {
            String moss = "" + mos;
            String mosh = moss.toUpperCase();
            switch (mosh) {
                case "A":
                    System.out.println("._");
                    break;
                case "B":
                    System.out.println("_...");
                    break;
                case "C":
                    System.out.println("_._.");
                    break;
                case "D":
                    System.out.println("_..");
                    break;
                case "E":
                    System.out.println(".");
                    break;
                case "F":
                    System.out.println(".._.");
                    break;
                case "G":
                    System.out.println("__.");
                    break;
                case "H":
                    System.out.println("....");
                    break;
                case "I":
                    System.out.println("..");
                    break;
                case "J":
                    System.out.println(".___");
                    break;
                case "K":
                    System.out.println("_._");
                    break;
                case "L":
                    System.out.println("._..");
                    break;
                case "M":
                    System.out.println("__");
                    break;
                case "N":
                    System.out.println("_.");
                    break;
                case "O":
                    System.out.println("___");
                    break;
                case "P":
                    System.out.println(".__.");
                    break;
                case "Q":
                    System.out.println("__._");
                    break;
                case "R":
                    System.out.println("._.");
                    break;
                case "S":
                    System.out.println("...");
                    break;
                case "T":
                    System.out.println("_");
                    break;
                case "U":
                    System.out.println(".._");
                    break;
                case "V":
                    System.out.println("..._");
                    break;
                case "W":
                    System.out.println(".__");
                    break;
                case "X":
                    System.out.println("_.._");
                    break;
                case "Y":
                    System.out.println("_.__");
                    break;
                case "Z":
                    System.out.println("__..");
                    break;

                case "1":
                    System.out.println(".____");
                    break;
                case "2":
                    System.out.println("..___");
                    break;
                case "3":
                    System.out.println("...__");
                    break;
                case "4":
                    System.out.println("...._");
                    break;
                case "5":
                    System.out.println(".....");
                    break;
                case "6":
                    System.out.println("_....");
                    break;
                case "7":
                    System.out.println("__...");
                    break;
                case "8":
                    System.out.println("___..");
                    break;
                case "9":
                    System.out.println("____.");
                    break;
                case "0":
                    System.out.println("_____");
                    break;
                default:
                    System.out.println("Data not found");
            }
            return " ";
        }

    //dari baris ini sampai ke bawah itu fungsi untuk menghitung nilai rata-rata, predikat, dan ipk murid(soal pr nomor 2)
    }public static double overall(double n1, double n2, double n3){
        double totaln=n1+n2+n3;
        double overalln=totaln/3;
        return Math.ceil(overalln);
    }
public static double angka(double overalln){
        if (overalln>=86 && overalln <=100){
            return 4.0;
        } else if (overalln>=76 && overalln<=85) {
            return 3.5;
        } else if (overalln>=69 && overalln<=75) {
            return 3.0;
        } else if (overalln>=61 && overalln<=68) {
            return 2.5;
        } else if (overalln>=56 && overalln<=60) {
            return 2.0;
        } else if (overalln>=41 && overalln<=55) {
            return 1.0;
        }else {
            return 0.0;
        }
}public static String grade(double score){
        if (score==4.0){
            return "A";
        } else if (score>=3.5 && score<4.0) {
            return "B+";
        } else if (score>=3.0 && score<3.5) {
            return "B";
        } else if (score>=2.5 && score<3.0) {
            return "C+";
        } else if (score>=2.0 && score<2.5) {
            return "C";
        } else if (score>=1.0 && score<2.0) {
            return "D";
        } else if (score>=0.0 && score<1.0) {
            return "E";
        }
        return "";
    }

}
