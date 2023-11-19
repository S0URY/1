import java.util.Scanner;

public class kamisoktober19pr {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        //line 7-8 akan menerima inputan berapa banyak lantai dalam sebuah gedung dalam bentuk Integer
        System.out.println("Input jumlah lantai sebuah gedung");
        int lantai= a.nextInt();
        System.out.println("Lantai superstisi: ");
        //line 12-17 berisi loop yang berfungsi untuk mengecek apakah suatu lantai memiliki angka 4 atau 13,
        // loop diulang sampai nilai x lebih besar atau sama dengan nilai inputan
        for (int x=0;x<lantai;x++){
            String y=Integer.toString(x);
            if (y.contains("4")||y.contains("13")){
                System.out.print(y+" ");
            }
        }
        //String y digunakan untuk mengambil nilai x dan diubah dalam bentuk String agar dapat dicek dalam if
    }
}
