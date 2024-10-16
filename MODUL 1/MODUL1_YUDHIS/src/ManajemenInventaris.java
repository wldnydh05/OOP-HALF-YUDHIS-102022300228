// Don't delete any comments below!!!
// Todo : Import Arraylist and Scanner
import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenInventaris {
    // Todo : Create ArrayList of MakananKering (daftarMakananKering) and MakananBasah (daftarMakananBasah) to store items
    private ArrayList<MakananKering> daftarMakananKering = new ArrayList<>();
    private ArrayList<MakananBasah> daftarMakananBasah = new ArrayList<>();


    public void tambahMakananKering() {
        
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Brand Makanan
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama makanan kering: ");
        String nama = input.nextLine();
        System.out.print("Masukkan jumlah: ");
        int jumlah = input.nextInt();
        System.out.print("Masukkan harga: ");
        double harga = input.nextDouble();
        input.nextLine(); 
        System.out.print("Masukkan brand: ");
        String brand = input.nextLine();

        // Todo : Create a new object for MakananKering
        MakananKering makananKering = new MakananKering(nama, jumlah, harga, brand);
        daftarMakananKering.add(makananKering);

        // Todo : Create Print Notifitaction "Makanan kering berhasil ditambahkan"
        System.out.println("Makanan kering berhasil ditambahkan!");
    }

    public void tambahMakananBasah() {
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Bahan Makanan
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama makanan basah: ");
        String nama = input.nextLine();
        System.out.print("Masukkan jumlah: ");
        int jumlah = input.nextInt();
        System.out.print("Masukkan harga: ");
        double harga = input.nextDouble();
        input.nextLine(); 
        System.out.print("Masukkan bahan: ");
        String bahan = input.nextLine();

        // Todo : Create a new object for MakananBasah
        MakananBasah makananBasah = new MakananBasah(nama, jumlah, harga, bahan);
        daftarMakananBasah.add(makananBasah);

        // Todo :Create Print Notifitaction "Makanan Basah berhasil ditambahkan"
        System.out.println("Makanan Basah berhasil ditambahkan!");
    }

    public void tampilkanSemuaMakanan() {
        if (daftarMakananKering.isEmpty() && daftarMakananBasah.isEmpty()) {
            // Todo : Create Print Notification "Tidak ada makanan disini"
            System.out.println("Tidak Ada Makanan Di Sini");
        } else {
            // Todo : Create print notification for Makanan Kering  
            for (MakanankKering Makanan : daftarMakananKering) {
                Makanan.tampilkanMakananKering();
            }
            // Todo : Create print notification for  Makanan Basah
            for (MakananBasah MakananBasah : daftarMakananBasah){
                makananBasah.tampilkanMakananBasah();
            }
            }
        }
    }

