public class Main {
    public static void main(String[] args) {
        System.out.println("Detail Hewan\n");

        Kucing kucing = new Kucing("Memei", 5, "Persia");
        System.out.println("ini adalah " + kucing.nama + " !");
        kucing.suara();
        kucing.makan();
        kucing.makan("Proplan");
        System.out.println();

        Burung burung = new Burung("Albert", 1, "Coklat");
        System.out.println("ini adalah " + burung.nama + " !");
        burung.suara();
        burung.makan();
        burung.makan("biji-bijian");
        System.out.println();

        kucing.infoHewan();
        burung.infoHewan();
    }
}
