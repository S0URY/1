import java.io.*;
import java.lang.invoke.StringConcatFactory;
import java.util.Scanner;

public class self_pace {
    public static void main(String[] args) throws IOException {
        File a=new File("ceritaLucu.txt");
        Scanner input= new Scanner(System.in);
        String cerita= input.nextLine();
        try{
            if(a.createNewFile()){
                System.out.println("ada file");
            }else {
                System.out.println("file exists");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        magicText(cerita);
    }

    /***
     * ambil teks yang diinput dan mengganti kata "istri" yang ada, jika ada menjadi kata lain yang dinput juga
     * @param cerita
     * @throws IOException
     */
    public static void magicText(String cerita) throws IOException {
        Scanner penggantiIstri=new Scanner(System.in);
        String istrito= penggantiIstri.next();
        String ceritaDirevisi=cerita.replaceAll("istri", istrito);
        FileWriter ceritalagiRevisi=new FileWriter("ceritaLucu.txt");
        ceritalagiRevisi.write(ceritaDirevisi);
        ceritalagiRevisi.close();
    }

    /***
     * membaca pengganti kata istri dan membuat agar magic text bisa jalan
     * @param args
     */
    public static void readText(String[] args){
    try{
        File a=new File("ceritaLucu.txt");
        try {
            Scanner read=new Scanner(a);
            String istrito=read.nextLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    } catch (RuntimeException e) {
        throw new RuntimeException(e);
    }
    }
}