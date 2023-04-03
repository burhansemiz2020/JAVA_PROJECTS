package SistemKayitProjesi_EncapsulationOOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //In this system of registration we register 5 person and their information
        //In below enter 5 users and in output print of them as first, second ....
        System.out.print("How many users will register? ");
        int numberOfUsers = scan.nextInt();
        for (int i = 1; i < numberOfUsers; i++) {
            System.out.print("Enter your name: \n");
            String name = scan.nextLine();
            scan.nextLine();
            System.out.print("Enter your email: ");
            String email = scan.nextLine();

            User user = new User(name, email);
            user.register();

            System.out.print(" . user is registered.");
            /*
         Bu örnek, Encapsulation kullanarak, kullanıcının
         özel bilgilerini korur ve sadece sınıfın içindeki
         yöntemler tarafından erişilmesine izin verir.
         Bu şekilde, kullanıcı bilgilerine izinsiz
         erişim engellenir ve kodun güvenliği artırılır.
          */
        }

    }
}
