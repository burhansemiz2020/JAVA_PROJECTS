package SupermarketProject;

class AlkolluIcecek extends Icecek {
    public AlkolluIcecek(String marka, double fiyat) {
        super(marka, fiyat);
    }

    // Satın alma yaş sınırı kontrolü için metod
    public boolean yasSiniri(int yas) {
        if (yas < 18) {
            return false;
        }
        return true;
    }

}
