import java.util.Scanner;

public class pr20rabuuu {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Batas matriks isi dulu(bentuknya baris, kolom)");
        int x = a.nextInt();
        int y = a.nextInt();
        //menginput untuk batas array yang disimpan di x dan y
        int[][] matwiksh = new int[x][y];
        int[][] martix = new int[y][x];
        int o = matwiksh.length;
        int t = matwiksh[0].length;
        //o dan t akan menghitung panjang baris dan kolom matwiksh
        int u = 0;
        int e = 0;
        int pilih = 0;
        System.out.println("Input isi matriks(baris, kolom)");
        for (int q = 0; q < x; q++) {
            for (int w = 0; w < y; w++) {
                matwiksh[q][w] = a.nextInt();
            }
            //loop untuk menginput isi matriks sesuai batas yang ditentukan
        }
        while (e == 0) {
            o = matwiksh.length;
            t = matwiksh[0].length;
            //mengantisipasi jika ada perubahan dalam bentuk matriks
            System.out.println("Matriks:");
            if (u == 1) {
                o = matwiksh.length;
                t = matwiksh[0].length;
                for (int w = 0; w < o; w++) {
                    for (int q = 0; q < t; q++) {
                        System.out.print(matwiksh[w][q] + " ");
                    }
                    System.out.println();
                }
            }  else {
                o = matwiksh.length;
                t = matwiksh[0].length;
                for (int w = 0; w < o; w++) {
                    for (int q = 0; q < t; q++) {
                        System.out.print(matwiksh[w][q] + " ");
                    }
                    System.out.println();
                }
            }
            System.out.println("Pilih aksi:");
            System.out.println("1. Putar kanan/right\n" + "2. Putar kiri/left\n" + "3. Balik secara horizontal\n" + "4. Balik secara vertikal\n" + "5. Keluar?");
            pilih = a.nextInt();
            //proses pemutaran matriks ke kanan
            if (pilih == 1) {
                o = matwiksh.length;
                t = matwiksh[0].length;
                martix=new int[t][o];
                if (u==1){
                    u=0;
                }
                for (int w = 0; w < o; w++) {
                    for (int q = 0; q < t; q++) {
                        martix[q][o - 1 - w] = matwiksh[w][q];
                    }
                }
                matwiksh = martix;
                if (u == 0) {
                    u = 1;
                }
            }
            //proses pemutaran matriks ke kiri
            if (pilih==2){
                o = matwiksh.length;
                t = matwiksh[0].length;
                martix=new int[t][o];
                if (u==1){
                    u=0;
                }
                for (int w=0;w<o;w++){
                    for (int q=0;q<t;q++){
                        martix[t-1-q][w]=matwiksh[w][q];
                    }
                }
                matwiksh=martix;
                if (u==0){
                    u=1;
                }
            }//proses membalik matriks secara horizontal
            // contohnya 1 2 3
            //           5 6 7
            //menjadi    3 2 1
            //           7 6 5
            if (pilih==3){
                o = matwiksh.length;
                t = matwiksh[0].length;
                martix=new int[o][t];
                if (u==1){
                    u=0;
                }
                for (int w=0;w<o;w++){
                    for (int q=0;q<t;q++){
                        martix[w][q]=matwiksh[w][t-1-q];
                    }
                }
                matwiksh=martix;
                if (u==0){
                    u=1;
                }
            }//proses pembalikan matriks secara vertikal
            //contohnya 1  3
            //          2  4
            //yang menjadi 2  4
            //             1  3
            if (pilih==4){
                o = matwiksh.length;
                t = matwiksh[0].length;
                martix=new int[o][t];
                if (u==1){
                    u=0;
                }
                for (int w=0;w<o;w++){
                    for (int q=0;q<t;q++){
                        martix[w][q]=matwiksh[o-1-w][q];
                    }
                }
                matwiksh=martix;
                if (u==0){
                    u=1;
                }
            }//pembubaran program jika menginput pilihan 5, jika angka selain 1-4 atau 5 maka dapat menginput ulang inputan
            if (pilih==5){
                System.out.println("ok");
                break;
            }
            }
        }
        }