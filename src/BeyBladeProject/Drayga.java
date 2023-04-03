package BeyBladeProject;

public class Drayga extends Beyblade {
    private String kutsalCanavar;

    @Override
    public void kutsalCanavarCikar() {
        System.out.println(getBeybladeQ()+ " " +kutsalCanavar+ " 'i ortaya cikar.");
        System.out.println(getBeybladeQ()+ " " +" in saldirisi: Kaplan Pencesi.");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Ismi: " +kutsalCanavar);
    }

    public Drayga(String beybladeQ, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        super(beybladeQ, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
            }
}
