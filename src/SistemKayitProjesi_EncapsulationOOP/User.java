package SistemKayitProjesi_EncapsulationOOP;

public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void register(){
        //burada kayit islemleri olacak
        System.out.println("Kullanici kaydedildi Name: " + this.name + " , E-Posta Adresi kaydedildi : " + this.email);
    }
}
