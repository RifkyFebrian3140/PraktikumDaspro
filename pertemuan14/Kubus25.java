package pertemuan14;

import java.util.Scanner;
public class Kubus25 {

public static int hitungVolume (int sisi) {
    int volume = sisi*sisi*sisi;
    return volume;
    }
public static int hitungLuarPermukaan (int sisi) {
    int luasPermukaan = 6 * sisi * sisi;
    return luasPermukaan;
    }
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int sisi, vol, luasPermukaan;

    System.out.println("Masukkan sisi");
    sisi = input.nextInt();

    vol = hitungVolume(sisi);
    System.out.println("Volume kubus adalah " + vol);

    luasPermukaan = hitungLuarPermukaan(sisi);
    System.out.println("Luas permukaan kubus adalah " + luasPermukaan);

    input.close();
    }
}
