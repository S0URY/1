import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class kamisssoktober19 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Input 2 kata yang sama panjangnya");
        String kata= a.nextLine();
        String kataa=a.nextLine();
        int checker=0;
        if (kataa.length()!=kata.length()){
            System.out.println("Bukan anagram karena panjang beda");
        }
        String n=kataa.toLowerCase();
        String m=kata.toLowerCase();
        char []word=new char[kataa.length()];
        char []wordd=new char[kataa.length()];
        for (int x=0;x<kataa.length();x++){
            word[x]=kata.charAt(x);
            wordd[x]=kataa.charAt(x);
        }
        Arrays.sort(word);
        Arrays.sort(wordd);
        for (int x=0;x<wordd.length;x++){
                if (word[x]==wordd[x]){
                    checker++;
            }
        }
        if (checker==wordd.length){
            System.out.println("2 kata merupakan anagram");
        }else if(checker!=0){
            System.out.println("Bukan anagram kedua kata");
        }
    }
}