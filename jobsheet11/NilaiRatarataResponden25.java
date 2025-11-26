package jobsheet11;

import java.util.Scanner;
public class NilaiRatarataResponden25 {
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
        
        System.out.println("\n=== RATA-RATA RESPONDEN ===");
        for (int i = 0; i < 10; i++) {
            int total = 0;
            for (int j = 0; j < 6; j++) {
                total += survei[i][j];
            }
            System.out.printf("Responden %d: %.2f\n", (i+1), total/6.0);
        }
        
        sc.close();
    }
}

