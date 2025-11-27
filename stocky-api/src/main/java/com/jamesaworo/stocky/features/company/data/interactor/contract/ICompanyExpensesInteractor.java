package com.jamesaworo.stocky.features.company.data.interactor.contract;

import com.jamesaworo.stocky.core.params.PageSearchRequest;
import com.jamesaworo.stocky.core.params.PageSearchResult;
import com.jamesaworo.stocky.features.company.data.request.CompanyExpensesRequest;
import com.jamesaworo.stocky.features.company.data.request.CompanyExpensesSearchRequest;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * @author Ph?m L? Ng?c S?n
 * @since 5/10/23
 */
public interface ICompanyExpensesInteractor {

	ResponseEntity<CompanyExpensesRequest> save(CompanyExpensesRequest request);
	
	ResponseEntity<PageSearchResult<List<CompanyExpensesRequest>>> search(PageSearchRequest<CompanyExpensesSearchRequest> request);
}