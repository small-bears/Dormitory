package com.entity.view;

import com.entity.YuanxijianjieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 院系简介
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-01-30 17:38:15
 */
@TableName("yuanxijianjie")
public class YuanxijianjieView  extends YuanxijianjieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuanxijianjieView(){
	}
 
 	public YuanxijianjieView(YuanxijianjieEntity yuanxijianjieEntity){
 	try {
			BeanUtils.copyProperties(this, yuanxijianjieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
