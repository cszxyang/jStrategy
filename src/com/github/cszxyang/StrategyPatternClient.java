package com.github.cszxyang;

import com.github.cszxyang.mapper.order.Order;
import com.github.cszxyang.mapper.order.OrderMapper;
import com.github.cszxyang.mapper.order.OrderMapperImpl;
import com.github.cszxyang.strategy.Context;
import com.github.cszxyang.strategy.DefaultStrategy;
import com.github.cszxyang.strategy.StageOneStrategy;

public class StrategyPatternClient {

   public static void main(String[] args) {
     OrderMapper mapper = new OrderMapperImpl();
     Context context = new Context(new DefaultStrategy());
     System.out.println(context.select(mapper::selectById, 1));

     Context context1 = new Context(new StageOneStrategy());
     System.out.println(context1.select(mapper::selectById, 2));
     context1.insert(mapper::insert, new Order(3, "hello3"));
     System.out.println(context1.select(mapper::selectById, 3));
   }
}
