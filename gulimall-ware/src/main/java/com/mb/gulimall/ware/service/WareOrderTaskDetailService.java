package com.mb.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mb.common.utils.PageUtils;
import com.mb.gulimall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author Qi
 * @email Qi@gmail.com
 * @date 2022-05-08 16:06:32
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

