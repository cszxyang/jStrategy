package com.github.cszxyang.mapper.goods;

public class Goods {
    private Integer id;
    private String extendInfo;
    private String extendInfoCipher;

    public Goods() {
    }

    public Goods(Integer id, String extendInfo) {
        this.id = id;
        this.extendInfo = extendInfo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExtendInfo() {
        return extendInfo;
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
}
