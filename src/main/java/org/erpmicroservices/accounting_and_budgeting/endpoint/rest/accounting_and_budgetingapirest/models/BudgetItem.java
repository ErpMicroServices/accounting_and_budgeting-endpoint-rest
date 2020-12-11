package org.erpmicroservices.accounting_and_budgeting.endpoint.rest.accounting_and_budgetingapirest.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@ToString
@EqualsAndHashCode
public class BudgetItem extends AbstractPersistable<UUID> {
 @NotNull
 private BigDecimal amount;
 private String purpose;
 private String justification;
 @OneToMany
 @JoinColumn(name = "budget_item_id")
 private List<BudgetItem> budgetItemList;
 @ManyToOne
 private BudgetItemType type;
 @OneToMany
 @JoinColumn(name = "budget_item_id")
 private List<BudgetScenarioApplication> budgetScenarioApplicationList;
 @OneToMany
 @JoinColumn(name = "budget_item_id")
 private List<PaymentBudgetAllocation> paymentBudgetAllocationList;
 @OneToMany
 @JoinColumn(name = "budget_item_id")
 private List<OrderItemBudgetAllocation> budgetItemOrderItemList;
 @OneToMany
 @JoinColumn(name = "budget_item_id")
 private List<RequirementBudgetAllocation> requirementBudgetAllocationList;
}
