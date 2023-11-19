import java.util.Scanner;

public class senin13nov {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int batas= a.nextInt();
        int []dewet=new int[batas];
        for (int x=0;x<batas;x++){
            dewet[x]=a.nextInt();
        }
        int temp=0;
        int tempy=0;
        for (int x=1;x<dewet.length;x++){
            if (dewet[x-1]>dewet[x]){
                if (dewet[tempy-1]<dewet[x]) {
                    temp++;
                }
            }
            tempy++;
        }
        if (temp>0){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
