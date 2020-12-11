package org.erpmicroservices.accounting_and_budgeting.endpoint.rest.accounting_and_budgetingapirest.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@ToString
@EqualsAndHashCode
public class Payment extends AbstractPersistable<UUID> {

 private LocalDate effectiveDate;
 private String paymentReferenceNumber;
 private BigDecimal amount;
 private String comment;

 @OneToMany
 @JoinColumn(name = "payment_id")
 private List<PaymentBudgetAllocation> paymentBudgetAllocationList;

}
