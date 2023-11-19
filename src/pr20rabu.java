import java.util.Locale;
import java.util.Scanner;

public class pr20rabu {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        //bar_is dan kowloom posisi awal Dono/karakter pemain
        int bar_is=4;
        int kowloom=0;
        int o=1;
        char [][] m=new char[5][5];
        m= new char[][]
                {{'.', 'x', 'x', '.', '.'},
                {'x', '.', '.', 'Y', '.'},
                {'.', '.', 'x', 'x', '.'},
                {'.', 'x', 'x', '.', '.'},
                {'D', '.', '.', '.', '.'}};
        while (o==1){
            System.out.println("Input gerakan WASD");
            for (int q=0;q<5;q++){
                for (int w=0;w<5;w++){
                    System.out.print(m[q][w]+" ");
                }
                System.out.println();
            }
            String wasd= a.next();
            String wasdee=wasd.toLowerCase();
            switch (wasdee){
                case "w"://jika menginput w maka dicek jika bisa maju atau tidak, jika bisa maju maka Dono maju 1 titik
                    //jika ada x didepan Dono maka tidak bisa gerak, jika out of bound juga tidak bisa gerak
                    //jika bertemu dengan Y atau Putri Yanti maka selesai programnya
                    bar_is=bar_is-1;
                    if (bar_is<0||bar_is>4){
                        bar_is++;
                    }
                    if (m[bar_is][kowloom]=='.'){
                      m[bar_is][kowloom]='D';
                      m[bar_is+1][kowloom]='.';
                      break;
                    }
                    if (m[bar_is][kowloom]=='x'){
                        bar_is++;
                    }
                    if (m[bar_is][kowloom]=='Y'){
                        for (int q=0;q<5;q++){
                            for (int w=0;w<5;w++){
                                System.out.print(m[q][w]+" ");
                            }
                            System.out.println();
                        }
                        o--;
                    }break;
                case "s"://jika menginput s maka dicek jika bisa mundur atau tidak, jika bisa mundur maka Dono mundur 1 titik
                    //jika ada s dibelakang Dono maka tidak bisa gerak, jika out of bound juga tidak bisa gerak
                    //jika bertemu dengan Y atau Putri Yanti maka selesai programnya
                    bar_is=bar_is+1;
                    if (bar_is<0||bar_is>4){
                        bar_is--;
                    }
                    if (m[bar_is][kowloom]=='.'){
                        m[bar_is][kowloom]='D';
                        m[bar_is-1][kowloom]='.';
                        break;
                    }
                    if (m[bar_is][kowloom]=='x'){
                        bar_is--;
                        break;
                    }
                    if (m[bar_is][kowloom]=='Y'){
                        for (int q=0;q<5;q++){
                            for (int w=0;w<5;w++){
                                System.out.print(m[q][w]+" ");
                            }
                            System.out.println();
                        }
                        o--;
                        break;
                    }break;
                case "a"://jika menginput a maka dicek jika bisa ke kanan atau tidak, jika bisa ke kanan maka Dono ke kanan 1 titik
                    //jika ada x disebelah Dono maka tidak bisa gerak, jika out of bound juga tidak bisa gerak
                    //jika bertemu dengan Y atau Putri Yanti maka selesai programnya
                    kowloom=kowloom-1;
                    if (kowloom<0||kowloom>4){
                        kowloom++;break;
                    }
                    if (m[bar_is][kowloom]=='.'){
                        m[bar_is][kowloom]='D';
                        m[bar_is][kowloom+1]='.';
                        break;
                    }
                    if (m[bar_is][kowloom]=='x'){
                        kowloom++;break;
                    }
                    if (m[bar_is][kowloom]=='Y'){
                        for (int q=0;q<5;q++){
                            for (int w=0;w<5;w++){
                                System.out.print(m[q][w]+" ");
                            }
                            System.out.println();
                            break;
                        }
                        o--;
                        break;
                    }break;
                case "d"://jika menginput s maka dicek jika bisa ke kiri atau tidak, jika bisa ke kiri maka Dono ke kiri 1 titik
                    //jika ada x disebelah Dono maka tidak bisa gerak, jika out of bound juga tidak bisa gerak
                    //jika bertemu dengan Y atau Putri Yanti maka selesai programnya
                    kowloom=kowloom+1;
                    if (kowloom<0||kowloom>4){
                        kowloom--;break;
                    }
                    if (m[bar_is][kowloom]=='.'){
                        m[bar_is][kowloom]='D';
                        m[bar_is][kowloom-1]='.';
                        break;
                    }
                    if (m[bar_is][kowloom]=='x'){
                        kowloom--;break;
                    }
                    if (m[bar_is][kowloom]=='Y'){
                        for (int q=0;q<5;q++){
                            for (int w=0;w<5;w++){
                                System.out.print(m[q][w]+" ");
                            }
                            System.out.println();
                        }
                        o--;
                        break;
                    }break;
            }
        }
    }
}
