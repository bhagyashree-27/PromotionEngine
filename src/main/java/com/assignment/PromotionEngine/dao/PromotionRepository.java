package com.assignment.PromotionEngine.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotionRepository extends JpaRepository<Promotion, Integer> {

	Optional<Promotion> findBySkuCode(String skuCode);

}
