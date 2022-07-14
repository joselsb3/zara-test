package com.zara.interview.test.infraestructure.adapters.input.api.mapper;

import com.zara.interview.test.domain.model.Price;
import com.zara.interview.test.infraestructure.adapters.input.api.response.PriceQueryResponse;
import org.springframework.stereotype.Component;

@Component
public class PriceRestMapper {

    public PriceQueryResponse toPriceQueryResponse(Price price) {
        return PriceQueryResponse.builder()
                .brand_id(price.getBrandId())
                .product_id(price.getProductId())
                .price(price.getPrice())
                .price_list(price.getPriceList())
                .curr(price.getCurr())
                .start_date(price.getStartDate())
                .end_date(price.getEndDate())
                .build();
    }
}
