package org.erpmicroservices.accounting_and_budgeting.endpoint.rest.accounting_and_budgetingapirest.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@ToString
@EqualsAndHashCode
public class BudgetReview extends AbstractPersistable<UUID> {
 @NotNull
 private LocalDate reviewDate;
 @NotNull
 private UUID partyId;
 @NotNull
 @ManyToOne
 private BudgetReviewResultType type;
 private String comment;

}
