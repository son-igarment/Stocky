package com.jamesaworo.stocky.features.product.data.repository;

import com.jamesaworo.stocky.features.product.domain.entity.ProductVariant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Ph?m L? Ng?c S?n
 * @since 5/10/23
 */
@Repository
public interface ProductVariantRepository extends JpaRepository<ProductVariant, Long> {
}