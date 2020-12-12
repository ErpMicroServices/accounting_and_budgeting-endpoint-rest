package org.erpmicroservices.accounting_and_budgeting.endpoint.rest.accounting_and_budgetingapirest.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@ToString
@EqualsAndHashCode
public class BudgetItemType extends AbstractPersistable<UUID> {
 @NotBlank
 @NotNull
 private String description;

 @ManyToOne
 private BudgetItemType parent;

 @OneToMany
 @JoinColumn(name = "budget_item_type_id")
 private List<GlBudgetXref> glBudgetXrefList;

}
