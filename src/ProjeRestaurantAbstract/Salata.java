package ProjeRestaurantAbstract;

public class Salata extends Yemek{
    private String malzemeler;

    public Salata(String ad, double fiyat, String malzemeler) {
        super(ad, fiyat);
        this.malzemeler = malzemeler;
    }

    public String getMalzemeler() {
        return malzemeler;
    }

    @Override
    public void hazirla() {
        System.out.println(ad + " salata hazırlandı.");
    }



    public static void main(String[] args) {
        Salata salata = new Salata("Yemek", 1000, "hiyar");
        salata.hazirla();

    }
}
