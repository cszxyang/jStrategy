package com.github.cszxyang.strategy;

import java.util.function.Function;

public class DefaultStrategy implements IStrategy{
  @Override
  public <D, R> R insert(Function<D, R> function, D data) {
    return function.apply(data);
  }

  @Override
  public <P, R> R select(Function<P, R> function, P param) {
    return function.apply(param);
  }
}
