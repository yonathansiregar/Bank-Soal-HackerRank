import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String awal = sc.nextLine();
        String[] splitter = awal.split("_");
        String matakuliah1 = splitter[0];
        String kedua = sc.nextLine();
        String[] splitter2 = kedua.split("_");
        String matakuliah2 = splitter2[0];
        float ip = ((nilai(awal) * sks(awal)) + (nilai(kedua) * sks(kedua)));
        float hasil = ip / (sks(awal) + sks(kedua));
        System.out.printf("          KARTU HASIL STUDI          \n");
        System.out.println("=====================================");
        System.out.println("MATA KULIAH             NILAI     SKS");
        System.out.printf("%-23S %5d %7d\n",matakuliah1, nilai(awal), sks(awal));
        System.out.printf("%-23S %5d %7d\n",matakuliah2, nilai(kedua), sks(kedua));
        System.out.println("=====================================");
        System.out.printf("IP                       %.2f        ", hasil);
    }

    static int nilai(String ayam) {
        char bobot_nilai = ayam.charAt(ayam.length() - 3);
        int nilai = Character.getNumericValue(bobot_nilai);
        return nilai;
    }

    static int sks(String ayam) {
        char SKS = ayam.charAt(ayam.length() - 1);
        int bobot_sks = Character.getNumericValue(SKS);
        return bobot_sks;
    }
}