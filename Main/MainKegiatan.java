/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;
import service.KegiatanManager;

public class MainKegiatan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        KegiatanManager manager = new KegiatanManager();

        int pilih = 0;
        while (pilih != 6) {
            System.out.println("\n=== Sistem Manajemen Kegiatan Sosial ===");
            System.out.println("1. Tambah Kegiatan");
            System.out.println("2. Lihat Kegiatan");
            System.out.println("3. Update Kegiatan");
            System.out.println("4. Hapus Kegiatan");
            System.out.println("5. Cari Kegiatan");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilih = in.nextInt();
            in.nextLine();

            switch (pilih) {
                case 1 -> manager.tambahKegiatan();
                case 2 -> manager.lihatKegiatan();
                case 3 -> manager.updateKegiatan();
                case 4 -> manager.hapusKegiatan();
                case 5 -> manager.cariKegiatan();
                case 6 -> System.out.println("Terima kasih, program selesai.");
                default -> System.out.println("Menu tidak valid, coba lagi.");
            }
        }
    }
}