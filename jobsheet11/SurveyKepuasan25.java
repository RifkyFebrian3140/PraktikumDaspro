package jobsheet11;

import java.util.Scanner;

public class SurveyKepuasan25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] survei = new int[10][6];
        
        System.out.println("=== INPUT HASIL SURVEY ===");
        for (int i = 0; i < 10; i++) {
            System.out.println("Responden " + (i + 1) + ":");
            for (int j = 0; j < 6; j++) {
                System.out.print("  Pertanyaan " + (j + 1) + ": ");
                survei[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\n=== HASIL SURVEY ===");
        for (int i = 0; i < 10; i++) {
            System.out.print("R" + (i+1) + ": ");
            for (int j = 0; j < 6; j++) {
                System.out.print(survei[i][j] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}