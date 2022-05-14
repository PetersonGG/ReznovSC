package com.mb.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mb.common.utils.PageUtils;
import com.mb.gulimall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author Qi
 * @email Qi@gmail.com
 * @date 2022-05-08 16:06:32
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

