import java.util.Scanner;

public class kaamis16nov {
    public static void main(String[] args) {
        char a = 'A';
        char b = 'B';
        char c = 'C';
       /*for (int x=0;x<4;x++){
           for (int y=0+x;y<4;y++){
               for (int z=0+y;z<4;z++) {
                   if (b >= 'E') {
                       b = 'A';
                   }
                   if (c >= 'E') {
                       c = 'A';
                   }
                   if (((char) (c + z) != 'C' && (char) (b + y) != 'D' && (char) (a + x) == 'D')) {
                       if ((char) (a + x)<='E'&& (char) (b + y)<='E'&&(char) (c + z)<='E') {
                           System.out.println((char) (a + x) + "" + (char) (b + y) + "" + (char) (c + z));
                       }
                   }if (((char) (b + y) != 'C' && (char) (c + z) == 'D' && (char) (a + x) != 'D')) {
                       if ((char) (a + x)<='E'&& (char) (b + y)<='E'&&(char) (c + z)<='E') {
                           System.out.println((char) (a + x) + "" + (char) (b + y) + "" + (char) (c + z));
                       }
                   }if (((char) (a + x) != 'C' && (char) (c + z) != 'D' && (char) (b + y) == 'D')) {
                       if ((char) (a + x)<='E'&& (char) (b + y)<='E'&&(char) (c + z)<='E') {
                           System.out.println((char) (a + x) + "" + (char) (b + y) + "" + (char) (c + z));
                       }
                   }
                   if (((char) (a + x) != 'C' && (char) (b + y) != 'D' && (char) (c + z) != 'D')) {
                       if ((char) (a + x)<='E'&& (char) (b + y)<='E'&&(char) (c + z)<='E') {
                           System.out.println((char) (a + x) + "" + (char) (b + y) + "" + (char) (c + z));
                       }
                   }
               }
           }
       }*/
        //atas itu nomor C, line 39 itu mulainya nomor B
       /* a='A';
       b='B';
       c='C';
       for (int x=0;x<4;x++){
           for (int y=x;y<4;y++){
               for (int z=y;z<4;z++){
                   if ((char)(b+y) > 'E') {
                       b = 'A';
                   }
                   if ((char)(c+z) > 'E') {
                       c = 'A';
                   }
                   System.out.println((char) (a + x) + "" + (char) (b + y) + "" + (char) (c + z));
               }
           }
       }*/
        //bawah itu nomor A
        a = 'A';
        b = 'B';
        c = 'C';
        for (int x = 0; x < 4; x++) {
            for (int y = 0 + x; y < 4; y++) {
                for (int z = 0 + y; z < 4; z++) {
                    if (b >= 'E') {
                        b = 'A';
                    }
                    if (c >= 'E') {
                        c = 'A';
                    }
                    if ((char) (a + x) <= 'E' && (char) (b + y) <= 'E' && (char) (c + z) <= 'E') {
                        System.out.println((char) (a + x) + "" + (char) (b + y) + "" + (char) (c + z));
                    }
                }
            }
        }
    }
}