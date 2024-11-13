public class Main {
    public static void main(String[] args) {

        // To do: Buatlah sebuah Objek baru dari class Komputer
        Komputer komputer = new Komputer(10, "Pesnet", 5000);
        // To do: Panggillah Method Informasi dari class Komputer
        
        komputer.Informasi();

        System.out.println();


        // To do: Buatlah sebuah Objek baru dari class KomputerVIP 
        KomputerVIP KomputerVIP = new KomputerVIP (5, "Pesnet", 10000, false);

        // To do: Panggillah Method Informasi dari class KomputerVIP
        KomputerVIP.Informasi();
        System.out.println();

        // To do: Panggillah Method Login
        KomputerVIP.Login("Yudhis");
        System.out.println();

        // To do: Panggillah Method Bermain 2x agar dapat melakukan polymorphism overloading
        KomputerVIP.Bermain(4);
        KomputerVIP.Bermain(2, 30);


        // To do: Buatlah sebuah Objek baru dari class KomputerPremium
        KomputerPremium KomputerPremium = new KomputerPremium(5, "Pesnet", 5000, true);

        // To do: Panggillah Method Informasi dari class KomputerPremium
        KomputerPremium.Informasi();
        System.out.println();
        
        // To do: Panggillah Method Pesan
        KomputerPremium.Pesan(10);
        System.out.println();

        // To do: Panggillah Method TambahLayanan 2x agar dapat melakukan polymorphism overloading
       KomputerPremium.TambahLayanan("Sosis");
       KomputerPremium.TambahLayanan("Jus");
    }
}