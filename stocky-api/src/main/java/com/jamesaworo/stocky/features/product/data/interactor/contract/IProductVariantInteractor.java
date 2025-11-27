package com.jamesaworo.stocky.features.product.data.interactor.contract;

import com.jamesaworo.stocky.features.product.data.request.ProductVariantRequest;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * @author Ph?m L? Ng?c S?n
 * @since 5/10/23
 */
public interface IProductVariantInteractor {
    ResponseEntity<ProductVariantRequest> save(ProductVariantRequest variant);

    ResponseEntity<List<ProductVariantRequest>> findAll();

    ResponseEntity<ProductVariantRequest> findOne(Long id);

    ResponseEntity<ProductVariantRequest> update(ProductVariantRequest request);
}