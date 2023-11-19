import java.util.Scanner;

public class nov8 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Input Panjang alas kertas");
        int p= a.nextInt();
        System.out.println("Input Lebar alas kertas");
        int l= a.nextInt();
        System.out.println("Input Panjang kotak 1");
        int pkotak= a.nextInt();
        System.out.println("Input Lebar kotak 1");
        int lkotak= a.nextInt();
        System.out.println("Input Panjang kotak 2");
        int pkotakk= a.nextInt();
        System.out.println("Input Lebar kotak 2");
        int lkotakk= a.nextInt();
        int temp=0;
        int cek=0;
        int ceky=0;
        int wau=0;
        for (int x=0;x<2;x++){
            if (x>0){
                temp=pkotak;
                pkotak=lkotak;
                lkotak=temp;
            }
            if (p>=pkotak&&l>=lkotak){
                cek++;
            }else {
                wau++;
            }
        }
        if (wau>0&&cek>0){
            p=p-lkotak;
        }else if (cek>0&&wau==0){
            temp=pkotak;
            pkotak=lkotak;
            lkotak=temp;
            p=p-pkotak;
        }
        if (cek>1){
            cek=cek-1;
        }
        for (int x=0;x<2;x++){
            if (x>0){
                temp=pkotakk;
                pkotakk=lkotakk;
                lkotakk=temp;
            }
            if (p>=pkotakk&&l>=lkotakk){
                ceky++;
            }
        }
        if (cek==ceky){
            System.out.println("Bisa");
        }else {
            System.out.println("Tidak Bisa");
        }
    }
}
