package model;

import java.util.Date;

public class Membership {
    private String membershipId;
    private String membershipTypeId;
    private String membershipCode;
    private String membershipStatus;
    private Date expiringTime;
    private String readerId;
    private Date registrationDate;

    public Membership(String membershipId, String membershipTypeId, String membershipCode, String membershipStatus,
            Date expiringTime, String readerId, Date registrationDate) {
        this.membershipId = membershipId;
        this.membershipTypeId = membershipTypeId;
        this.membershipCode = membershipCode;
        this.membershipStatus = membershipStatus;
        this.expiringTime = expiringTime;
        this.readerId = readerId;
        this.registrationDate = registrationDate;
    }

    public String getMembershipId() {
        return membershipId;
    }

    public String getMembershipTypeId() {
        return membershipTypeId;
    }

    public String getMembershipCode() {
        return membershipCode;
    }

    public String getMembershipStatus() {
        return membershipStatus;
    }

    public Date getExpiringTime() {
        return expiringTime;
    }

    public String getReaderId() {
        return readerId;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }
}
