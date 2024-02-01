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
    public void addMember(String memberId, String name, memberType type, String dateOfMemberShip, String address, long phoneNo) {
        Reader newMember = new Reader(name,memberId, type,  dateOfMemberShip, address, phoneNo);
        membersMap.put(memberId,newMember);
        System.out.println(newMember + newMember.getName() + " added as a member" + " on " + newMember.getDateOfMembership());
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
    public void searchBookByType(String category) {
        for (Book book : booksMap.values() ) {
            if (book.getCategory().toString().equals(category)) {
            System.out.println(book.getCategory() + " registered in the system");
            }else {
                System.out.println("No books of category " + category + " found in the system");
            }
        }
    }

    @Override
    public void searchBookByName(String bookName) {
        for (Book book : booksMap.values() ) {
            if (book.getName().equals(bookName)) {
                System.out.println(book.getName() + " registered in the system");
            }else {
                System.out.println("No books with name " + bookName + " found in the system");
            }
        }
    }



    @Override
    public void issueBook( String bookId, String memberId) {
        Book book = booksMap.get(bookId);;
        Reader reader = membersMap.get(memberId);
        if(reader != null){
            if (book != null && book.isAvailable()) {
                book.setAvailable(false);
                book.setOwnerId(memberId);
                System.out.println("Book '" + book.getName() + "' issued to member '" + reader.getName() + "'");
            } else {
                System.out.println("Book is not available in the library.");
            }
        } else {
            System.out.println("Member is not registered in the library.");
        }



    }

    @Override
    public boolean isAvailable(int bookId) {
        Book book = booksMap.get(bookId);;
        if(book!=null ){
            return book.isAvailable();
        }else{
           return  false;
        }
    }

    @Override
    public void returnBook(String bookId, String memberId) {
        Book book = booksMap.get(bookId);
        if(book != null && book.getOwnerId().equals(memberId)) {
            book.setAvailable(true);
            book.setOwnerId("");
            System.out.println("The Book Has Been Returned.");
        }

    }

    @Override
    public double bill(String memberId, String bookId) {
        Reader reader = membersMap.get(memberId);
        Book book = booksMap.get(bookId);

        if(reader.getType()==memberType.STUDENT){
            return book.getPrice()*0.8;
        }else{
            return book.getPrice();
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
