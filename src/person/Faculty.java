package person;

import enums.memberType;

public class Faculty extends Reader{
    public Faculty(String name, String memberId, memberType type, String date, String dateOfMembership, boolean noBooksIssued, int maxBookLimit, String address, long phoneNo) {
        super(name, memberId, type, date, dateOfMembership, noBooksIssued, maxBookLimit, address, phoneNo);
    }

    public Faculty(String name, String memberId, memberType type, String dateOfMembership, String address, long phoneNo) {
        super(name, memberId, type, dateOfMembership, address, phoneNo);
    }

    public Faculty(String memberId) {
        super(memberId);
    }

    public Faculty(String memberId, memberType type, String dateOfMemberShip, String address, long phoneNo) {
        super(memberId, type, dateOfMemberShip, address, phoneNo);
    }
}
