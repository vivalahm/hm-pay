package com.hmpay.membership.application.port.in;

import com.hmpay.membership.domain.Membership;

public interface UpdateMembershipUseCase {

	Membership updateMembership(UpdateMembershipCommand command);
	Membership updateAxonMembership(UpdateMembershipCommand command);
}
