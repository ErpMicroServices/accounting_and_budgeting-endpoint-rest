package org.erpmicroservices.accounting_and_budgeting.endpoint.rest.accounting_and_budgetingapirest.repositories;

import org.erpmicroservices.accounting_and_budgeting.endpoint.rest.accounting_and_budgetingapirest.models.StandardTimePeriod;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource
public interface StandardTimePeriodRepository extends PagingAndSortingRepository<StandardTimePeriod, UUID> {

}
