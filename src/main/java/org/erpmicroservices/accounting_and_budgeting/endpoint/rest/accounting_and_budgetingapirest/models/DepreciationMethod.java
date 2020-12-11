package org.erpmicroservices.accounting_and_budgeting.endpoint.rest.accounting_and_budgetingapirest.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Data
@ToString
@EqualsAndHashCode
@Entity
public class DepreciationMethod extends AbstractPersistable<UUID> {
 @NotBlank
 @NotNull
 private String description;
 @NotBlank
 @NotNull
 private String formula;
}
