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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@ToString
@EqualsAndHashCode
public class OrganizationGlAccountBalance extends AbstractPersistable<UUID> {
 @NotNull
 private BigDecimal amount;
 @OneToMany
 @JoinColumn(name = "organization_gl_account_balance_id")
 private List<TransactionDetail> transactionDetailList = new ArrayList<>();
 @ManyToOne
 @JoinColumn(name = "accounting_period_id")
 private AccountingPeriod period;
 @ManyToOne
 private OrganizationGlAccount organizationGlAccount;

}
