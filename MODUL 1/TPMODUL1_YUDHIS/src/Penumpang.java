public class Penumpang {
    private String NIK;
    private String namaDepan;
    private String namaBelakang;

    public Penumpang(String NIK, String depan, String belakang) {
        this.NIK = NIK;
        this.namaDepan = depan;
        this.namaBelakang = belakang;
    }

    public void tampilDaftarPenumpang() {
        System.out.println("NIK: " + NIK);
        System.out.println("Nama Depan: " + namaDepan);
        System.out.println("Nama Belakang:" + namaBelakang);

    }
}
