package org.erpmicroservices.accounting_and_budgeting.endpoint.rest.accounting_and_budgetingapirest.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@ToString
@EqualsAndHashCode
public class OrganizationGlAccount extends AbstractPersistable<UUID> {

 private LocalDate fromDate;
 private LocalDate thruDate;
 private UUID internalOrganizationId;
 private UUID supplierId;
 private UUID billToCustomerId;
 private UUID productCategoryId;
 private UUID productId;
 @OneToMany
 @JoinColumn(name = "organization_gl_account_id")
 private List<OrganizationGlAccount> organizationGlAccountList;

}
