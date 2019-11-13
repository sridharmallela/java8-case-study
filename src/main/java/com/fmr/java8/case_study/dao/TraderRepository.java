package com.fmr.java8.case_study.dao;

import com.fmr.java8.case_study.domain.Trader;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TraderRepository extends CrudRepository<Trader, Long> {

    Trader findByTraderId(String id);
}
