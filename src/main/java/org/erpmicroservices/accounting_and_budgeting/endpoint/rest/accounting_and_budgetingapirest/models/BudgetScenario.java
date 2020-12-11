package org.erpmicroservices.accounting_and_budgeting.endpoint.rest.accounting_and_budgetingapirest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@Entity
public class BudgetScenario extends AbstractPersistable<UUID> {
 @NotBlank
 @NotNull
 private String description;

 @OneToMany
 @JoinColumn(name = "budget_scenario_id")
 private List<BudgetScenarioApplication> budgetScenarioApplicationList;

 @OneToMany
 @JoinColumn(name = "budget_scenario_id")
 private List<BudgetScenarioRule> budgetScenarioRuleList;

}
