import java.util.Scanner;
import java.text.DecimalFormat;
public class lnjtntgsprtmn5 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Pilih yang mana:" +
                "1. Rumah, 2. Industri, 3. Pertanian, 4.Medis/Pendidikan");
        double pilihan=a.nextInt();
        System.out.println("pemakaian kwh per hari");
        double daily=a.nextInt();
        double monthly=daily*30;
        double price=0;
        DecimalFormat df= new DecimalFormat("0.00");
        if (pilihan==1 && daily<500){
            price=418;
        } else if ((pilihan==1 && (daily>500 && daily<1000))) {
            price=640;
        } else if ((pilihan==1 && daily>=1000)) {
            price=820;
        } else if (pilihan==2 && daily<3000) {
            price=544;
        } else if (pilihan==2 && daily>=3000) {
           price=890;
        } else if (pilihan==3 && daily<1000) {
            price=420;
        } else if (pilihan==3 && daily>=1000) {
            price=696;
        } else if (pilihan==4 && daily<2000) {
            price=267;
        } else{
            price=419;
        }
        double monthusage=price*monthly;
        double diskon=0;
        if (monthusage<10000000){
            diskon=0.03d;
        } else if (monthusage<10000000 && monthusage<50000000) {
            diskon=0.05d;
        }else {
            diskon=0.08d;
        }
        double kalkulasidiskon=1-diskon;
        double pembayaranwip=price*monthly*kalkulasidiskon;
        double pembayaran= Double.parseDouble(df.format(pembayaranwip));
        System.out.println("Yang dibayar: Rp. "+pembayaran);
    }
}
