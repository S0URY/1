import java.util.Arrays;
import java.util.Scanner;

public class nov15 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        //inisialisasi array 1d yang kosong isinya dan 2 integer lain
        //satu integer buat saat sorting satunya untul while loop
        int []array={ };
        int boo=0;
        int temp=0;
        //isi array diprint dulu
        System.out.println(Arrays.toString(array));
        //loop berjalan selama int boo itu lebih kecil dari 1
        while (boo<1){
            //ketik y atau n. y untuk menambah 1 angka yang nantinya disortir dari terbesar ke terkecil sedangkan n akan menutup program
            System.out.println("y / n");
            String input= a.next();
            if (input.equalsIgnoreCase("y")) {
                int []arraya=new int[array.length+1];
                System.out.println("Input angka");
                for (int x=0;x<array.length;x++){
                    arraya[x]=array[x];
                }
                arraya[array.length]=a.nextInt();
                a.nextLine();
                for (int x=0;x<arraya.length;x++){
                   for (int y=0;y<arraya.length;y++){
                       if (arraya[x]>arraya[y]){
                           temp=arraya[x];
                           arraya[x]=arraya[y];
                           arraya[y]=temp;
                       }
                   }
                }
                temp=0;
                    System.out.println(Arrays.toString(arraya));
                array=arraya;
            }else if (input.equalsIgnoreCase("n")){
                boo=5;
            }
        }
    }
}
