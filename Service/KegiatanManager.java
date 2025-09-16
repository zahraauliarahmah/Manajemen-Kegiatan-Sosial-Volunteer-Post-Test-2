/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.Scanner;
import model.Kegiatan;

public class KegiatanManager {
    private ArrayList<Kegiatan> daftarKegiatan = new ArrayList<>();
    private Scanner in = new Scanner(System.in);

    // Tambah kegiatan
    public void tambahKegiatan() {
        System.out.print("Masukkan nama kegiatan: ");
        String nama = in.nextLine();
        System.out.print("Masukkan tanggal kegiatan: ");
        String tanggal = in.nextLine();
        System.out.print("Masukkan lokasi kegiatan: ");
        String lokasi = in.nextLine();

        Kegiatan kegiatan = new Kegiatan(nama, tanggal, lokasi);
        daftarKegiatan.add(kegiatan);
        System.out.println("Kegiatan berhasil ditambahkan!\n");
    }

    // Lihat kegiatan
    public void lihatKegiatan() {
        if (daftarKegiatan.isEmpty()) {
            System.out.println("Belum ada kegiatan.");
        } else {
            System.out.println("--- Daftar Kegiatan ---");
            for (int i = 0; i < daftarKegiatan.size(); i++) {
                System.out.println((i + 1) + ". " + daftarKegiatan.get(i));
            }
        }
    }

    // Update kegiatan
    public void updateKegiatan() {
        lihatKegiatan();
        if (!daftarKegiatan.isEmpty()) {
            System.out.print("Pilih nomor kegiatan yang ingin diupdate: ");
            int index = in.nextInt();
            in.nextLine();

            if (index > 0 && index <= daftarKegiatan.size()) {
                System.out.print("Masukkan nama baru: ");
                String nama = in.nextLine();
                System.out.print("Masukkan tanggal baru: ");
                String tanggal = in.nextLine();
                System.out.print("Masukkan lokasi baru: ");
                String lokasi = in.nextLine();

                Kegiatan kegiatan = daftarKegiatan.get(index - 1);
                kegiatan.setNama(nama);
                kegiatan.setTanggal(tanggal);
                kegiatan.setLokasi(lokasi);

                System.out.println("Kegiatan berhasil diupdate!");
            } else {
                System.out.println("Nomor tidak valid.");
            }
        }
    }

    // Hapus kegiatan
    public void hapusKegiatan() {
        lihatKegiatan();
        if (!daftarKegiatan.isEmpty()) {
            System.out.print("Pilih nomor kegiatan yang ingin dihapus: ");
            int index = in.nextInt();
            in.nextLine();

            if (index > 0 && index <= daftarKegiatan.size()) {
                System.out.println("Menghapus: " + daftarKegiatan.get(index - 1).getNama());
                daftarKegiatan.remove(index - 1);
            } else {
                System.out.println("Nomor tidak valid.");
            }
        }
    }

    // Search kegiatan
    public void cariKegiatan() {
        System.out.print("Masukkan kata kunci pencarian: ");
        String keyword = in.nextLine().toLowerCase();

        boolean ditemukan = false;
        for (Kegiatan kegiatan : daftarKegiatan) {
            if (kegiatan.getNama().toLowerCase().contains(keyword)) {
                System.out.println(kegiatan);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Kegiatan tidak ditemukan.");
        }
    }
}
