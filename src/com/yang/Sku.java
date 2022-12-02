package com.yang;

/**

 * 菜品，如：小炒黄牛肉、椰子煲鸡

 */

public class Sku {

    /**

     * 菜品ID

     */

    private Long id;

    /**

     * 菜品名称

     */

    private String name;

    /**

     * 菜品所属分类ID

     */

    private Long skuCateId;

    // getter and setter

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Long getSkuCateId() { return skuCateId; }

    public void setSkuCateId(Long skuCateId) { this.skuCateId = skuCateId; }

}
