package com.fmr.java8.case_study.rest;

import com.fmr.java8.case_study.dao.TraderRepository;
import com.fmr.java8.case_study.domain.Trader;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin/traders")
public class TraderAdminController {

    @Autowired
    TraderRepository traderRepository;

    @PostMapping(path = "create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Trader> createTrader(@RequestBody Trader trader) {
        return new ResponseEntity(
            traderRepository.save(trader),
            HttpStatus.CREATED);
    }
    
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Trader>> findAllTraders() {
        return new ResponseEntity(
            traderRepository.findAll(),
            HttpStatus.CREATED);
    }
    
}
