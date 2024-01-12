package it.giuseppesgambato.ExamplesPatterns.domain.annotation;

import it.giuseppesgambato.ExamplesPatterns.domain.enums.StrategyEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface HandleStrategy {
    StrategyEnum value() default StrategyEnum.UNKNOWN;
}
