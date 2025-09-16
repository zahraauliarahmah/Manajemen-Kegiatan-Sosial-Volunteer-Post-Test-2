/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Kegiatan {
    private String nama;
    private String tanggal;
    private String lokasi;

    // Constructor
    public Kegiatan(String nama, String tanggal, String lokasi) {
        this.nama = nama;
        this.tanggal = tanggal;
        this.lokasi = lokasi;
    }

    // Getter & Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Tanggal: " + tanggal + ", Lokasi: " + lokasi;
    }
}
