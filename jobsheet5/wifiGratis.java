package jobsheet5;
import java.util.Scanner;

public class wifiGratis {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan jenis pengguna (mahasiswa/dosen) : ");
        String jenis_pengguna = sc.nextLine().trim();

        if (jenis_pengguna.equalsIgnoreCase("dosen")) {
            System.out.println("Akses WiFi diberikan (dosen)");
        } else if (jenis_pengguna.equalsIgnoreCase("mahasiswa")) {

            System.out.print("Masukkan jumlah SKS yang diambil: ");
            int jmlSks = sc.nextInt();

            if (jmlSks >= 12) {
                System.out.println("Akses WiFi diberikan (mahasiswa aktif)");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }
        } else {
            System.out.println("Akses Ditolak");
        }

    }
}