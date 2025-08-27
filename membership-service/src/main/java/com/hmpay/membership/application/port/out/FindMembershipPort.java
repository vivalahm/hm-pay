package com.hmpay.membership.application.port.out;

import com.hmpay.membership.domain.Membership;

public interface FindMembershipPort {

	Membership findMembership(
			Membership.MembershipId membershipId
	);
}
