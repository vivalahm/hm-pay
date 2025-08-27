package com.hmpay.membership.application.port.out.query;

public class FindMembershipQuery {
    private String membershipId;

    public FindMembershipQuery() {}

    public FindMembershipQuery(String membershipId) {
        this.membershipId = membershipId;
    }

    public String getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(String membershipId) {
        this.membershipId = membershipId;
    }
}
