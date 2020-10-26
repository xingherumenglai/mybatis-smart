package com.qf.wly.entity;

import java.math.BigDecimal;

public class Product {
    /**
     * 主键
     */
    private Integer productId;

    /**
     * 商品标题
     */
    private String title;

    /**
     * 详细信息
     */
    private String content;

    /**
     * 商品图片
     */
    private String img;

    /**
     * 商品的价格
     */
    private BigDecimal price;

    /**
     * 0表示未删除，1表示已删除
     */
    private Integer status;

    /**
     *
     */
    private Integer cateId;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }
}

