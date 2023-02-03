package com.entity.view;

import com.entity.SushelouxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 宿舍楼信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-01-30 17:38:15
 */
@TableName("sushelouxinxi")
public class SushelouxinxiView  extends SushelouxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SushelouxinxiView(){
	}
 
 	public SushelouxinxiView(SushelouxinxiEntity sushelouxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, sushelouxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
