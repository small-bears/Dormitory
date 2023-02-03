package com.entity.vo;

import com.entity.TongzhigonggaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 通知公告
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-01-30 17:38:15
 */
public class TongzhigonggaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 通知类型
	 */
	
	private String tongzhileixing;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 公告内容
	 */
	
	private String gonggaoneirong;
				
	
	/**
	 * 设置：通知类型
	 */
	 
	public void setTongzhileixing(String tongzhileixing) {
		this.tongzhileixing = tongzhileixing;
	}
	
	/**
	 * 获取：通知类型
	 */
	public String getTongzhileixing() {
		return tongzhileixing;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：公告内容
	 */
	 
	public void setGonggaoneirong(String gonggaoneirong) {
		this.gonggaoneirong = gonggaoneirong;
	}
	
	/**
	 * 获取：公告内容
	 */
	public String getGonggaoneirong() {
		return gonggaoneirong;
	}
			
}
