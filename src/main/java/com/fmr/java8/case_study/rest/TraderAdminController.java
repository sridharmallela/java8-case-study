package com.fmr.java8.case_study.rest;

import com.fmr.java8.case_study.dao.TraderRepository;
import com.fmr.java8.case_study.domain.Trader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("admin/traders")
public class TraderAdminController {

    @Autowired
    TraderRepository traderRepository;

    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Trader>> findAllTraders() {
        return new ResponseEntity(
            traderRepository.findAll(),
            HttpStatus.OK);
    }

    @GetMapping(path = "id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Trader> findTraderByTraderId(@PathVariable(name = "id") Long id) {
        return new ResponseEntity(
            traderRepository.findById(id),
            HttpStatus.OK);
    }

    @GetMapping(path = "lastname/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Trader>> findTraderByLastName(@PathVariable(name = "name") String name) {
        return new ResponseEntity(
            traderRepository.findAllByLastName(name),
            HttpStatus.OK);
    }

    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Trader> createTrader(@RequestBody Trader trader) {
        return new ResponseEntity(
            traderRepository.save(trader),
            HttpStatus.CREATED);
    }

    @DeleteMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Trader> deleteTrader(@RequestBody Trader trader) {
        traderRepository.delete(trader);
        return new ResponseEntity(
            "{Delete successful}",
            HttpStatus.OK);
    }
    
    @GetMapping(path = "email/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Trader>> findTraderByEmail(@PathVariable (name = "email") String email) {
    	return new ResponseEntity(
    			traderRepository.findAllByEmail(email),
    			HttpStatus.OK);
    }
}
