package com.fxDeals.progresSoft.progresSoftApplication.dao;

import com.fxDeals.progresSoft.progresSoftApplication.entity.Deal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DealRepository extends CrudRepository<Deal, Long> {
}
