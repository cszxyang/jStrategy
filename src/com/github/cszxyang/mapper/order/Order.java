package com.github.cszxyang.mapper.order;

public class Order {

  private Integer id;
  private String extendInfo;
  private String extendInfoCipher;

  public Order() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Order(String extendInfo) {
    this.extendInfo = extendInfo;
  }

  public String getExtendInfo() {
    return extendInfo;
  }

  public Order(Integer id, String extendInfo) {
    this.id = id;
    this.extendInfo = extendInfo;
  }

  public void setExtendInfo(String extendInfo) {
    this.extendInfo = extendInfo;
  }

  public String getExtendInfoCipher() {
    return extendInfoCipher;
  }

  public void setExtendInfoCipher(String extendInfoCipher) {
    this.extendInfoCipher = extendInfoCipher;
  }

  @Override
  public String toString() {
    return "Order{" +
      "extendInfo='" + extendInfo + '\'' +
      ", extendInfoCipher='" + extendInfoCipher + '\'' +
      '}';
  }
}
