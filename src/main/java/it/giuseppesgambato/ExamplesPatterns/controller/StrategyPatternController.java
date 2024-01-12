package it.giuseppesgambato.ExamplesPatterns.controller;

import it.giuseppesgambato.ExamplesPatterns.domain.enums.StrategyEnum;
import it.giuseppesgambato.ExamplesPatterns.domain.service.StrategyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Pattern")
@Slf4j
public class StrategyPatternController {

    @Autowired
    private StrategyService strategyService;
    @GetMapping("/Strategy")
    public String StrategyPattern(StrategyEnum strategyEnum) {
       log.info("StrategyPattern");
        return strategyService.getStrategy(strategyEnum);
    }
}
