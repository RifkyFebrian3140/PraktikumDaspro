package pertemuan14;
import java.util.Scanner;

public class RekapPenjualanKafe25 {

    static Scanner input = new Scanner(System.in);

    static String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};

    public static void inputPenjualan(int[][] penjualan) {
        System.out.println("=== Input Data Penjualan 7 Hari ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Menu: " + menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.print("  Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = input.nextInt();
            }
            System.out.println();
        }
    }

    public static void tampilPenjualan(int[][] penjualan) {
        System.out.println("\n=== Tabel Penjualan Kafe 7 Hari ===");
        System.out.printf("%-15s", "Menu");
        for (int h = 1; h <= 7; h++) {
            System.out.printf("Hari %d ", h);
        }
        System.out.println();

        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%-15s", menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.printf("%-7d ", penjualan[i][j]);
            }
            System.out.println();
        }
    }

    public static void menuTertinggi(int[][] penjualan) {
        int maxTotal = -1;
        String menuTerlaris = "";

        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                menuTerlaris = menu[i];
            }
        }

        System.out.println("\n=== Menu dengan Penjualan Tertinggi ===");
        System.out.println(menuTerlaris + " (Total: " + maxTotal + ")");
    }

    public static void rataRataPenjualan(int[][] penjualan) {
        System.out.println("\n=== Rata-rata Penjualan Tiap Menu ===");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j];
            }
            double avg = total / 7.0;
            System.out.println(menu[i] + ": " + avg);
        }
    }

    public static void main(String[] args) {

        int[][] penjualan = new int[5][7];

        inputPenjualan(penjualan);
        tampilPenjualan(penjualan);
        menuTertinggi(penjualan);
        rataRataPenjualan(penjualan);
    }
}
