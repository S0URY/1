import java.util.Scanner;

public class kamisoktober19prr {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Masukkan bilangan");
        int namba= a.nextInt();
        int []array=new int[namba];
        int []awway=new int[namba];
        int start=1;
        for (int x=0;x<namba;x++){
            awway[x]=x+start;
            array[x]=x+start;
        }
        for (int x=0;x<array.length;x++){
            for (int y=0;y<awway.length;y++){
                if (array[x]+awway[y]==namba){
                    if (checker(array[x])&&checker(awway[y])){
                        System.out.print(array[x]+"+"+awway[y]+"\n");
                        array[x]=0;
                        awway[y]=0;
                    }
                }
            }
        }
    }
    public static boolean checker(int numero){
        if (numero<=1){
            return false;
        }
        for (int q=2;q<=Math.sqrt(numero);q++) {
            if (numero%q==0) {
                return false;
            }
        }return true;
        }
        }