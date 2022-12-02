package com.yang;

import java.math.BigDecimal;

/**

 * 订单明细

 */

public class OrderItem {

    /**

     * 订单明细ID

     */

    private Long id;

    /**

     * 菜品ID

     */

    private Long skuId;

    /**

     * 销售数量

     */

    private BigDecimal qty;

    // getter and setter

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Long getSkuId() { return skuId; }

    public void setSkuId(Long skuId) { this.skuId = skuId; }

    public BigDecimal getQty() { return qty; }

    public void setQty(BigDecimal qty) { this.qty = qty; }

}