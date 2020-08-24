package com.github.cszxyang.strategy;

import java.util.function.Function;

public class StageThreeStrategy implements IStrategy {
  @Override
  public <P, R> R select(Function<P, R> function, P param) {
    return function.apply(param);
  }
}