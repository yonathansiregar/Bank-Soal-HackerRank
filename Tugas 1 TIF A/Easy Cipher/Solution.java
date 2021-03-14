import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        int pertambahan = inp.nextInt();
        int a = inp.next().charAt(0);
        int b = inp.next().charAt(0);
        System.out.println((char) (a + pertambahan));
        System.out.println((char) (b + pertambahan));
    }
}