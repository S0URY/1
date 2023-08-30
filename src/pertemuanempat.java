import java.util.Scanner;

public class pertemuanempat {
    public static void main(String[] args) {
        Scanner aa=new Scanner(System.in);
        System.out.println("input keyboard game");
        String k= aa.next();
        switch(k) {
            case "w":
                System.out.println("up");
                break;
            case "a":
                System.out.println("left");
                break;
            case "s":
                System.out.println("down");
                break;
            case "d":
                System.out.println("right");
                break;
            default:
                System.out.println("no");
                break;
        }
    }
}
