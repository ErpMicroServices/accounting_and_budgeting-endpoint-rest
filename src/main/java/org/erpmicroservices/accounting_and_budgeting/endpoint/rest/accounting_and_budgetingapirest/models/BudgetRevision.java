package org.erpmicroservices.accounting_and_budgeting.endpoint.rest.accounting_and_budgetingapirest.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@ToString
@EqualsAndHashCode
public class BudgetRevision extends AbstractPersistable<UUID> {
 private Long revisionSequence;
 private LocalDate dateRevised;
 @OneToMany
 @JoinColumn(name = "budget_revision_id")
 private List<BudgetRevisionImpact> budgetRevisionImpactList;
}
