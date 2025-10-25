package jobsheet5;
import java.util.Scanner;

public class perpustakaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Apakah mahasiswa membawa kartu mahasiswa ? (True/False) : ");
        boolean kartuMahasiswa = sc.nextBoolean();

        System.out.print("Apakah mahasiswa sudah registrasi online ? (True/False) : ");
        Boolean registrasi = sc.nextBoolean();

        if (kartuMahasiswa == true || registrasi == true) {
            System.out.println("Akses masuk diterima");
        } else {
            System.out.println("Akses ditolak");
        }
    }
}