package com.gourav.xoriant.controller;

import com.gourav.xoriant.domain.Base;
import com.gourav.xoriant.service.BaseJsonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping("/base")
public class BaseJsonController {

  @Autowired
  private BaseJsonService baseJsonService;

  @PostMapping
  public ResponseEntity<?> saveBase(@Valid @RequestBody Base base) {
    log.info(" request {}", base);
    try {
      baseJsonService.save(base);
      log.info("service response {}", base);
      return new ResponseEntity<>(base, HttpStatus.CREATED);
    } catch (Exception e) {
      log.error("Failed to add", e.getMessage());
      return new ResponseEntity<>("Error adding ", HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @PostMapping("/{id}")
  public ResponseEntity<?> compare(@PathVariable ("id") String id, @Valid @RequestBody Base input) {
    log.info(" request {}", input);
    try {
      String response = baseJsonService.compare(input, id);
      log.info("service response {}", response);
      return new ResponseEntity<>(response, HttpStatus.OK);
    } catch (Exception e) {
      log.error("Failed to compare", e.getMessage());
      return new ResponseEntity<>("Error in comparison ", HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }


}
