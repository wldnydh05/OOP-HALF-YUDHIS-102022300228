class Komputer {
    // To do: Buatlah 3 variable sesuai ketentuan
    protected int jumlahKomputer;
    protected String namaWarnet;
    protected float HargaPerJam;

    // To do: Buatlah constructor pada class Komputer
    public Komputer(int jumlahKomputer, String namaWarnet, float HargaPerJam){
        this.jumlahKomputer=jumlahKomputer;
        this.namaWarnet=namaWarnet;
        this.HargaPerJam=HargaPerJam;
    }

    // To do: Buatlah Method Informasi dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    public void Informasi() {
        System.out.println("Jumlah Komputer = " + jumlahKomputer);
        System.out.println("Nama Warnet = " + namaWarnet);
        System.out.println("Harga Per Jam = " + HargaPerJam);
    }

}