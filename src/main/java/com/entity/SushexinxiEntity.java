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
 * 宿舍信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-01-30 17:38:15
 */
@TableName("sushexinxi")
public class SushexinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public SushexinxiEntity() {
		
	}
	
	public SushexinxiEntity(T t) {
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
	 * 宿舍号
	 */
					
	private String sushehao;
	
	/**
	 * 所在楼
	 */
					
	private String suozailou;
	
	/**
	 * 床位数量
	 */
					
	private String chuangweishuliang;
	
	/**
	 * 值班人
	 */
					
	private String zhibanren;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	
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
	 * 设置：宿舍号
	 */
	public void setSushehao(String sushehao) {
		this.sushehao = sushehao;
	}
	/**
	 * 获取：宿舍号
	 */
	public String getSushehao() {
		return sushehao;
	}
	/**
	 * 设置：所在楼
	 */
	public void setSuozailou(String suozailou) {
		this.suozailou = suozailou;
	}
	/**
	 * 获取：所在楼
	 */
	public String getSuozailou() {
		return suozailou;
	}
	/**
	 * 设置：床位数量
	 */
	public void setChuangweishuliang(String chuangweishuliang) {
		this.chuangweishuliang = chuangweishuliang;
	}
	/**
	 * 获取：床位数量
	 */
	public String getChuangweishuliang() {
		return chuangweishuliang;
	}
	/**
	 * 设置：值班人
	 */
	public void setZhibanren(String zhibanren) {
		this.zhibanren = zhibanren;
	}
	/**
	 * 获取：值班人
	 */
	public String getZhibanren() {
		return zhibanren;
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

}
