public class KomputerPremium extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean ruangPrivat;

    // To do: Buatlah constructor pada class KomputerPremium
    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat) {
        super(jumlahKomputer, namaWarnet, hargaPerJam); 
        this.ruangPrivat = ruangPrivat;
    }
    
    // To do: Buatlah Method Informasi memakai Polymorphism Override
    @Override
    public void Informasi(){
        super.Informasi();
        if (ruangPrivat == true){
            System.out.println("Status : Ruang Premium");
            System.out.println("===Fasilitas Ruang Premium===");
            System.out.println("Ruang Ber Ac Pribadi");
            System.out.println("Komputer Spek Tinggi");
            System.out.println("Koneksi Internet 100Mbps");
        }

        else {
            System.out.println("Status = Ruang Standar");
            System.out.println("===Fasilitas Ruang Standar===");
            System.out.println("Ruangan Gerah");
            System.out.println("Sofa Majapahit");
            System.out.println("Komputer Spek Rendah");
            System.out.println("Koneksi 1 Mbps");
        } 

}

    // To do: Buatlah method Pesan sesuai dengan ketentuan
    public void Pesan(int nomorKomputer) {
        System.out.println("Komputer nomor " + nomorKomputer + " telah dipesan.");
    }
    
    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    public void TambahLayanan(String makanan) {
        System.out.println("Pesan makanan: " + makanan);
    }

    // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading
    public void TambahLayanan(String makanan, String minuman) {
        System.out.println("Pesan makanan: " + makanan + " dan minuman: " + minuman);
    }
}
