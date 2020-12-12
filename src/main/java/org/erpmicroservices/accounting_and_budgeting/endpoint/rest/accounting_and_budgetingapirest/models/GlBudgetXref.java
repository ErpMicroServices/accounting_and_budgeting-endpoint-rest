package org.erpmicroservices.accounting_and_budgeting.endpoint.rest.accounting_and_budgetingapirest.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@ToString
@EqualsAndHashCode
public class GlBudgetXref extends AbstractPersistable<UUID> {
 @NotNull
 private LocalDate fromDate;
 private LocalDate thruDate;
 private BigDecimal allocationPercentage;


}
