package com.github.cszxyang.mapper.order;

import java.util.List;

public interface OrderMapper {
  List<Order> selectById(Integer id);

  Integer insert(Order order);
}
