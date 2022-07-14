package com.zara.interview.test.application.ports.input;

import com.zara.interview.test.domain.exception.PriceNotFound;
import com.zara.interview.test.domain.model.Price;

import java.time.LocalDateTime;

public interface GetPriceUseCase {
    Price getPriceBy(Long brandId, Long productId, LocalDateTime date) throws PriceNotFound;
}
