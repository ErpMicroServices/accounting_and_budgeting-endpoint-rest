package org.erpmicroservices.accounting_and_budgeting.endpoint.rest.accounting_and_budgetingapirest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
public class FixedAssetType extends AbstractPersistable<UUID> {
 @NotBlank
 @NotNull
 private String description;

 @ManyToOne
 private FixedAssetType parent;

 public String getDescription() {
	return description;
 }

 public void setDescription(String description) {
	this.description = description;
 }

 public FixedAssetType getParent() {
	return parent;
 }

 public void setParent(FixedAssetType parent) {
	this.parent = parent;
 }
}
