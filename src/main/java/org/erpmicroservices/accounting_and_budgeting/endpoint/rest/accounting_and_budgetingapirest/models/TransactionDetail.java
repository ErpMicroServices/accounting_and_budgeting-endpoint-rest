package org.erpmicroservices.accounting_and_budgeting.endpoint.rest.accounting_and_budgetingapirest.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@ToString
@EqualsAndHashCode
public class TransactionDetail extends AbstractPersistable<UUID> {

 private BigDecimal amount;
 private boolean debitCreditFlag;
 @OneToMany
 @JoinColumn(name = "parent_id")
 private List<TransactionDetail> children = new ArrayList<>();
 @ManyToOne
 private OrganizationGlAccount organizationGlAccount;
}
