import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double kecepatanAwal = sc.nextDouble();
        double kecepatanAkhir = sc.nextDouble();
        double perpindahan = 4500.0;
        double waktu = 2.0 * perpindahan / (kecepatanAwal + kecepatanAkhir) ;
        System.out.println(waktu > 600.0);
    }
}