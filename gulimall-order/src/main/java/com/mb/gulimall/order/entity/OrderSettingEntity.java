package com.mb.gulimall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author Qi
 * @email Qi@gmail.com
 * @date 2022-05-08 15:59:45
 */
@Data
@TableName("oms_order_setting")
public class OrderSettingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private Integer flashOrderOvertime;
	/**
	 * 
	 */
	private Integer normalOrderOvertime;
	/**
	 * 
	 */
	private Integer confirmOvertime;
	/**
	 * 
	 */
	private Integer finishOvertime;
	/**
	 * 
	 */
	private Integer commentOvertime;
	/**
	 * 
	 */
	private Integer memberLevel;

}
