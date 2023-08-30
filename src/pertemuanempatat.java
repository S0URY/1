import java.util.Scanner;

public class pertemuanempatat {
    public static void main(String[] args) {
        Scanner b=new Scanner(System.in);
        String a=b.nextLine();
        String aa= b.nextLine();
        String aaa=b.nextLine();
        if(a.equals("mamalia")){
            if(aa.equals("kaki empat")){
                if(aaa.equals("omnivora")){
                    System.out.println("kera");
                }
            }
        } else if (a.equals("amphibia")) {
            if (aa.equals("kaki empat")){
                if(aaa.equals("insectivora")){
                    System.out.println("kadal");
                }
            }
        } else if (a.equals("aves")) {
            if (aa.equals("kaki dua")){
                if(aaa.equals("karnivora")){
                    System.out.println("elang");
                }
            }
        }else{
            System.out.println("ask google");
        }

    }
    }

