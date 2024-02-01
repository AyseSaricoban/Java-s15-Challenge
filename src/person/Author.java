package person;

import enums.memberType;

public class Author extends Reader{


    public Author(String name, String memberId, memberType type, String dateOfMembership, boolean noBooksIssued, int maxBookLimit, String address, long phoneNo) {
        super(name, memberId, type, dateOfMembership, noBooksIssued, maxBookLimit, address, phoneNo);
    }

    public Author(String memberId) {
        super(memberId);
    }
}
