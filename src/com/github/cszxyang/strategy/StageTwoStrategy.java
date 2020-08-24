package com.github.cszxyang.strategy;

import java.util.function.Function;

public class StageTwoStrategy implements IStrategy {
  @Override
  public <P, R> R select(Function<P, R> function, P param) {
    return function.apply(param);
  }
}
