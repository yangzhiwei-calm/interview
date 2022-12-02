package com.yang;

import java.util.List;

public interface SkuService {
    List<Sku> findAllSku();

    List<SkuCate> findAllSkuCate();
}
