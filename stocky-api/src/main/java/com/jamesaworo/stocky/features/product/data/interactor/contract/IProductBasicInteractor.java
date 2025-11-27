package com.jamesaworo.stocky.features.product.data.interactor.contract;

import com.jamesaworo.stocky.features.product.data.request.ProductBasicRequest;
import com.jamesaworo.stocky.features.product.domain.entity.ProductBasic;

/**
 * @author Ph?m L? Ng?c S?n
 * @since 6/1/23
 */
public interface IProductBasicInteractor {

    ProductBasic save(ProductBasicRequest request);

    ProductBasic update(ProductBasic basic);

    ProductBasic update(ProductBasicRequest basic);

}