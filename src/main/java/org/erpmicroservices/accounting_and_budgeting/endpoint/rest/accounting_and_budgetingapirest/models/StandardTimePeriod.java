package org.erpmicroservices.accounting_and_budgeting.endpoint.rest.accounting_and_budgetingapirest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class StandardTimePeriod extends AbstractPersistable<UUID> {
 private LocalDate fromDate;
 private LocalDate thruDate;
 @ManyToOne
 private PeriodType type;
}
