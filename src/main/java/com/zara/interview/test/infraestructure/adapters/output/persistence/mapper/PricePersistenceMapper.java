package com.zara.interview.test.infraestructure.adapters.output.persistence.mapper;


import com.zara.interview.test.domain.model.Price;
import com.zara.interview.test.infraestructure.adapters.output.persistence.entity.PriceEntity;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class PricePersistenceMapper {

    public Price toPrice(PriceEntity priceEntity) {
        return Price.builder()
                .brandId(priceEntity.getBrandId().getBrandId())
                .startDate(LocalDateTime.of(priceEntity.getStartDate(), priceEntity.getStartTime()))
                .endDate(LocalDateTime.of(priceEntity.getEndDate(), priceEntity.getEndTime()))
                .productId(priceEntity.getProductId())
                .priceList(priceEntity.getPriceList())
                .priority(priceEntity.getPriority())
                .price(priceEntity.getPrice())
                .curr(priceEntity.getCurr())
                .build();
    }
}
