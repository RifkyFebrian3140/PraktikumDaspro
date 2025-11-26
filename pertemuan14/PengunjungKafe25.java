package pertemuan14;

public class PengunjungKafe25 {
    public static void daftarPengunjung(String namaPengunjung, String budi, String citra) {
        System.out.println("Daftar Nama Pengunjung:");
        for (int i = 0; i < namaPengunjung.length(); i++) {
            System.out.println("- "+namaPengunjung[i]);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
}
}