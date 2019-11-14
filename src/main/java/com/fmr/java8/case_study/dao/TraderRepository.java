package com.fmr.java8.case_study.dao;

import com.fmr.java8.case_study.domain.Trader;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TraderRepository extends CrudRepository<Trader, Long> {

    List<Trader> findAllByLastName(String lastName);
    List<Trader> findAllByEmail (String email);
    List<Trader> findAllByPhoneNum (String phone);
}
