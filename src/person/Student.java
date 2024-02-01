package person;

import enums.memberType;

public class Student extends Reader{


    public Student(String name, String memberId, memberType type, String dateOfMembership, boolean noBooksIssued, int maxBookLimit, String address, long phoneNo) {
        super(name, memberId, type, dateOfMembership, noBooksIssued, maxBookLimit, address, phoneNo);
    }

    public Student(String memberId) {
        super(memberId);
    }
}
