import java.util.Scanner;

public class TugasMakananCafe25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };

        System.out.print("Masukkan nama makanan/minuman yang ingin dicari: ");
        String makananDicari = sc.nextLine();

        boolean ditemukan = false; 
        int indeksHasil = -1; 

        for (int i = 0; i < menu.length; i++) {
 
            if (makananDicari.equalsIgnoreCase(menu[i])) {
                ditemukan = true; 
                indeksHasil = i; 
                break;
            }
        }

        if (ditemukan) {
            System.out.println("\n===== HASIL PENCARIAN =====");
            System.out.println("Makanan/Minuman \"" + makananDicari + "\" tersedia di menu.");

            System.out.println("Data ditemukan pada indeks ke-" + indeksHasil);
        } else {
            System.out.println("\n===== HASIL PENCARIAN =====");
            System.out.println("Maaf, Makanan/Minuman \"" + makananDicari + "\" tidak ada di menu.");
        }

        sc.close();
    }
}