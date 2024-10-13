public class Penerbangan {
    private String nomorPenerbangan;
    private String bandaraKeberangkatan;
    private String bandaraTujuan;
    private String waktuKeberangkatan;
    private String waktuKedatangan;
    private float hargaTiket;

    public Penerbangan(String nomor, String berangkat, String tujuan, String waktuBerangkat, String waktuDatang, float harga) {
        this.nomorPenerbangan = nomor;
        this.bandaraKeberangkatan = berangkat;
        this.bandaraTujuan = tujuan;
        this.waktuKeberangkatan = waktuBerangkat;
        this.waktuKedatangan = waktuDatang;
        this.hargaTiket = harga;
    }

    public String getNomorPenerbangan() { return nomorPenerbangan; }
    public String getBandaraKeberangkatan() { return bandaraKeberangkatan; }
    public String getBandaraTujuan() { return bandaraTujuan; }
    public String getWaktuKeberangkatan() { return waktuKeberangkatan; }
    public String getWaktuKedatangan() { return waktuKedatangan; }
    public float getHargaTiket() { return hargaTiket; }

    public void tampilDaftarPenerbangan() {
        System.out.println("Nomor Penerbangan : " + nomorPenerbangan);
        System.out.println("Bandara Keberangkatan" + bandaraKeberangkatan + " ---> Bandara Tujuan: " + bandaraTujuan);
        System.out.println("Waktu keberangkatan: " + waktuKeberangkatan + " ---> Waktu Kedatangan: " + waktuKedatangan );
        System.out.println("Harga Tiket:" + hargaTiket  );
        System.out.println(" ");
    }
}