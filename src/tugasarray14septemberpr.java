import java.util.Scanner;

public class tugasarray14septemberpr {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];
        int ecksdee = 0;
        int i=0;
        try {
            for (int q=0;q<5;q++) {
                if (q==0) {
                    System.out.println("Data a:");
                }
                a[q]=x.nextInt();
            }//memasukkan inputan data a

            for (int w=0;w<5;w++) {
                if (w==0) {
                    System.out.println("Data b:");
                }
                b[w]=x.nextInt();
            }//memasukkan inputan data b
            int[] c =new int[a.length+ b.length];//menggunakan a.length+b.length untuk dapat batas array c
            //dilakukan jika ukuran array berbeda. artinya dari a.length adalah panjang array a itu berapa angka
            for (int y=0;y<5;y++) {
                c[ecksdee++]=a[y];
            }//array a dimasukkan ke c

            for (int m:b) {
                for (int r=0;r<ecksdee;r++) {
                    if (c[r]==m) {
                        i++;
                        break;
                    }
                    i=0;
                }
                if (i==0) {
                    c[ecksdee++]=m;
                }
            }//array b dimasukkan ke c tetapi dicek juga jika b ada duplikat dengan a sebelum dimasukkan
            //jika ada maka yang duplikat itu tidak dimasukkan dan lanjut ke bagian selanjutnya
            System.out.println("Hasil data gabungan a dan b, juga dibuang duplikatnya:");
            for (int p=0;p<ecksdee;p++) {
                if (c[p]>0) {
                    System.out.print(c[p]+" ");
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {}
    }
}