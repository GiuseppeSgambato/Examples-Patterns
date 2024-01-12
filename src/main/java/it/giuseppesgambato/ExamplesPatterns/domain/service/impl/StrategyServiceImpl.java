package it.giuseppesgambato.ExamplesPatterns.domain.service.impl;

import it.giuseppesgambato.ExamplesPatterns.domain.enums.StrategyEnum;
import it.giuseppesgambato.ExamplesPatterns.domain.patterns.strategy.StrategyPattern;
import it.giuseppesgambato.ExamplesPatterns.domain.annotation.HandleStrategy;
import it.giuseppesgambato.ExamplesPatterns.domain.service.StrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StrategyServiceImpl implements StrategyService {

    private final Map<StrategyEnum, StrategyPattern> chooseStrategy;

    @Autowired
    public StrategyServiceImpl(List<StrategyPattern> strategyPatterns){
        chooseStrategy = strategyPatterns.stream()
                .filter(c -> c.getClass().isAnnotationPresent(HandleStrategy.class))
                .filter(c -> !StrategyEnum.UNKNOWN.equals(c.getClass().getAnnotation(HandleStrategy.class).value()))
                .collect(Collectors.toMap(c-> c.getClass().getAnnotation(HandleStrategy.class).value(), c->c));
    }

    @Override
    public String getStrategy(StrategyEnum strategyEnum) {
        String returnStrategy = Optional.ofNullable(chooseStrategy.get(strategyEnum))
                .map(c-> c.getStrategy())
                .orElseThrow(() ->new RuntimeException("Strategy not registered"));
        return returnStrategy;
    }
}
