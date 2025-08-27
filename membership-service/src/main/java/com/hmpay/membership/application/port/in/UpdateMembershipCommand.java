package com.hmpay.membership.application.port.in;


import com.hmpay.common.SelfValidating;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import jakarta.validation.constraints.NotNull;

@Builder
@Data
@EqualsAndHashCode(callSuper = false)
public class UpdateMembershipCommand extends SelfValidating<UpdateMembershipCommand> {
    @NotNull
    @TargetAggregateIdentifier
    private String membershipId;

    private String name;

    private String address;

    private String email;

    private boolean isValid;

    public UpdateMembershipCommand(String membershipId, String name, String address, String email, boolean isValid) {
        this.membershipId = membershipId;
        this.name = name;
        this.address = address;
        this.email = email;
        this.isValid = isValid;
    }
}
