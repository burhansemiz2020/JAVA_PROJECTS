package BeyBladeProject;

public class Dragon extends Beyblade{
    private String kutsalCanavar;
    private String gizliYetenek;

    @Override
    public void kutsalCanavarCikar() {
        System.out.println(getBeybladeQ()+ " " +kutsalCanavar+ " 'i ortaya cikar.");
        System.out.println(getBeybladeQ()+ " " +" in saldirisi: Hayalet Kasirgasi.");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Ismi: " +kutsalCanavar);
        System.out.println("Gizli Yetenek: " +gizliYetenek);
    }

    public Dragon(String beybladeQ, int donusHizi, int saldiriGucu, String kutsalCanavar, String gizliYetenek) {
        super(beybladeQ, donusHizi, saldiriGucu);
        this.kutsalCanavar=kutsalCanavar;
        this.gizliYetenek=gizliYetenek;


    }
}
