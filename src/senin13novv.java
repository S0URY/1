import java.util.Scanner;

public class senin13novv {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int one = a.nextInt();
        int tu= a.nextInt();
        int baris=0;
        int barees=0;
        int temp=one;
        int tempy=tu;
        while (true){
            temp=temp/10;
            if (temp>0){
                baris++;
            }else if (temp<=0){
                break;
            }
        }while (true){
            tempy=tempy/10;
            if (tempy>0){
                barees++;
            }else if (tempy<=0){
                break;
            }
        }
        baris++;
        barees++;
        int barish=Math.max(baris,barees);
        int salah=0;
        int wrong=0;
        int y=0;
        String m=String.valueOf(one);
        String mm=String.valueOf(tu);
        for (y=0;y<barish;y++){
            temp=one%((int)Math.pow(10,y+1));
            tempy=tu%((int) Math.pow(10,y+1));
                if (temp/(int) Math.pow(10,y)>tempy/(int) Math.pow(10,y)){
                    salah++;
                }if (temp/(int) Math.pow(10,y)<tempy/(int) Math.pow(10,y)){
                    wrong++;
            }
            }
        if (salah==baris){
            System.out.println(one);
            System.out.println("GONE");
        }
        if (wrong==barees){
            System.out.println("GONE");
            System.out.println(tu);
        }
        //aku dah gk tau, bisanya hanya tahu seberapa banyak yang lebih kecil atau lebih besar. buat membuang yang lebih kecil dan diprint saya bingung
        }
    }