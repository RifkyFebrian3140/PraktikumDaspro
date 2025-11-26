package jobsheet11;

import java.util.Scanner;

public class RataRataKeseluruhan25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] survei = new int[10][6];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Responden " + (i + 1) + ":");
            for (int j = 0; j < 6; j++) {
                System.out.print("  Pertanyaan " + (j + 1) + ": ");
                survei[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\n=== RATA-RATA KESELURUHAN ===");
        int total = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                total += survei[i][j];
            }
        }
        System.out.printf("Rata-rata keseluruhan: %.2f\n", total/60.0);
        System.out.println("Total data: 60");
        
        sc.close();
    }
}