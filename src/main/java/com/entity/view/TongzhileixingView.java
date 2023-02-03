package com.entity.view;

import com.entity.TongzhileixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 通知类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-01-30 17:38:15
 */
@TableName("tongzhileixing")
public class TongzhileixingView  extends TongzhileixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TongzhileixingView(){
	}
 
 	public TongzhileixingView(TongzhileixingEntity tongzhileixingEntity){
 	try {
			BeanUtils.copyProperties(this, tongzhileixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
