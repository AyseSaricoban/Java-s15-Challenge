package book;

import enums.Category;

public class Book {
    private int bookId ;
    private String author ;
    private String name;
    private int price;
    private String status;
    private String edition;
    private String dateOfPurchase ;
    private boolean isAvailable;
    private Category Category;


    public Book(int bookId, String name) {
        this.bookId = bookId;
        this.name = name;
    }



    public Book(int bookId, String author, String name, int price, String status, String edition, String dateOfPurchase, boolean isAvailable, enums.Category category) {
        this.bookId = bookId;
        this.author = author;
        this.name = name;
        this.price = price;
        this.status = status;
        this.edition = edition;
        this.dateOfPurchase = dateOfPurchase;
        this.isAvailable = isAvailable;
        Category = category;
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


    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", name='" + name + '\'' +
                '}';
    }
}
