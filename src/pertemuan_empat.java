import java.util.Scanner;

public class pertemuan_empat {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String i = a.next();
        switch (i) {
            case "mata":
                System.out.println("eye");
                break;
            case "kamu":
                System.out.println("you");
                break;
            case "kami":
                System.out.println("we");
                break;
            case "mereka":
                System.out.println("they");
                break;
            case "minyak":
                System.out.println("oil");
                break;
            default:
                System.out.println("bruh");
                break;

        }
    }
}

