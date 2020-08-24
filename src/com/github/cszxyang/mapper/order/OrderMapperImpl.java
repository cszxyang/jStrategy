package com.github.cszxyang.mapper.order;

import java.util.ArrayList;
import java.util.List;

public class OrderMapperImpl implements OrderMapper {

  private List<Order> list;

  {
    list = new ArrayList<>();
    list.add(new Order(0, "hello0"));
    list.add(new Order(1, "hello1"));
    list.add(new Order(2, "hello2"));
  }

  @Override
  public List<Order> selectById(Integer id) {
    List<Order> res = new ArrayList<>();
    for (Order order : list) {
      if (order.getId().equals(id)) {
        res.add(order);
      }
    }
    return res;
  }

  @Override
  public Integer insert(Order order) {
    list.add(order);
    return 1;
  }
}
