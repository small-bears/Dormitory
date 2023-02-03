package com.entity.model;

import com.entity.YuanxijianjieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 院系简介
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-01-30 17:38:15
 */
public class YuanxijianjieModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 院系简介
	 */
	
	private String yuanxijianjie;
				
	
	/**
	 * 设置：院系简介
	 */
	 
	public void setYuanxijianjie(String yuanxijianjie) {
		this.yuanxijianjie = yuanxijianjie;
	}
	
	/**
	 * 获取：院系简介
	 */
	public String getYuanxijianjie() {
		return yuanxijianjie;
	}
			
}
