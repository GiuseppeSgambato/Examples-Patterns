package it.giuseppesgambato.ExamplesPatterns.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Pattern")
@Slf4j
public class AnotherPatternController {

    @GetMapping("/Another")
    public ResponseEntity<Void> AnotherPattern() {
       log.info("AnotherPattern NOT_IMPLEMENTED");
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
