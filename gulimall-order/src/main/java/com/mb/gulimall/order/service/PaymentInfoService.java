package com.mb.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mb.common.utils.PageUtils;
import com.mb.gulimall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * ֧
 *
 * @author Qi
 * @email Qi@gmail.com
 * @date 2022-05-08 15:59:45
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

