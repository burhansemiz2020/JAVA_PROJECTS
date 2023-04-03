package SupermarketProject;

public class Main {
    public static void main(String[] args) {
        // Alkollü icecekler
        AlkolluIcecek cintonik = new AlkolluIcecek("Cintonik", 12);
        AlkolluIcecek likor = new AlkolluIcecek("Likor", 14);
        AlkolluIcecek votka = new AlkolluIcecek("Votka", 8);
        AlkolluIcecek efesBira = new AlkolluIcecek("Efes Bira", 4);
        AlkolluIcecek tuborg = new AlkolluIcecek("Tuborg", 6);

        // Gazlı icecekler
        GazliIcecek cocaCola = new GazliIcecek("Coca Cola", 1);
        GazliIcecek pepsi = new GazliIcecek("Pepsi", 1);
        GazliIcecek colaTurka = new GazliIcecek("Cola Turka", 2);
        GazliIcecek beypazari = new GazliIcecek("Beypazari", 1);
        GazliIcecek fanta = new GazliIcecek("Fanta", 2);

        // Sular
        Su beydagiSu = new Su("Beydagi Su", 1);
        Su akdagSu = new Su("Akdag Su", 1.5);
        Su erciyesSu = new Su("Erciyes Su", 1);
        Su uludagSu = new Su("Uludag Su", 2);
// Satın alma yaş sınırı kontrolü
        int yas = 20;
        if (cintonik.yasSiniri(yas)) {
            System.out.println("Cintonik satın alındı.");
        } else {
            System.out.println("Cintonik satın alınamadı. Satın alma yaş sınırı 18'dir.");
        }

        // Ürün bilgileri
        System.out.println("Alkollü icecekler:");
        System.out.println(cintonik);
        System.out.println(likor);
        System.out.println(votka);
        System.out.println(efesBira);
        System.out.println(tuborg);

        System.out.println("Gazlı icecekler:");
        System.out.println(cocaCola);
        System.out.println(pepsi);
        System.out.println(colaTurka);
        System.out.println(beypazari);
        System.out.println(fanta);

        System.out.println("Sular:");
        System.out.println(beydagiSu);
        System.out.println(akdagSu);
        System.out.println(erciyesSu);
        System.out.println(uludagSu);

    }
}
