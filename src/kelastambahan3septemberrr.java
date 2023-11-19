import java.util.Scanner;

public class kelastambahan3septemberrr {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Input batas matriks");
        int row=a.nextInt();
        int kolom=a.nextInt();
        int hitungan=0;
        int bariskolom=1;
        while (row!=kolom){
            System.out.println("Input batas lagi");
            row=a.nextInt();
            kolom=a.nextInt();
        }
        int [][]pp=new int[row][kolom];
        System.out.println("Isi array 2 dimensi");
        for (int x=0;x<row;x++){
            for (int y=0;y<kolom;y++){
                pp[x][y]=a.nextInt();
            }
        }
        for (int x=0;x<row;x++){
            for (int y=0;y<kolom;y++){
                System.out.print(pp[x][y]+" ");
            }
            System.out.println();
        }
        for (int x=0;x<row;x++){
            for (int y=0;y<kolom;y++){
                hitungan+=pp[x][y];
            }
            System.out.println("Baris"+bariskolom+"="+hitungan);
            bariskolom++;
            hitungan=0;
    }bariskolom=1;
        for (int x=0;x<row;x++){
            for (int y=0;y<kolom;y++){
                hitungan+=pp[y][x];
            }
            System.out.println("Kolom"+bariskolom+"="+hitungan);
            bariskolom++;
            hitungan=0;
        }bariskolom=1;
        for (int x=0;x<row;x++){
            hitungan+=pp[x][x];
        }
        System.out.println("Diagonal="+hitungan);
        //cara hardcode array(bisa 2d, 3d, 1d, untuk contoh ini 2d)
        //int [][]mm={{2,3,4,2},{5,5,4,7,},{6,6,2,3},{9,8,5,2}};
}
}