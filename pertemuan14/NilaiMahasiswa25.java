package pertemuan14;

import java.util.Scanner;
public class NilaiMahasiswa25 {
    public static void isianArray (int[] arr) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" +(i+1)+": ");
            arr[i] = input.nextInt();
        }
    }
    public static void tampilArray(int[] arr) {
        System.out.println("\n=== Daftar Nilai Mahasiswa ===");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Mahasiswa " + (i + 1) + ": " + arr[i]);
        }
    }
    public static int hitTot(int[] arr) {
        int total = 0;
        for (int nilai : arr) {
            total += nilai;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = input.nextInt();

        int[] nilai = new int[N];

        isianArray(nilai);
        tampilArray(nilai);

        int total = hitTot(nilai);

        System.out.println("\nTotal nilai seluruh mahasiswa: " + total);
    }
}