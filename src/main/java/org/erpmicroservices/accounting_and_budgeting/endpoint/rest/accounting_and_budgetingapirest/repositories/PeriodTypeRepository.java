package org.erpmicroservices.accounting_and_budgeting.endpoint.rest.accounting_and_budgetingapirest.repositories;

import org.erpmicroservices.accounting_and_budgeting.endpoint.rest.accounting_and_budgetingapirest.models.PeriodType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource
public interface PeriodTypeRepository extends PagingAndSortingRepository<PeriodType, UUID> {

}
