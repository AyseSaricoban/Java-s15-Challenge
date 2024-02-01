package person;

import enums.memberType;

public class Author extends Reader{


    public Author(String name, String memberId, memberType type, String date, String dateOfMembership, boolean noBooksIssued, int maxBookLimit, String address, long phoneNo) {
        super(name, memberId, type, date, dateOfMembership, noBooksIssued, maxBookLimit, address, phoneNo);
    }

    public Author(String name, String memberId, memberType type, String dateOfMembership, String address, long phoneNo) {
        super(name, memberId, type, dateOfMembership, address, phoneNo);
    }

    public Author(String memberId) {
        super(memberId);
    }

    public Author(String memberId, memberType type, String dateOfMemberShip, String address, long phoneNo) {
        super(memberId, type, dateOfMemberShip, address, phoneNo);
    }
}
