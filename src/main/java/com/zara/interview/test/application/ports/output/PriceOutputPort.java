package com.zara.interview.test.application.ports.output;

import com.zara.interview.test.domain.model.Price;
import java.time.LocalDateTime;
import java.util.Optional;

public interface PriceOutputPort {
    Optional<Price> getPriceBy(Long brandId, Long productId, LocalDateTime dateTime);
}
