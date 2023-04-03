package SupermarketProject;

class Icecek {
    protected String marka;
    protected double fiyat;

    public Icecek(String marka, double fiyat) {
        this.marka = marka;
        this.fiyat = fiyat;
    }

    public String getMarka() {
        return marka;
    }

    public double getFiyat() {
        return fiyat;
    }

    public String toString() {
        return marka + " - " + fiyat + " euro";
    }
}


