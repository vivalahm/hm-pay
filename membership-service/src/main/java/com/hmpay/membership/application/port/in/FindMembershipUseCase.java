package com.hmpay.membership.application.port.in;

import com.hmpay.membership.domain.Membership;

public interface FindMembershipUseCase {

	Membership findMembership(FindMembershipCommand command);
	Membership findAxonMembership(FindMembershipCommand command);
}
