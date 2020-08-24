package com.github.cszxyang.strategy;

import java.util.function.Function;

public class Context {
   private IStrategy strategy;

   public Context(IStrategy strategy){
      this.strategy = strategy;
   }

   public  <P, R> R select(Function<P, R> function, P param) {
      return strategy.select(function, param);
   }

  public <D, R> R insert(Function<D, R> function, D data) {
    return strategy.insert(function, data);
  }
}
