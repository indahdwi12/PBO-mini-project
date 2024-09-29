package com.unmul.surat;

public class Surat {
    private String nomorSurat;
    private String pengirim;
    private String perihal;

    // Static variable untuk menghitung jumlah surat
    private static int jumlahSurat = 0;

    // Constructor
    public Surat(String nomorSurat, String pengirim, String perihal) {
        this.nomorSurat = nomorSurat;
        this.pengirim = pengirim;
        this.perihal = perihal;
        jumlahSurat++;
    }

    // Getter dan Setter
    public String getNomorSurat() {
        return nomorSurat;
    }

    public void setNomorSurat(String nomorSurat) {
        this.nomorSurat = nomorSurat;
    }

    public String getPengirim() {
        return pengirim;
    }

    public void setPengirim(String pengirim) {
        this.pengirim = pengirim;
    }

    public String getPerihal() {
        return perihal;
    }

    public void setPerihal(String perihal) {
        this.perihal = perihal;
    }

    // Method untuk menampilkan info surat
    public void tampilkanInfoSurat() {
        System.out.println("Nomor Surat: " + nomorSurat);
        System.out.println("Pengirim: " + pengirim);
        System.out.println("Perihal: " + perihal);
    }

    // Method static untuk menghitung jumlah surat
    public static int getJumlahSurat() {
        return jumlahSurat;
    }
}
