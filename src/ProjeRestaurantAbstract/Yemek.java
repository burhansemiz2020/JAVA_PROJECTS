package ProjeRestaurantAbstract;

public abstract class Yemek {
    protected String ad;
    protected double fiyat;

    public Yemek(String ad, double fiyat) {
        this.ad = ad;
        this.fiyat = fiyat;
    }

    public String getAd() {
        return ad;
    }

    public double getFiyat() {
        return fiyat;
    }

    public abstract void hazirla();



    }

