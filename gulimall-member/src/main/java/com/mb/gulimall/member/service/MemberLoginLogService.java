package com.mb.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mb.common.utils.PageUtils;
import com.mb.gulimall.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author Qi
 * @email Qi@gmail.com
 * @date 2022-05-08 15:28:49
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

