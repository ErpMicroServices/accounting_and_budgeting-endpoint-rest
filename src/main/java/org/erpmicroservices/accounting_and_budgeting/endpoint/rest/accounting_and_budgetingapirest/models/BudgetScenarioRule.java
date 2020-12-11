package org.erpmicroservices.accounting_and_budgeting.endpoint.rest.accounting_and_budgetingapirest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
public class BudgetScenarioRule extends AbstractPersistable<UUID> {

 private BigDecimal amountChange;
 private BigDecimal percentageChange;
 @ManyToOne
 private BudgetItemType type;
}
