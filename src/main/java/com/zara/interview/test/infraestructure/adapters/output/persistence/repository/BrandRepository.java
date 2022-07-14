package com.zara.interview.test.infraestructure.adapters.output.persistence.repository;

import com.zara.interview.test.infraestructure.adapters.output.persistence.entity.BrandEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<BrandEntity, Long> {
}
