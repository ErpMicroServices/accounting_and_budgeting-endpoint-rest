package org.erpmicroservices.accounting_and_budgeting.endpoint.rest.accounting_and_budgetingapirest.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Data
@ToString
@EqualsAndHashCode
public class BudgetScenarioApplication extends AbstractPersistable<UUID> {
 private BigDecimal amountChange;
 private BigDecimal percentageChange;

 @ManyToOne
 private Budget budget;

 @ManyToOne
 private BudgetItem budgetItem;
}
