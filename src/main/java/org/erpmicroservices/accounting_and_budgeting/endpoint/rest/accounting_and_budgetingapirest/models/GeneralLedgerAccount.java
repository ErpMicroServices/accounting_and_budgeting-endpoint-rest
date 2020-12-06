package org.erpmicroservices.accounting_and_budgeting.endpoint.rest.accounting_and_budgetingapirest.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@ToString
@EqualsAndHashCode
public class GeneralLedgerAccount extends AbstractPersistable<UUID> {

 private String name;
 private String description;
 @ManyToOne
 private GeneralLedgerAccountType type;

 @OneToMany
 @JoinColumn(name = "general_ledger_account_id")
 private List<OrganizationGlAccount> organizationGLAccountList = new ArrayList<>();
}
