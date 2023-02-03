package com.entity.view;

import com.entity.QueqinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 缺勤信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-01-30 17:38:15
 */
@TableName("queqinxinxi")
public class QueqinxinxiView  extends QueqinxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QueqinxinxiView(){
	}
 
 	public QueqinxinxiView(QueqinxinxiEntity queqinxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, queqinxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
