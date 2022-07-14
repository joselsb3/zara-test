package com.zara.interview.test.domain.model;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
@Getter
public class Price {

    private Long brandId;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private Long productId;

    private Integer priceList;

    private Integer priority;

    private BigDecimal price;

    private String curr;


}
