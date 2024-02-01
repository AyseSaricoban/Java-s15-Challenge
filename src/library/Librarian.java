package library;

import book.Book;
import enums.memberType;
import person.Reader;

import java.util.Map;

public  class Librarian implements Library {

    private Map<String, Book> booksMap;
    private Map<String, Reader> membersMap;


    public Librarian(Map<String, Book> booksMap, Map<String, Reader> membersMap) {
        this.booksMap = booksMap;
        this.membersMap = membersMap;
    }

    @Override
    public void addBook(String bookName, Book book) {
        booksMap.put(bookName,book);
        System.out.println( book.getName() + " added to the library");
    }

    @Override
    public void removeBook(String bookName, Book book) {
        booksMap.remove(bookName, book);
        System.out.println( book.getName() + " remove from the library");
    }

    @Override
    public void addMember(String memberId, memberType type, String dateOfMemberShip, String address, long phoneNo) {
        Reader newMember = new Reader(memberId, type,  dateOfMemberShip, address, phoneNo);
        System.out.println(newMember + newMember.getName() + " added as a member");
    }

    @Override
    public void removeMember(String memberId) {
        Reader removedMember = membersMap.remove(memberId);
        if (removedMember != null) {
            System.out.println(removedMember.getName() + "'s membership removed");
        } else {
            System.out.println("Member with ID " + memberId + " not found");
        }
    }
//    public void verifyMember(String memberId) {
//        Reader memberToVerify = new Reader(memberId);
//
//        if (getReaders().containsKey(memberToVerify)) {
//            System.out.println("Member with Member ID " + memberId + " is registered in the library.");
//        } else {
//            System.out.println("-------------------------------------");
//            System.out.println("Member with Member ID " + memberId + " is not registered in the library.");
//            register(memberId);
//        }
//    }

    @Override
    public void verifyMember(String memberId) {
        Reader memberToVerify = new Reader(memberId);
        if (membersMap.containsKey(memberId)) {
            System.out.println("Member with Member ID " + memberId + " is registered in the library.");
        } else {
            System.out.println("Member with Member ID " + memberId + " is not registered in the library.");
       }

    }

    @Override
    public void searchBookByType(String bookType) {

    }

    @Override
    public void searchBookByName(String bookName) {

    }

    @Override
    public void issueBook() {

    }

    @Override
    public void returnBook() {

    }

    @Override
    public void bill() {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
