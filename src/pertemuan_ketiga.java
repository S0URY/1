import java.util.Scanner;

public class pertemuan_ketiga {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("angkanya pls");
        int p = a.nextInt();
        int l = a.nextInt();
        int m = a.nextInt();
        if (p > l && p > m) {
            System.out.println(p);
        } else {
            if (l > p && l > m) {
                System.out.println(l);
            } else {
                if (m > l && m > p) {
                    System.out.println(m);
                }

                System.out.println("input 3 sisi");
                float y = a.nextFloat();
                float h = a.nextFloat();
                float n = a.nextFloat();
                if (y >= h && y >= n) {
                    if (y < h + n) {
                        double luasY=y+h+n*0.5d;
                        System.out.println("sisi panjang:"+y);
                        System.out.println(luasY);
                    }
                }

                else if (h < n && y < n) {
                            if (n < h + y) {
                                double luasN=y+h+n*0.5d;
                                System.out.println("sisi panjang:"+n);
                                System.out.println(luasN);
                            }
                        }
                       else if (n < h && y < h) {
                            if (h < n + y) {
                                double luasH=y+h+n*0.5d;
                                System.out.println("sisi panjang:"+h);
                                System.out.println(luasH);

                                }
                            }
                        }
                    }
                }
            }
