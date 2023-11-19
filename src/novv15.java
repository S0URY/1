import java.util.Scanner;

public class novv15 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        //menerima inputan batas array yang jadinya n*n
        int batas= a.nextInt();
        String [][]tiktak=new String[batas+1][batas+1];
        //inisialisasi beberapa hal untuk menanda petak tic tac toe, loop while, dan cek syarat
        int check=0;
        boolean ceky=true;
        int e=0;
        //loop untuk mencetak angka 0 sampai batas di pojokan model lurus
        for (int x=0;x<tiktak[0].length-1;x++){
            tiktak[x][batas]=String.valueOf(e)+" ";
            e++;
        }
        //loop untuk mengisi null yang ada dalam petak tic tac toe menjadi _|
        for (int x=0;x<batas;x++){
            for (int y=0;y<batas;y++){
                tiktak[x][y]="_|";
            }
        }
        e=0;
        //loop untuk mencetak angka 0 sampai batas di pojokan model tidur
        for (int x=0;x<tiktak.length-1;x++){
            tiktak[batas][x]=String.valueOf(e)+" ";
            e++;
        }
        e=1;
        //bagian array paling pojok diisi + sebagai penanda ujung
        tiktak[batas][batas]="+";
        //loop berjalan selama ceky==true
        //petak tic tac toe diprint dan diminta masukkan koordinat baris kolom, jika inputan bawah 0 atau atas batas maka input ulang
        while (ceky){
            for (int x=0;x<batas+1;x++){
                for (int y=0;y<batas+1;y++){
                    System.out.print(tiktak[x][y]+" ");
                }
                System.out.println();
            }
            System.out.println("Masukkan koordinat baris dan kolom");
            int baris=a.nextInt();
            int kolom=a.nextInt();
            while (baris>batas||baris<0){
                baris=a.nextInt();
            }
            while (kolom>batas||kolom<0){
                kolom=a.nextInt();
            }
            //jika koordinat yang diinput masuk kosong(_|) maka diisi x atau o sesuai ganjil/genap dulu(dimulai ganjil dulu)
            //jika ternyata ada isinya maka inputan tidak valid
            if (tiktak[baris][kolom].equals("_|")) {
                if (e % 2 == 1) {
                    tiktak[baris][kolom] = "x";
                    e++;
                } else if (e % 2 == 0) {
                    tiktak[baris][kolom] = "o";
                    e++;
                }
            }else {
                System.out.println("Inputan tidak valid");
            }
            //inisialisasi variabel untuk mengecek jika diagonal sama atau tidak
            int cert=0;
            int verty=0;
            int vert=0;
                for (int x = 0; x < batas; x++) {
                    if (tiktak[x][x].equalsIgnoreCase("o")) {
                        check++;
                    } else if (tiktak[x][x].equalsIgnoreCase("x")) {
                        vert++;
                    }
                    if (tiktak[baris-1-x][baris-1-x].equalsIgnoreCase("o")){
                        cert++;
                    }else if (tiktak[baris-1-x][baris-1-x].equalsIgnoreCase("x")){
                        verty++;
                    }
                    if ((check == batas||cert==batas) && tiktak[x][x].equalsIgnoreCase("o")) {
                        System.out.println("o menang");
                        ceky = false;
                    } else if ((vert == batas ||verty==batas )&& tiktak[x][x].equalsIgnoreCase("x")) {
                        System.out.println("x menang");
                        ceky = false;
                    }
                }
                //loop untuk mengecek jika ada yang sama atau tidak yang bentuknya horizontal
                for (int x = 0; x < batas; x++) {
                    int rocek=0;
                    int rocek2=0;
                    for (int y = 0; y < batas; y++) {
                        if (tiktak[x][y].equalsIgnoreCase("o")) {
                            rocek++;
                        }else if (tiktak[x][y].equalsIgnoreCase("x")){
                            rocek2++;
                        }
                        if (rocek==batas){
                            System.out.println("o menang");
                            ceky = false;
                        }else if (rocek2==batas){
                            System.out.println("x menang");
                            ceky = false;
                        }
                    }
                }
                //loop untuk mengecek jika ada yang sama atau tidak yang bentuknya vertikal
                for (int x=0;x<batas;x++){
                    int cherk=0;
                    int cherky=0;
                    for (int y=0;y<batas;y++){
                        if (tiktak[y][x].equalsIgnoreCase("o")){
                            cherk++;
                        }else if (tiktak[y][x].equalsIgnoreCase("x")){
                            cherky++;
                        }
                        if (cherk==batas){
                            System.out.println("o menang");
                            ceky = false;
                        }else if (cherky==batas){
                            System.out.println("x menang");
                            ceky = false;
                        }
                    }
                }
                //loop untuk mengecek jika seri atau tidak
                for (int x = 0; x < baris; x++) {
                    int chick=0;
                    for (int y = 0; y < baris; y++) {
                        if (tiktak[x][y].equals("_|")) {
                            chick++;
                        }
                    }
                    if (chick == batas) {
                        System.out.println("Seri");
                        ceky = false;
                        check = 0;
                    }
                }
        }
    }
}