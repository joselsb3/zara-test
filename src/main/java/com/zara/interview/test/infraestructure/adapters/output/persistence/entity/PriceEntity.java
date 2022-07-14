package com.zara.interview.test.infraestructure.adapters.output.persistence.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "price")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PriceEntity {

    @ManyToOne
    @JoinColumn(name = "BRAND_ID")
    private BrandEntity brandId;

    @Column(name = "START_DATE")
    private LocalDate startDate;

    @Column(name = "START_TIME")
    private LocalTime startTime;

    @Column(name = "END_DATE")
    private LocalDate endDate;

    @Column(name = "END_TIME")
    private LocalTime endTime;

    @Column(name = "PRODUCT_ID")
    private Long productId;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "PRICE_LIST")
    private Integer priceList;

    @Column(name = "PRIORITY")
    private Integer priority;

    @Column(name = "PRICE")
    private BigDecimal price;

    @Column(name = "CURR")
    private String curr;

}