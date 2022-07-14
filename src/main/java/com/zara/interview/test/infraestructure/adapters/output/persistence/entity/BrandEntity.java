package com.zara.interview.test.infraestructure.adapters.output.persistence.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "brand")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BrandEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column (name = "brand_id")
    private Long brandId;

    @Column (name = "brand_name")
    private String brandName;




}
