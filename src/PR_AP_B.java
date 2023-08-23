import java.util.Scanner;

public class PR_AP_B {
    public static void main(String[] args) {
        double sisiP, angkaTerbesar, sisiLain;
        Scanner a = new Scanner(System.in);
        System.out.println("input 3 angka untuk menentukan jenis segitiga untuk tugas ap b segitiga");
        int q = a.nextInt();
        int w = a.nextInt();
        int e = a.nextInt();

        if (q>=w && q>=e){
            sisiP=q;
            angkaTerbesar = Math.pow(q,2);
            sisiLain = Math.pow(e,2)+Math.pow(w,2);
        } else if (w>=q && w>=e) {
            sisiP=w;
            angkaTerbesar = Math.pow(w,2);
            sisiLain = Math.pow(q,2)+Math.pow(e,2);
        }
        else{
            sisiP=e;
            angkaTerbesar = Math.pow(e,2);
            sisiLain = Math.pow(q,2)+Math.pow(w,2);
        }

        if (q==w && q==e){
            System.out.println("sama sisi");
        } else if (q==w || q==e || w==e) {
            System.out.println("sama kaki");
        } else if (angkaTerbesar==sisiLain) {
            System.out.println("siku-siku");
        }
        else {
            System.out.println("sembarang");
        }
    }
}