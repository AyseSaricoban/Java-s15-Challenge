package library;

import book.Book;
import enums.Category;
import enums.memberType;
import person.Reader;

import java.lang.reflect.Member;

public interface Library {

    void addBook(String bookName, book.Book book);

    void removeBook(String bookName, Book book);

    void addMember(String memberId, String name, memberType type, String dateOfMemberShip, String address, long phoneNo);


    void removeMember(String memberId);
    void verifyMember(String memberId);
    void searchBookByType(String Category);
    void searchBookByName(String bookName);
    boolean isAvailable(int bookId);
    void issueBook(String bookId, String memberId);

    void returnBook(String bookId, String memberId);
    double bill(String memberId, String bookId);



}
