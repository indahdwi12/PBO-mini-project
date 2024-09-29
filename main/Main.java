package com.unmul.main;

import com.unmul.surat.Surat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Surat> daftarSurat = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("=== ESuratUnmul ===");
            System.out.println("1. Tambah Surat");
            System.out.println("2. Tampilkan Semua Surat");
            System.out.println("3. Hapus Surat");
            System.out.println("4. Jumlah Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            switch (pilihan) {
                case 1:
                    tambahSurat();
                    break;
                case 2:
                    tampilkanSemuaSurat();
                    break;
                case 3:
                    hapusSurat();
                    break;
                case 4:
                    System.out.println("Jumlah Surat: " + Surat.getJumlahSurat());
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 5);
    }

    // Menambahkan surat baru
    private static void tambahSurat() {
        System.out.print("Nomor Surat: ");
        String nomor = scanner.nextLine();
        System.out.print("Pengirim: ");
        String pengirim = scanner.nextLine();
        System.out.print("Perihal: ");
        String perihal = scanner.nextLine();

        Surat suratBaru = new Surat(nomor, pengirim, perihal);
        daftarSurat.add(suratBaru);
        System.out.println("Surat berhasil ditambahkan.");
    }

    // Menampilkan semua surat
    private static void tampilkanSemuaSurat() {
        if (daftarSurat.isEmpty()) {
            System.out.println("Belum ada surat.");
        } else {
            System.out.println("Daftar Surat:");
            for (Surat surat : daftarSurat) {
                surat.tampilkanInfoSurat();
                System.out.println("-------------------");
            }
        }
    }

    // Menghapus surat berdasarkan nomor surat
    private static void hapusSurat() {
        System.out.print("Masukkan nomor surat yang akan dihapus: ");
        String nomor = scanner.nextLine();
        boolean ditemukan = false;

        for (Surat surat : daftarSurat) {
            if (surat.getNomorSurat().equals(nomor)) {
                daftarSurat.remove(surat);
                System.out.println("Surat dengan nomor " + nomor + " berhasil dihapus.");
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Surat dengan nomor tersebut tidak ditemukan.");
        }
    }
}
