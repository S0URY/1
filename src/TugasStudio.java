import java.util.Scanner;

public class TugasStudio {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int kloter = a.nextInt();
        int i=0;
        while (kloter < 1 || kloter > 10) {
            kloter = a.nextInt();
        }
        int[][] tamekloter = new int[kloter][2];
        for ( i = 0; i < kloter; i++) {
            tamekloter[i][0] = readValidInput(a);
            tamekloter[i][1] = readValidInput(a);
        }
        int tempy = findMinProcessingTime(tamekloter);
        System.out.println(tempy);
    }
    private static int readValidInput(Scanner scanner) {
        int input = scanner.nextInt();
        while (input < 2 || input > 1000) {
            input = scanner.nextInt();
        }
        return input;
    }
    private static int findMinProcessingTime(int[][] tamekloter) {
        int tempy = findMaxWaitingTime(tamekloter);
        while (true) {
            boolean temporn = true;
            for (int[] batch : tamekloter) {
                if ((tempy - batch[1]) % batch[0] != 0) {
                    temporn = false;
                    break;
                }
            }
            if (temporn) {
                return tempy;
            }
            tempy++;
        }
    }
    private static int findMaxWaitingTime(int[][] tamekloter) {
        int tempoor = Integer.MIN_VALUE;
        for (int[] batch : tamekloter) {
            tempoor = Math.max(tempoor, batch[1]);
        }
        return tempoor;
    }
}