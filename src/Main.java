import book.Book;
import enums.Category;
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
        Book bookToAdd = new Book(1, "Harper Lee", "" ,"To Kill a MockingBird", 1000, "Available", "First", "2024-02-01", true, Category.JOURNAL);
        Book bookToAdd2 = new Book(2, "J. D. Salinger","", "Cather In The Rye", 2000, "Available", "First", "2024-02-01", true, Category.JOURNAL);
        librarian.addBook("1", bookToAdd);
        librarian.addBook("2", bookToAdd2);
        System.out.println("************************");
        System.out.println("REMOVE BOOK");
        Book bookToRemove = new Book(1 , "The Catcher in the Rye");
        librarian.removeBook("1", bookToRemove);
        System.out.println("************************");
        System.out.println("ADD MEMBER");
        librarian.addMember("123","Ayşe", memberType.STUDENT, "2024-02-01", "123 Main St", 123456789);
        System.out.println("************************");
        System.out.println("REMOVE MEMBER");
        //librarian.removeMember("123");
        System.out.println("************************");
        System.out.println("VERIFY MEMBER");
        librarian.verifyMember("123");
        System.out.println("************************");
        System.out.println("SEARCH MEMBER BY BOOK TYPE");
        librarian.searchBookByType("JOURNAL");
        System.out.println("************************");
        System.out.println("SEARCH MEMBER BY BOOK NAME");
        librarian.searchBookByName("The Catcher in the Rye");
        librarian.searchBookByName("To Kill a MockingBird");
        System.out.println("************************");
        System.out.println("ISSUED BOOK");
        librarian.issueBook("1","123");
        librarian.issueBook("2","225");
        librarian.issueBook("123","123");
        System.out.println("************************");
        System.out.println("RETURN BOOK");
        librarian.returnBook("1","123");
        System.out.println("************************");
        System.out.println("BILL");

        System.out.println(librarian.bill("123","1"));















    }
}