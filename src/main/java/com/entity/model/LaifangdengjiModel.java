package com.entity.model;

import com.entity.LaifangdengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 来访登记
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-01-30 17:38:15
 */
public class LaifangdengjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 来访名单
	 */
	
	private String laifangmingdan;
		
	/**
	 * 来访人数
	 */
	
	private String laifangrenshu;
		
	/**
	 * 关系
	 */
	
	private String guanxi;
		
	/**
	 * 来访时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date laifangshijian;
		
	/**
	 * 离开时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date likaishijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：来访名单
	 */
	 
	public void setLaifangmingdan(String laifangmingdan) {
		this.laifangmingdan = laifangmingdan;
	}
	
	/**
	 * 获取：来访名单
	 */
	public String getLaifangmingdan() {
		return laifangmingdan;
	}
				
	
	/**
	 * 设置：来访人数
	 */
	 
	public void setLaifangrenshu(String laifangrenshu) {
		this.laifangrenshu = laifangrenshu;
	}
	
	/**
	 * 获取：来访人数
	 */
	public String getLaifangrenshu() {
		return laifangrenshu;
	}
				
	
	/**
	 * 设置：关系
	 */
	 
	public void setGuanxi(String guanxi) {
		this.guanxi = guanxi;
	}
	
	/**
	 * 获取：关系
	 */
	public String getGuanxi() {
		return guanxi;
	}
				
	
	/**
	 * 设置：来访时间
	 */
	 
	public void setLaifangshijian(Date laifangshijian) {
		this.laifangshijian = laifangshijian;
	}
	
	/**
	 * 获取：来访时间
	 */
	public Date getLaifangshijian() {
		return laifangshijian;
	}
				
	
	/**
	 * 设置：离开时间
	 */
	 
	public void setLikaishijian(Date likaishijian) {
		this.likaishijian = likaishijian;
	}
	
	/**
	 * 获取：离开时间
	 */
	public Date getLikaishijian() {
		return likaishijian;
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
