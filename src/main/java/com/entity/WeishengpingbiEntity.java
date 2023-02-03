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
 * 卫生评比
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-01-30 17:38:15
 */
@TableName("weishengpingbi")
public class WeishengpingbiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WeishengpingbiEntity() {
		
	}
	
	public WeishengpingbiEntity(T t) {
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
	 * 寝室号
	 */
					
	private String qinshihao;
	
	/**
	 * 物品摆放
	 */
					
	private String wupinbaifang;
	
	/**
	 * 地面卫生
	 */
					
	private String dimianweisheng;
	
	/**
	 * 床面评分
	 */
					
	private String chuangmianpingfen;
	
	/**
	 * 墙面评分
	 */
					
	private String qiangmianpingfen;
	
	/**
	 * 内务评分
	 */
					
	private String neiwupingfen;
	
	/**
	 * 窗户评分
	 */
					
	private String chuanghupingfen;
	
	/**
	 * 桌凳评分
	 */
					
	private String zhuodengpingfen;
	
	/**
	 * 整体效果
	 */
					
	private String zhengtixiaoguo;
	
	/**
	 * 评选结果
	 */
					
	private String pingxuanjieguo;
	
	/**
	 * 检查日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date jianchariqi;
	
	
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
	 * 设置：寝室号
	 */
	public void setQinshihao(String qinshihao) {
		this.qinshihao = qinshihao;
	}
	/**
	 * 获取：寝室号
	 */
	public String getQinshihao() {
		return qinshihao;
	}
	/**
	 * 设置：物品摆放
	 */
	public void setWupinbaifang(String wupinbaifang) {
		this.wupinbaifang = wupinbaifang;
	}
	/**
	 * 获取：物品摆放
	 */
	public String getWupinbaifang() {
		return wupinbaifang;
	}
	/**
	 * 设置：地面卫生
	 */
	public void setDimianweisheng(String dimianweisheng) {
		this.dimianweisheng = dimianweisheng;
	}
	/**
	 * 获取：地面卫生
	 */
	public String getDimianweisheng() {
		return dimianweisheng;
	}
	/**
	 * 设置：床面评分
	 */
	public void setChuangmianpingfen(String chuangmianpingfen) {
		this.chuangmianpingfen = chuangmianpingfen;
	}
	/**
	 * 获取：床面评分
	 */
	public String getChuangmianpingfen() {
		return chuangmianpingfen;
	}
	/**
	 * 设置：墙面评分
	 */
	public void setQiangmianpingfen(String qiangmianpingfen) {
		this.qiangmianpingfen = qiangmianpingfen;
	}
	/**
	 * 获取：墙面评分
	 */
	public String getQiangmianpingfen() {
		return qiangmianpingfen;
	}
	/**
	 * 设置：内务评分
	 */
	public void setNeiwupingfen(String neiwupingfen) {
		this.neiwupingfen = neiwupingfen;
	}
	/**
	 * 获取：内务评分
	 */
	public String getNeiwupingfen() {
		return neiwupingfen;
	}
	/**
	 * 设置：窗户评分
	 */
	public void setChuanghupingfen(String chuanghupingfen) {
		this.chuanghupingfen = chuanghupingfen;
	}
	/**
	 * 获取：窗户评分
	 */
	public String getChuanghupingfen() {
		return chuanghupingfen;
	}
	/**
	 * 设置：桌凳评分
	 */
	public void setZhuodengpingfen(String zhuodengpingfen) {
		this.zhuodengpingfen = zhuodengpingfen;
	}
	/**
	 * 获取：桌凳评分
	 */
	public String getZhuodengpingfen() {
		return zhuodengpingfen;
	}
	/**
	 * 设置：整体效果
	 */
	public void setZhengtixiaoguo(String zhengtixiaoguo) {
		this.zhengtixiaoguo = zhengtixiaoguo;
	}
	/**
	 * 获取：整体效果
	 */
	public String getZhengtixiaoguo() {
		return zhengtixiaoguo;
	}
	/**
	 * 设置：评选结果
	 */
	public void setPingxuanjieguo(String pingxuanjieguo) {
		this.pingxuanjieguo = pingxuanjieguo;
	}
	/**
	 * 获取：评选结果
	 */
	public String getPingxuanjieguo() {
		return pingxuanjieguo;
	}
	/**
	 * 设置：检查日期
	 */
	public void setJianchariqi(Date jianchariqi) {
		this.jianchariqi = jianchariqi;
	}
	/**
	 * 获取：检查日期
	 */
	public Date getJianchariqi() {
		return jianchariqi;
	}

}
