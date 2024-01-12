package it.giuseppesgambato.ExamplesPatterns.domain.patterns.strategy.impl;

import it.giuseppesgambato.ExamplesPatterns.domain.enums.StrategyEnum;
import it.giuseppesgambato.ExamplesPatterns.domain.patterns.strategy.StrategyPattern;
import it.giuseppesgambato.ExamplesPatterns.domain.annotation.HandleStrategy;
import org.springframework.stereotype.Service;

@HandleStrategy(StrategyEnum.STRATEGY_1)
@Service
public class StrategyOne implements StrategyPattern {
    @Override
    public String getStrategy() {
        return "STRATEGY ONE";
    }
}
