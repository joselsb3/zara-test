package com.zara.interview.test.domain.service;

import com.zara.interview.test.application.ports.input.GetPriceUseCase;
import com.zara.interview.test.application.ports.output.PriceOutputPort;
import com.zara.interview.test.domain.exception.PriceNotFound;
import com.zara.interview.test.domain.model.Price;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
public class PriceService implements GetPriceUseCase {

    private final PriceOutputPort priceOutputPort;

    @Override
    public Price getPriceBy(Long brandId, Long productId, LocalDateTime date) {
        return priceOutputPort.getPriceBy(brandId, productId, date)
                .orElseThrow( () -> new PriceNotFound(String.format(
                        "Price not found with {brand_id = %d, product_id = %d, date = %s}", brandId, productId, date)));
    }
}
