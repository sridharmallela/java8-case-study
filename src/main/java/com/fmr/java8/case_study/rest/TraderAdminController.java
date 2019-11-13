package com.fmr.java8.case_study.rest;

import com.fmr.java8.case_study.domain.Trader;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin/trader")
public class TraderAdminController {

    @PostMapping(path = "create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> createTrader(@RequestBody Trader trader) {
        return new ResponseEntity(
            new Trader("Jack", "Bauer"),
            HttpStatus.CREATED);
    }
}
