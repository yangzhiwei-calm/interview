package com.yang;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Statistic {
    public static void main(String[] args) {

       // set.add(null);
       // System.out.println(set.containsAll(null));
    }

    //另有SkuService服务类可以查出所有菜品，请补充下面count方法实现统计订单明细中某个菜品分类下的菜品的总销售数量。

    public BigDecimal count(SkuService skuService, List<OrderItem> itemList, SkuCate skuCate) {
        List<Sku> skus = skuService.findAllSku();

        Set<Long> specifiedSkuSet = new HashSet<>();
        skus.forEach(sku -> {
            if (sku.getSkuCateId().equals(skuCate.getId())) {
                specifiedSkuSet.add(sku.getId());
            }
        });

        //itemList.stream().reduce(); //使用归约会改变list中第一个数据的值,不知道应不应该改变

        BigDecimal qtyTotal = new BigDecimal(0);
        itemList.forEach(orderItem -> {
            if (orderItem.getSkuId() != null && specifiedSkuSet.contains(orderItem.getSkuId())) {
                qtyTotal.add(orderItem.getQty());
            }
        });

        return qtyTotal;
    }
}
