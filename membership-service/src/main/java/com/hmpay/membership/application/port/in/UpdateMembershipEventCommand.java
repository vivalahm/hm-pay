package com.hmpay.membership.application.port.in;


import com.hmpay.common.SelfValidating;
import lombok.*;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import jakarta.validation.constraints.NotNull;

@Builder
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class UpdateMembershipEventCommand extends SelfValidating<UpdateMembershipEventCommand> {

    @NotNull
    @TargetAggregateIdentifier
    private String aggregateIdentifier;
    private String name;

    private String address;

    private String email;

    private boolean isValid;
}
