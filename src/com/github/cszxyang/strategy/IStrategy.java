package com.github.cszxyang.strategy;

import java.lang.reflect.Field;
import java.util.function.Function;

public interface IStrategy {
  /**
   * function 接收 data, apply 完返回数据
   * @param function 具体的函数调用
   * @param data data
   * @param <D> type of data
   * @param <R> type of return val
   * @return return val
   */
   default <D, R> R insert(Function<D, R> function, D data) {
       try {
           Field idField = data.getClass().getDeclaredField("extendInfo");
           idField.setAccessible(true);
           String extendInfo = (String)idField.get(data);
           Field extendInfoCipherField = data.getClass().getDeclaredField("extendInfoCipher");
           extendInfoCipherField.setAccessible(true);
           extendInfoCipherField.set(data, extendInfo + "-cipher");
           return function.apply(data);
       } catch (NoSuchFieldException | IllegalAccessException e) {
           e.printStackTrace();
       }
       return null;
   }

    /**
   * 通用查询
   * @param function 具体的查询函数
   * @param param   查询参数
   * @param <P>   type of param
     * @param <R>   type of return val
     * @return      return val
   */
   <P, R> R select(Function<P, R> function, P param);
}
