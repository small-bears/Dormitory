package com.entity.vo;

import com.entity.YuanxijianjieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 院系简介
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-01-30 17:38:15
 */
public class YuanxijianjieVO  implements Serializable {
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
