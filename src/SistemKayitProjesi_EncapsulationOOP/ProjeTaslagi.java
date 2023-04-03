package SistemKayitProjesi_EncapsulationOOP;

public class ProjeTaslagi {
    /*
    Java'da Encapsulation, nesne yönelimli programlama (OOP) prensiplerinden biridir.
    Bu prensip, nesnenin iç veri yapısını korumak ve bu verilere sadece sınıfın kendisi
    tarafından erişilmesine izin vermek için kullanılır. Bu, bir sınıfın iç mantığındaki
    değişikliklerin, sınıfın dışındaki kod üzerinde olumsuz etkileri olmadığı anlamına gelir.

    Aşağıda, basit bir kullanıcı kayıt sistemi örneği verilmiştir.
    Bu örnekte, Encapsulation kullanarak, kullanıcının adı ve e-posta
    adresi gibi özel bilgilerini koruruz. Bu bilgilere erişim, sadece
    kullanıcı sınıfının içindeki yöntemler aracılığıyla sağlanır.

    **********************
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

    public void register() {
        // kayıt işlemleri yapılır
        System.out.println("Kullanıcı kaydedildi. Adı: " + this.name + ", E-posta: " + this.email);
    }
}
*********************

Bu örnekte, User sınıfı, name ve email
özelliklerini içerir. Bu özellikler, private anahtar
kelimesi ile tanımlandıkları için, sadece User sınıfının
içindeki yöntemler tarafından erişilebilirler.
Bununla birlikte, sınıf dışındaki kodların bu özelliklere erişmesi engellenir.

User sınıfının register() yöntemi, kullanıcının kaydedilmesi
işlemini gerçekleştirir. Bu yöntem, name ve email özelliklerine
erişir ve kullanıcının bilgilerini konsola yazdırır.

Aşağıdaki kod, kullanıcının adı ve e-posta adresini konsoldan
alarak, User sınıfının register() yöntemini kullanarak kaydeder:
******************
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınızı girin: ");
        String name = scanner.nextLine();

        System.out.print("E-posta adresinizi girin: ");
        String email = scanner.nextLine();

        User user = new User(name, email);
        user.register();
    }
}
*****************
Bu örnek, Encapsulation kullanarak, kullanıcının özel
bilgilerini korur ve sadece sınıfın içindeki yöntemler
tarafından erişilmesine izin verir. Bu şekilde, kullanıcı
bilgilerine izinsiz erişim engellenir ve kodun güvenliği artırılır.
     */
}
