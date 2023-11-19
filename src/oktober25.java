import java.util.Scanner;

public class oktober25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String kata=in.nextLine();
        StringBuilder katabaru= new StringBuilder();
        for (int i=0;i<kata.length();i++){
            if ((kata.charAt(i)+5)>90 && (kata.charAt(i)+5)<=95) {
                int hurufBaru=96+ kata.charAt(i)-85;
                katabaru.append((char) hurufBaru);
            }
            else if ((kata.charAt(i)+5)>122 && (kata.charAt(i)+5)<=127){
                int newLetter=64+kata.charAt(i)-117;
                katabaru.append((char) newLetter);
            }
            else if ((kata.charAt(i)+5)<=90 &&  (kata.charAt(i)+5)>=70){
                if (i==0 || kata.charAt(i-1)==' '){
                    katabaru.append((char) (kata.charAt(i) + 5));
                }
                else katabaru.append((char) (kata.charAt(i)+37));
            }
            else if ((kata.charAt(i)+5)<=122 && (kata.charAt(i)+5)>=102){
                if (i==0 || kata.charAt(i-1)==' '){
                    katabaru.append((char) (kata.charAt(i) -27));
                }
                else katabaru.append((char) (kata.charAt(i)+5));
            }
            else if ((kata.charAt(i)-3)>=48 && (kata.charAt(i)-3)<=54){
                katabaru.append((char) (kata.charAt(i)-3));
            }
            else if ((kata.charAt(i)-3)<48 && (kata.charAt(i)-3)>=45 ){
                katabaru.append((char) (58-(48-(kata.charAt(i)-3))));
            }
            else katabaru.append(kata.charAt(i));
        }
        String katakata = katabaru.toString();
        String[] perKata = katakata.split(" ");
        for (int i=perKata.length-1;i>=0;i--){
            System.out.print(perKata[i]+" ");
        }
    }
}
