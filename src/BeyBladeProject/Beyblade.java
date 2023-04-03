package BeyBladeProject;
/*
Beyblade de 4 karakter var:
1. Dranza
2. Reye
3. Max
4. Tako
 */

public class Beyblade {
    private String beybladeQ;
    private int donusHizi;
    private int saldiriGucu;

    public Beyblade(String beybladeQ, int donusHizi, int saldiriGucu) {
        this.beybladeQ = beybladeQ;
        this.donusHizi = donusHizi;
        this.saldiriGucu = saldiriGucu;
    }

    public String getBeybladeQ() {
        return beybladeQ;
    }

    public void setBeybladeQ(String beybladeQ) {
        this.beybladeQ = beybladeQ;
    }

    public int getDonusHizi() {
        return donusHizi;
    }

    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }

    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }
    public void saldir(){
        System.out.println(getBeybladeQ()+" "+saldiriGucu+"  ve "+donusHizi+ "ile saldiriyor...");

    }
    public void kutsalCanavarCikar() {
        System.out.println("Bu beyblade in kutsal gucu yok");

    }
    public void bilgileriGoster(){
        System.out.println("BeybladeQ Ismi: " + beybladeQ);
        System.out.println("Saldiri Gucu: " + saldiriGucu);
        System.out.println("Donus hizi: " + donusHizi);
    }
}
