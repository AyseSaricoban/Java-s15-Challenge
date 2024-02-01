import book.Book;
import enums.memberType;
import library.Librarian;
import person.Reader;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("************************");
        System.out.println("ADD BOOK");
        Map<String, Book> booksMap = new HashMap<>();
        Map<String, Reader> membersMap = new HashMap<>();

        Librarian librarian = new Librarian(booksMap, membersMap);
        Book bookToAdd = new Book(1 , "The Catcher in the Rye");
        Book bookToAdd2 = new Book(2 , "To Kill a Mocking Bird");
        librarian.addBook("1", bookToAdd);
        librarian.addBook("2", bookToAdd);
        System.out.println("??????????????????????");
        System.out.println("************************");
        System.out.println("REMOVE BOOK");
        Book bookToRemove = new Book(1 , "The Catcher in the Rye");
        librarian.removeBook("1", bookToRemove);
        System.out.println("************************");
        System.out.println("ADD MEMBER");
        librarian.addMember("123", memberType.STUDENT, "2024-02-01", "123 Main St", 123456789);
        System.out.println("?????????????????????????");
        //İSİMLE YAPMAYA BAKABİLİRSİN?
        System.out.println("************************");
        System.out.println("REMOVE MEMBER");
        librarian.removeMember("1");
        System.out.println("************************");
        System.out.println("VERIFY MEMBER");
        //IFIN SONUDA ADDMEMBER METODUNU ÇAĞIRABİLİRSİN Bİ BAK
        librarian.verifyMember("5");
        System.out.println("************************");











    }
}