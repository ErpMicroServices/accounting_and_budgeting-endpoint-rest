package org.erpmicroservices.accounting_and_budgeting.endpoint.rest.accounting_and_budgetingapirest.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@ToString
@EqualsAndHashCode
public class Budget extends AbstractPersistable<UUID> {

 @OneToMany
 @JoinColumn(name = "budget_id")
 private List<BudgetStatus> budgetStatusList;

 @OneToMany
 @JoinColumn(name = "budget_id")
 private List<BudgetRole> budgetRoleList;

 @ManyToOne
 private StandardTimePeriod standardTimePeriod;

 @OneToMany
 @JoinColumn(name = "budget_id")
 private List<BudgetRevision> budgetRevisionList;

 @OneToMany
 @JoinColumn(name = "budget_id")
 private List<BudgetReview> budgetReviewList;
}
