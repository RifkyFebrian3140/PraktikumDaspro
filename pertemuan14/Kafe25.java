package pertemuan14;

public class Kafe25 {
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan+ "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo valid! Anda mendapat diskon 50%!");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo valid! Anda mendapat diskon 30%!");
        } else {
            System.out.println("Kode promo tidak valid.");
        }

        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappucino - Rp 20.000");
        System.out.println("3. Latte - Rp 22.000");
        System.out.println("4. Teh Tarik - Rp 12.000");
        System.out.println("5. Roti Bakar - Rp 10.000");
        System.out.println("6. Mie Goreng - Rp 18.000");
        System.out.println("==========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }
    public static void main(String[] args) {

    int[] daftarMenu = {1, 3, 5};
    int[] jumlahItem = {2, 1, 4};

    String kodePromo = "DISKON30";

    int totalKeseluruhan = 0;

    for (int i = 0; i < daftarMenu.length; i++) {
        int totalPerMenu = hitungTotalHargaNoAbsen(daftarMenu[i], jumlahItem[i], kodePromo);
        totalKeseluruhan += totalPerMenu;
    }

    System.out.println("----------------------------");
    System.out.println("Total Keseluruhan: Rp " + totalKeseluruhan);
}

    public static int hitungTotalHargaNoAbsen(int pilihanMenu, int banyakItem, String kodePromo) {
    int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

    int totalHarga = hargaItems[pilihanMenu - 1] * banyakItem;
    int diskon = 0;

    if (kodePromo.equals("DISKON50")) {
        diskon = totalHarga * 50 / 100;
        System.out.println("Diskon 50% diterapkan: -" + diskon);
    } else if (kodePromo.equals("DISKON30")) {
        diskon = totalHarga * 30 / 100;
        System.out.println("Diskon 30% diterapkan: -" + diskon);
    } else {
        System.out.println("Kode promo tidak valid. Tidak ada diskon.");
    }

    return totalHarga - diskon;
    }
}