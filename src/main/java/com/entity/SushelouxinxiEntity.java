package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 宿舍楼信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-01-30 17:38:15
 */
@TableName("sushelouxinxi")
public class SushelouxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public SushelouxinxiEntity() {
		
	}
	
	public SushelouxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 宿舍楼名称
	 */
					
	private String susheloumingcheng;
	
	/**
	 * 楼层
	 */
					
	private String louceng;
	
	/**
	 * 总房间数
	 */
					
	private String zongfangjianshu;
	
	/**
	 * 宿管账号
	 */
					
	private String suguanzhanghao;
	
	/**
	 * 宿管姓名
	 */
					
	private String suguanxingming;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 学生名单
	 */
					
	private String xueshengmingdan;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：宿舍楼名称
	 */
	public void setSusheloumingcheng(String susheloumingcheng) {
		this.susheloumingcheng = susheloumingcheng;
	}
	/**
	 * 获取：宿舍楼名称
	 */
	public String getSusheloumingcheng() {
		return susheloumingcheng;
	}
	/**
	 * 设置：楼层
	 */
	public void setLouceng(String louceng) {
		this.louceng = louceng;
	}
	/**
	 * 获取：楼层
	 */
	public String getLouceng() {
		return louceng;
	}
	/**
	 * 设置：总房间数
	 */
	public void setZongfangjianshu(String zongfangjianshu) {
		this.zongfangjianshu = zongfangjianshu;
	}
	/**
	 * 获取：总房间数
	 */
	public String getZongfangjianshu() {
		return zongfangjianshu;
	}
	/**
	 * 设置：宿管账号
	 */
	public void setSuguanzhanghao(String suguanzhanghao) {
		this.suguanzhanghao = suguanzhanghao;
	}
	/**
	 * 获取：宿管账号
	 */
	public String getSuguanzhanghao() {
		return suguanzhanghao;
	}
	/**
	 * 设置：宿管姓名
	 */
	public void setSuguanxingming(String suguanxingming) {
		this.suguanxingming = suguanxingming;
	}
	/**
	 * 获取：宿管姓名
	 */
	public String getSuguanxingming() {
		return suguanxingming;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
	/**
	 * 设置：学生名单
	 */
	public void setXueshengmingdan(String xueshengmingdan) {
		this.xueshengmingdan = xueshengmingdan;
	}
	/**
	 * 获取：学生名单
	 */
	public String getXueshengmingdan() {
		return xueshengmingdan;
	}

}
