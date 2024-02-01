package person;

import enums.memberType;

public class Reader extends Person {

    private String memberId;
    private memberType type;
    private String dateOfMembership;
    private boolean noBooksIssued;
    private int maxBookLimit;
    private String address;
    private long phoneNo;


    public Reader(String name, String memberId, memberType type, String dateOfMembership, boolean noBooksIssued, int maxBookLimit, String address, long phoneNo) {
        super(name);
        this.memberId = memberId;
        this.type = type;
        this.dateOfMembership = dateOfMembership;
        this.noBooksIssued = noBooksIssued;
        this.maxBookLimit = maxBookLimit;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public Reader(String name, String memberId, memberType type, String dateOfMembership, String address, long phoneNo) {
        super(name);
        this.memberId = memberId;
        this.type = type;
        this.dateOfMembership = dateOfMembership;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public Reader(String memberId) {
        super(memberId);
    }

    public Reader(String memberId, memberType type, String dateOfMemberShip, String address, long phoneNo) {
        super(type.name());
    }


    public String getMemberId() {
        return memberId;
    }

    public Reader setMemberId(String memberId) {
        this.memberId = memberId;
        return null;
    }

    public memberType getType() {
        return type;
    }

    public void setType(memberType type) {
        this.type = type;
    }

    public String getDateOfMembership() {
        return dateOfMembership;
    }

    public void setDateOfMembership(String dateOfMembership) {
        this.dateOfMembership = dateOfMembership;
    }

    public boolean isNoBooksIssued() {
        return noBooksIssued;
    }

    public void setNoBooksIssued(boolean noBooksIssued) {
        this.noBooksIssued = noBooksIssued;
    }

    public int getMaxBookLimit() {
        return maxBookLimit;
    }

    public void setMaxBookLimit(int maxBookLimit) {
        this.maxBookLimit = maxBookLimit;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void whoYouAre() {
        super.whoYouAre();
    }

    @Override
    public String toString() {
        return "Reader{" +
                "memberId='" + memberId + '\'' +
                ", type=" + type +
                ", dateOfMembership='" + dateOfMembership + '\'' +
                ", noBooksIssued=" + noBooksIssued +
                ", maxBookLimit=" + maxBookLimit +
                ", address='" + address + '\'' +
                ", phoneNo=" + phoneNo +
                '}';
    }
}
