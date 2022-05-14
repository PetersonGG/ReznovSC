package com.mb.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mb.common.utils.PageUtils;
import com.mb.gulimall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 
 *
 * @author Qi
 * @email Qi@gmail.com
 * @date 2022-05-08 14:20:07
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

