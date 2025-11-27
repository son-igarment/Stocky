package com.jamesaworo.stocky.core.mapper;

/**
 * @author Ph?m L? Ng?c S?n
 * @since 4/21/23
 */
public interface Mapper<R, M> {
    // R -> RequestObject, M -> Model Object

    R toRequest(M model);

    M toModel(R request);

}