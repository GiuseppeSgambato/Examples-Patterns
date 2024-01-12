package it.giuseppesgambato.ExamplesPatterns.domain.enums;

public enum StrategyEnum {

    STRATEGY_1 ("Strategy 1"),
    STRATEGY_2 ("Strategy 2"),
    STRATEGY_3 ("Strategy 3"),
    STRATEGY_4 ("Strategy 4"),
    UNKNOWN("Unknown");

    private final String value;

    StrategyEnum(String value){
        this.value=value;
    }

    public String getValue(){
        return this.value;
    }
}
