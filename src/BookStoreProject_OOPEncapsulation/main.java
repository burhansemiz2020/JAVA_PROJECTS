package BookStoreProject_OOPEncapsulation;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        Book book1 = new Book("bookName: ", "authorName: ", 2000, "ISBN", 10  );
//        System.out.println("Name of book: ");
//        book1.setBookName(scan.nextLine());
//        System.out.println("Name of author: ");
//        book1.setAuthorName(scan.nextLine());
//        System.out.println("Year of publishing: ");
//        book1.setYearPublished(scan.nextInt());
//        System.out.println("No ISBN: ");
//        scan.nextLine();
//        book1.setISBN(scan.next());
//        System.out.println("Price of book: ");
//        book1.setPrice(scan.nextDouble());
//        System.out.println(book1);
//        scan.close();
Book book1=new Book("Ana", "Maksim Gorki", 2000, "165496465465", 15.5);
Book book2=new Book("GodFather", "Don Carlione", 1995, "5463544964654", 25.5);

        System.out.println(book1);
        System.out.println(book2);
    }
}
