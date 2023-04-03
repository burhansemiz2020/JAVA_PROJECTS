package BookStoreProject_OOPEncapsulation;

public class Book {
    // 1. burada sınıf özellikleri ve davranışları tanımlanacak
    private String bookName;
    private String authorName;
    private int yearPublished;
    private String ISBN;
    private double price;
    //Constructor oluşturun ve özellikleri parametre olarak alın.

    public Book(String bookName, String authorName, int yearPublished, String ISBN, double price) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.yearPublished = yearPublished;
        this.ISBN = ISBN;
        this.price = price;
    }


    //Sınıf için gerekli özellikleri (ad, yazar, yayın yılı, ISBN, fiyat)
    // içeren özel değişkenler tanımlayın ve bunlara erişimi kısıtlamak
    // için encapsulation kullanın.

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //"toString" metodu oluşturun, böylece kitap özelliklerini kolayca görüntüleyebilirsiniz.

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", yearPublished=" + yearPublished +
                ", ISBN='" + ISBN + '\'' +
                ", price=" + price +
                '}';
    }
}
