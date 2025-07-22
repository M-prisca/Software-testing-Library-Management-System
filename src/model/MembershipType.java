package model;

public class MembershipType {
    private String membershipTypeId;
    private String membershipName;
    private int maxBooks;
    private int price; // Per day

    public MembershipType(String membershipTypeId, String membershipName, int maxBooks, int price) {
        this.membershipTypeId = membershipTypeId;
        this.membershipName = membershipName;
        this.maxBooks = maxBooks;
        this.price = price;
    }

    public String getMembershipTypeId() {
        return membershipTypeId;
    }

    public String getMembershipName() {
        return membershipName;
    }

    public int getMaxBooks() {
        return maxBooks;
    }

    public int getPrice() {
        return price;
    }
}
