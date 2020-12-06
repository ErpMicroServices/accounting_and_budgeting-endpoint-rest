package org.erpmicroservices.accounting_and_budgeting.endpoint.rest.accounting_and_budgetingapirest.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@ToString
@EqualsAndHashCode
public class AccountingPeriod extends AbstractPersistable<UUID> {

 private Long accountingPeriodNumber;
 private LocalDate fromDate;
 private LocalDate thruDate;
 @ManyToOne
 private PeriodType periodType;
}
