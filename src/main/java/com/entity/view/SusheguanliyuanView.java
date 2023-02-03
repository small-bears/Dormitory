package com.entity.view;

import com.entity.SusheguanliyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 宿舍管理员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-01-30 17:38:15
 */
@TableName("susheguanliyuan")
public class SusheguanliyuanView  extends SusheguanliyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SusheguanliyuanView(){
	}
 
 	public SusheguanliyuanView(SusheguanliyuanEntity susheguanliyuanEntity){
 	try {
			BeanUtils.copyProperties(this, susheguanliyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
