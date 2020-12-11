package org.erpmicroservices.accounting_and_budgeting.endpoint.rest.accounting_and_budgetingapirest.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Data
@ToString
@EqualsAndHashCode
public class BudgetRevisionImpact extends AbstractPersistable<UUID> {

 @NotNull
 private BigDecimal revisedAmount;
 private boolean addDeleteFlag;
 @NotNull
 @NotEmpty
 private String revisionReason;
 @ManyToOne
 private BudgetItem budgetItem;
}
