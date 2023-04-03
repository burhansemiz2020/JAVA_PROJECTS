package BeyBladeProject;

public class Dranza extends Beyblade {

    private String kutsalCanavar;

    public Dranza(String beybladeQ, int donusHizi, int saldiriHizi, String kutsalCanavar) {
        super(beybladeQ, donusHizi, saldiriHizi);
        this.kutsalCanavar = kutsalCanavar;

    }
    @Override
    public void kutsalCanavarCikar() {
        super.kutsalCanavarCikar();
        System.out.println("Kutsal Canavar Ismi: " +kutsalCanavar);


    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();

        System.out.println(getBeybladeQ()+ " " +kutsalCanavar+ " 'i ortaya cikar.");
        System.out.println(getBeybladeQ()+ " " +" in saldirisi: Alev Kilici.");
    }


}
