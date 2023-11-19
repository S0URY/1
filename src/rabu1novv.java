import java.util.Scanner;

public class rabu1novv {
    //yang ini banyak minta bantu online
        private static String konversi(
                String kalimat, int row)
        {
            if (row <= 1)
            {
                return kalimat;
            }
            StringBuilder result = new
                    StringBuilder();
            for (int x = 0; x < row; x++) {
                int i = x;
                boolean up = true;
                while (i < kalimat.length())
                {
                    result = result.append(kalimat.charAt(i));
                    if (x == 0 || x == row - 1) {
                        i += (2 * row - 2);
                    }
                    else {
                        if (up) {
                            i += (2 * (row - x) - 2);
                        }
                        else {
                            i += x * 2;
                        }
                        up ^= true;
                    }
                }
            }
            return result.toString();
        }
        public static void main(String[] args) {
            Scanner a=new Scanner(System.in);
            System.out.println("Kalimat yang akan dikonversi");
            String kalimat = a.nextLine();
            System.out.println("Berapa baris yang digunakan dalam konversi");
            int row=a.nextInt();
            System.out.println(konversi(kalimat, row));
        }
    }