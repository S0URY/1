import java.util.Scanner;

public class pertemuanempatt {
    public static void main(String[] args) {
        Scanner w=new Scanner(System.in);
        String a=w.nextLine();
        String aa=String.valueOf(a.charAt(0));
        switch (aa){
            case "A":
                System.out.println("sastra"); break;
            case "B":
                System.out.println("teknik sipil&perencanaan"); break;
            case "C":
                System.out.println("Teknologi Industri"); break;
            case "D":
                System.out.println("ekonomi"); break;
            case "E":
                System.out.println("seni dan desain"); break;
            case "F":
                System.out.println("ilmu komunikasi"); break;
            case "G":
                System.out.println("ilmu pendidikan");break;
            default:
                System.out.println("bruh");
        }

    }
}
