package jobsheet11;
import java.util.Scanner;

public class RataRataPertanyaan25 {
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
        
        System.out.println("\n=== RATA-RATA PERTANYAAN ===");
        for (int j = 0; j < 6; j++) {
            int total = 0;
            for (int i = 0; i < 10; i++) {
                total += survei[i][j];
            }
            System.out.printf("Pertanyaan %d: %.2f\n", (j+1), total/10.0);
        }
        
        sc.close();
    }
}