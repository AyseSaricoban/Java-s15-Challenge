package library;

import book.Book;
import enums.memberType;
import person.Reader;

import java.lang.reflect.Member;

public interface Library {

    void addBook(String bookName, book.Book book);

    void removeBook(String bookName, Book book);

    void addMember(String memberId, memberType type, String dateOfMemberShip, String address, long phoneNo);


    void removeMember(String memberId);
    void verifyMember(String memberId);
    void searchBookByType(String bookType);
    void searchBookByName(String bookName);
    void issueBook();
    void returnBook();
    void bill();



}
