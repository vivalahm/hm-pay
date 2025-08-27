package com.hmpay.membership.application.service;

import com.hmpay.common.UseCase;
import com.hmpay.membership.application.port.in.UpdateMembershipCommand;
import com.hmpay.membership.application.port.in.UpdateMembershipEventCommand;
import com.hmpay.membership.application.port.in.UpdateMembershipUseCase;
import com.hmpay.membership.application.port.out.FindMembershipPort;
import com.hmpay.membership.application.port.out.UpdateMembershipPort;
import com.hmpay.membership.domain.Membership;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.axonframework.commandhandling.gateway.CommandGateway;



@RequiredArgsConstructor
@UseCase
@Transactional
public class UpdateMembership implements UpdateMembershipUseCase {

	private final UpdateMembershipPort uport;
	private final FindMembershipPort fport;
	private final CommandGateway commandGateway;
	@Override
	public Membership updateMembership(UpdateMembershipCommand command) {
		return uport.updateMembership(
				new Membership.MembershipId(command.getMembershipId()),
				new Membership.MembershipName(command.getName()),
				new Membership.MembershipEmail(command.getEmail()),
				new Membership.MembershipAddress(command.getAddress()),
				new Membership.MembershipIsValid(command.isValid())
		);
	}

	@Override
	public Membership updateAxonMembership(UpdateMembershipCommand command) {
		System.out.println("update axon membership");
		Membership membership = fport.findMembership(new Membership.MembershipId(command.getMembershipId()));
		UpdateMembershipEventCommand eventCommand = UpdateMembershipEventCommand.builder()
				.aggregateIdentifier(membership.getAggregateIdentifier())
				.name(command.getName())
				.email(command.getEmail())
				.address(command.getAddress())
				.isValid(command.isValid())
				.build();

		commandGateway.send(eventCommand).whenComplete((Object result, Throwable throwable) -> {
				if (throwable == null) {
					System.out.println("Aggregate ID:" + result);
				} else {
					System.out.println("error : " + throwable.getMessage());
				}
			});

		this.updateMembership(command);
		return null;
	}
}




