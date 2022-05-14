package com.mb.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mb.common.utils.PageUtils;
import com.mb.gulimall.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 
 *
 * @author Qi
 * @email Qi@gmail.com
 * @date 2022-05-08 15:07:55
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

