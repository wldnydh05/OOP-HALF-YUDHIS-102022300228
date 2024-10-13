import java.util.ArrayList;
import java.util.Scanner;

public class Pembelian {
    private static ArrayList<Penerbangan> penerbanganList = new ArrayList<>();
    private static ArrayList<Penumpang> penumpangList = new ArrayList<>();
    private static Penumpang penumpang;
    private static Penerbangan penerbanganDipilih; 

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        penerbanganList.add(new Penerbangan("GA101", "CGK, Jakarta", "DPS, Bali", "06:30", "08:15", 1200000));
        penerbanganList.add(new Penerbangan("QZ202", "SUB, Surabaya", "KNO, Medan", "09:00", "11:45", 1350000));

        boolean exit = false;
        while (!exit) {
            System.out.println("====== EAD Ticket Booking System ======");
            System.out.println("1. Tampilkan Daftar Penerbangan");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Tampilkan Pesanan Tiket");
            System.out.println("4. Exit");
            System.out.print("Silahkan pilih menu: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    tampilkanDaftarPenerbangan();
                    break;
                case 2:
                    beliTiket(input);
                    break;
                case 3:
                    tampilkanPesananTiket();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    exit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }

        input.close();
    }

    public static void tampilkanDaftarPenerbangan() {
        System.out.println("");
        for (int i = 0; i < penerbanganList.size(); i++) {
            System.out.println((i + 1) + ". " + penerbanganList.get(i).getNomorPenerbangan());
            penerbanganList.get(i).tampilDaftarPenerbangan();
        }
    }

    public static void beliTiket(Scanner input) {
        System.out.println("Silakan isi data diri Anda terlebih dahulu!");
        System.out.print("Masukkan NIK: ");
        String NIK = input.next();
        System.out.print("Masukkan Nama Depan: ");
        String namaDepan = input.next();
        System.out.print("Masukkan Nama Belakang: ");
        String namaBelakang = input.next();

        penumpang = new Penumpang(NIK, namaDepan, namaBelakang);

        System.out.println("");
        System.out.println("Terima kasih telah mengisi data pelanggan. Silahkan Pilih Tiket Penerbangan yang tersedia");
        System.out.println("----------------------------------------------------------------");
        tampilkanDaftarPenerbangan();
        System.out.print("Masukkan nomor penerbangan (ex: 1): ");
        int nomorPenerbangan = input.nextInt();

        if (nomorPenerbangan > 0 && nomorPenerbangan <= penerbanganList.size()) {

            penerbanganDipilih = penerbanganList.get(nomorPenerbangan - 1);

            penumpangList.add(penumpang);

            System.out.println("Pemesanan tiket berhasil dilakukan!");
        } else {
            System.out.println("Nomor penerbangan tidak valid!");
        }
    }

    public static void tampilkanPesananTiket() {
        if (penumpang == null || penerbanganDipilih == null) {
            System.out.println("Pembelian tiket tidak ada!");
            System.out.println("");
        } else {
            System.out.println("======= Detail Tiket Penerbangan =======");
            penumpang.tampilDaftarPenumpang();
            penerbanganDipilih.tampilDaftarPenerbangan();
        }
    }
}