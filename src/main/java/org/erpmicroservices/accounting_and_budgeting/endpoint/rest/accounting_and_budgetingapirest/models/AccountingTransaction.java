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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@ToString
@EqualsAndHashCode
public class AccountingTransaction extends AbstractPersistable<UUID> {
 @NotNull
 private LocalDate transactionDate;
 private LocalDate entryDate = LocalDate.now();
 @NotBlank
 private String description;
 @ManyToOne
 private AccountingTransactionType type;
 private UUID partyRoleId;
 private UUID partyId;
 private UUID invoiceId;
 private UUID paymentId;
 private UUID inventoryItemVarianceId;
 @OneToMany
 @JoinColumn(name = "accounting_transaction_id")
 private List<TransactionDetail> transactionDetailList = new ArrayList<>();

}
