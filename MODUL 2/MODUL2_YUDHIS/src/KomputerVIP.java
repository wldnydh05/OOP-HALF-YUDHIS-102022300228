class KomputerVIP extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean VipCard;

    // To do: Buatlah constructor pada class KomputerVIP
    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean VipCard) {
        super(jumlahKomputer, namaWarnet, hargaPerJam); 
        this.VipCard = VipCard ;
    }


    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    @Override
    public void Informasi(){
        super.Informasi();
        if (VipCard == true){
            System.out.println("===Benefit Member VIP===");
            System.out.println("Diskon 10% untuk bermain di atas 3 jam");
            System.out.println("Gratis Minuman Setiap 4 jam bermain");
            System.out.println("Prioritas Booking Komputer Gamming");

        }

        else {
            System.out.println("Benefit Non VIP");
            System.out.println("Login dengan username asep");
            System.out.println("Bermain selama 2 jam");
            System.out.println("Nambah Billing selama 2 jam");
        } 

}

// To do: Buatlah method Login sesuai dengan ketentuan
    public void Login(String username) {
        System.out.println(username + " berhasil login!");
    }

    // To do: Buatlah method Bermain sesuai dengan ketentuan
    public void Bermain(int jam) {
        System.out.println("Bermain selama " + jam + " jam.");
    }

    // To do: Buatlah method Bermain memakai Polymorphism Overloading
    public void Bermain(int jam, int menit) {
        System.out.println("Bermain selama " + jam + " jam dan " + menit + " menit tambahan.");
    }
}
