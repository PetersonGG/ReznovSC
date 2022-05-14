package com.mb.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;

/**
 *
 *
 * @author Qi
 * @email Qi@gmail.com
 * @date 2022-05-08 14:20:07
 */
@Data
@TableName("pms_category")
public class CategoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 *
	 */
	@TableId
	private Long catId;
	/**
	 *
	 */
	private String name;
	/**
	 *
	 */
	private Long parentCid;
	/**
	 *
	 */
	private Integer catLevel;
	/**
	 *
	 */
	private Integer showStatus;
	/**
	 *
	 */
	private Integer sort;
	/**
	 * ͼ
	 */
	private String icon;
	/**
	 *
	 */
	private String productUnit;
	/**
	 *
	 */
	private Integer productCount;

	@TableField(exist=false) //表中不存在，自定义的属性
	private List<CategoryEntity> children;

}
