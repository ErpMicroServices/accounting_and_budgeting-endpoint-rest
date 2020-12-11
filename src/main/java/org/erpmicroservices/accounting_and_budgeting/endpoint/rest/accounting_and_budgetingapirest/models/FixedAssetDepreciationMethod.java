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

@Data
@ToString
@EqualsAndHashCode
@Entity
public class FixedAssetDepreciationMethod extends AbstractPersistable<UUID> {

 @NotNull
 private LocalDate fromDate;
 private LocalDate thruDate;

 @ManyToOne
 private DepreciationMethod depreciationMethod;
}
