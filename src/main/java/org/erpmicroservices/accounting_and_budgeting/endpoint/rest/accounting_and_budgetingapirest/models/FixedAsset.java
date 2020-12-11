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
import java.util.List;
import java.util.UUID;

@Data
@ToString
@EqualsAndHashCode
@Entity
public class FixedAsset extends AbstractPersistable<UUID> {
 @NotBlank
 @NotNull
 private String name;
 private LocalDate dateAcquired;
 private LocalDate dateLastServiced;
 private LocalDate dateNextService;
 private Long productionCapacity;
 private String description;
 @ManyToOne
 private FixedAssetType type;
 @OneToMany
 @JoinColumn(name = "fixed_asset_id")
 private List<AccountingTransaction> accountingTransactionList;
 @OneToMany
 @JoinColumn(name = "fixed_asset_id")
 private List<FixedAssetDepreciationMethod> fixedAssetDepreciationMethodList;

}
