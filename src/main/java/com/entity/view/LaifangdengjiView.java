package com.entity.view;

import com.entity.LaifangdengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 来访登记
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-01-30 17:38:15
 */
@TableName("laifangdengji")
public class LaifangdengjiView  extends LaifangdengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LaifangdengjiView(){
	}
 
 	public LaifangdengjiView(LaifangdengjiEntity laifangdengjiEntity){
 	try {
			BeanUtils.copyProperties(this, laifangdengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
