package com.entity.view;

import com.entity.BanjixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 班级信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-01-30 17:38:15
 */
@TableName("banjixinxi")
public class BanjixinxiView  extends BanjixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BanjixinxiView(){
	}
 
 	public BanjixinxiView(BanjixinxiEntity banjixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, banjixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
