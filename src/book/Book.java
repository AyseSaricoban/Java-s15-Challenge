//package book;
//
//import enums.Category;
//
//public class Book {
//    private int bookId ;
//    private String author ;
//    private String name;
//    private int price;
//    private String status;
//    private String edition;
//    private String dateOfPurchase ;
//    private boolean isAvailable;
//    private Category Category;
//
//
//    public Book(int bookId, String name) {
//        this.bookId = bookId;
//        this.name = name;
//    }
//
//    public Book(enums.Category category) {
//        Category = category;
//    }
//
//    public Book(int bookId, String author, String name, int price, String status, String edition, String dateOfPurchase, boolean isAvailable, enums.Category category) {
//        this.bookId = bookId;
//        this.author = author;
//        this.name = name;
//        this.price = price;
//        this.status = status;
//        this.edition = edition;
//        this.dateOfPurchase = dateOfPurchase;
//        this.isAvailable = isAvailable;
//        this.Category = Category;
//    }
//
//    public int getBookId() {
//        return bookId;
//    }
//
//    public void setBookId(int bookId) {
//        this.bookId = bookId;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Category getCategory() {
//        return Category;
//    }
//
//    @Override
//    public String toString() {
//        return "Book{" +
//                "bookId=" + bookId +
//                ", author='" + author + '\'' +
//                ", name='" + name + '\'' +
//                ", price=" + price +
//                ", status='" + status + '\'' +
//                ", edition='" + edition + '\'' +
//                ", dateOfPurchase='" + dateOfPurchase + '\'' +
//                ", isAvailable=" + isAvailable +
//                ", Category=" + Category +
//                '}';
//    }
//}
package book;

import enums.Category;

public class Book {
    private int bookId;
    private String author;
    private String name;
    private int price;
    private String status;
    private String edition;
    private String dateOfPurchase;
    private boolean isAvailable;
    private Category category;
    private String ownerId;

    public Book(int bookId, String name) {
        this.bookId = bookId;
        this.name = name;
    }

    public Book(Category category) {
        this.category = category;
    }

    public Book(int bookId, String author, String ownerId, String name, int price, String status, String edition, String dateOfPurchase, boolean isAvailable, Category category) {
        this.bookId = bookId;
        this.author = author;
        this.name = name;
        this.price = price;
        this.status = status;
        this.edition = edition;
        this.dateOfPurchase = dateOfPurchase;
        this.isAvailable = isAvailable;
        this.category = category;
        this.ownerId= ownerId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return this.category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", status='" + status + '\'' +
                ", edition='" + edition + '\'' +
                ", dateOfPurchase='" + dateOfPurchase + '\'' +
                ", isAvailable=" + isAvailable +
                ", category=" + category +
                '}';
    }
}
