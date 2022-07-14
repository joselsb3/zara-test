package com.zara.interview.test.infraestructure.adapters.config;

import com.zara.interview.test.domain.service.PriceService;
import com.zara.interview.test.infraestructure.adapters.output.persistence.PricePersistenceAdapter;
import com.zara.interview.test.infraestructure.adapters.output.persistence.mapper.PricePersistenceMapper;
import com.zara.interview.test.infraestructure.adapters.output.persistence.repository.BrandRepository;
import com.zara.interview.test.infraestructure.adapters.output.persistence.repository.PriceRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public PricePersistenceAdapter pricePersistenceAdapter(PriceRepository priceRepository,
                                                           PricePersistenceMapper pricePersistenceMapper) {
        return new PricePersistenceAdapter(priceRepository, pricePersistenceMapper);
    }

    @Bean
    public PriceService priceService(PricePersistenceAdapter pricePersistenceAdapter) {
        return new PriceService(pricePersistenceAdapter);
    }

}
