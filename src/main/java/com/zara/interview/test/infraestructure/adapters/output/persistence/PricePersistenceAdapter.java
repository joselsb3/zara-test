package com.zara.interview.test.infraestructure.adapters.output.persistence;

import com.zara.interview.test.infraestructure.adapters.output.persistence.entity.PriceEntity;
import com.zara.interview.test.infraestructure.adapters.output.persistence.mapper.PricePersistenceMapper;
import com.zara.interview.test.infraestructure.adapters.output.persistence.repository.PriceRepository;
import com.zara.interview.test.application.ports.output.PriceOutputPort;
import com.zara.interview.test.domain.model.Price;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class PricePersistenceAdapter implements PriceOutputPort {

    private final PriceRepository priceRepository;
    private final PricePersistenceMapper pricePersistenceMapper;

    @Override
    public Optional<Price> getPriceBy(Long brandId, Long productId, LocalDateTime dateTime) {

        List<PriceEntity> priceEntity = priceRepository.findPriceBetweenDates(
                brandId,
                productId,
                dateTime.toLocalDate(),
                dateTime.toLocalTime());

        if (priceEntity.isEmpty()) {
            return Optional.empty();
        }

        return Optional.of(pricePersistenceMapper.toPrice(priceEntity.get(0)));
    }
}
