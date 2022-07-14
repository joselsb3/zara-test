package com.zara.interview.test.infraestructure.adapters.output.persistence.repository;

import com.zara.interview.test.infraestructure.adapters.output.persistence.entity.PriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface PriceRepository extends JpaRepository<PriceEntity, Integer> {

    @Query(value = "from PriceEntity t where brand_id = :brandId and product_id = :productId " +
            "and :currentDate BETWEEN start_date and end_date " +
            "and :currentTime BETWEEN start_time and end_time ORDER BY priority DESC")
    List<PriceEntity> findPriceBetweenDates(
            @Param("brandId")Long brandId,
            @Param("productId")Long productId,
            @Param("currentDate") LocalDate currentDate,
            @Param("currentTime") LocalTime currentTime);
}
