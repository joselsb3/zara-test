package com.zara.interview.test.infraestructure.adapters.input.api.response;

import lombok.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Objects;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PriceQueryResponse {

    private Long product_id;

    private Long brand_id;

    private Integer price_list;

    private BigDecimal price;

    private String curr;

    private LocalDateTime start_date;

    private LocalDateTime end_date;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PriceQueryResponse that = (PriceQueryResponse) o;
        return Objects.equals(product_id, that.product_id) && Objects.equals(brand_id, that.brand_id) && Objects.equals(price_list, that.price_list) && Objects.equals(price, that.price) && Objects.equals(curr, that.curr) && Objects.equals(start_date, that.start_date) && Objects.equals(end_date, that.end_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product_id, brand_id, price_list, price, curr, start_date, end_date);
    }
}
