import java.util.Scanner;
//menginput berapa banyak botol baru, bekas yang dimiliki dan berapa banyak botol dibutuhkan untuk mendapat 1 botol baru
// ,hasil output berupa berapa banyak botol yang didapatkan
public class tugas6septemberrrrr {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int niu= a.nextInt();
        int old= a.nextInt();
        int pryce= a.nextInt();
        int niuol=niu+old;
        int get=0;
        while (niuol>=pryce){
            if (niuol<pryce){
                break;
            }niuol-=pryce;
            niuol++;
            get++;
        }
        System.out.println(get);
    }
}
