import java.util.Scanner;

public class TugasStudio {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int batas = a.nextInt();
        int[][] awei = new int[batas][2];
        int temp = 0;
        int tempy = 0;
        for (int x = 0; x < awei.length; x++) {
            for (int y = 0; y < awei[x].length; y++) {
                awei[x][y] = a.nextInt();

            }

        }
        for (int x = 0; x < awei.length; x++) {
            if(awei[x][0]>temp){
                temp = awei[x][0];
                tempy = x;
            }
        }
        int pempin = temp + awei[tempy][1];
        boolean ceky = false;
        boolean tempor = false;
        while(!tempor){
            for (int x = 0; x < awei.length; x++) {
                if (pempin % awei[x][0] == awei[x][1]) {
                    ceky = true;
                } else {
                    ceky = false;
                    break;
                }
            }
            if (ceky) {
                System.out.println(pempin);
                tempor = true;
            }else{
                pempin+=temp;
            }
        }
    }
}