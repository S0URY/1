import java.util.Scanner;

//menginput 1 angka, akan dicari angka prima yang dibawah angka inputan dan hasil angka prima itu dijumlah
public class tugas6septemberr {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int wan = a.nextInt();
        int primeT = 0;
        for (int x = 2; x <= wan; x++) {
            int faktor = 0;
            for (int y = 1; y <= x; y++) {
                if (x % y == 0) {
                    faktor = faktor + 1;
                }
            }
            if (faktor == 2){
                System.out.print(x + " ");
                primeT += x;
            }
        }
        System.out.println();
        System.out.println(primeT);
    }
}