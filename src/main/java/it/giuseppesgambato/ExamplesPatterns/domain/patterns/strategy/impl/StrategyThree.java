package it.giuseppesgambato.ExamplesPatterns.domain.patterns.strategy.impl;

import it.giuseppesgambato.ExamplesPatterns.domain.enums.StrategyEnum;
import it.giuseppesgambato.ExamplesPatterns.domain.patterns.strategy.StrategyPattern;
import it.giuseppesgambato.ExamplesPatterns.domain.annotation.HandleStrategy;
import org.springframework.stereotype.Service;

@HandleStrategy(StrategyEnum.STRATEGY_3)
@Service
public class StrategyThree implements StrategyPattern {
    @Override
    public String getStrategy() {
        return "STRATEGY THREE";
    }
}
