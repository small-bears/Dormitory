package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeishengpingbiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WeishengpingbiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WeishengpingbiView;


/**
 * 卫生评比
 *
 * @author 
 * @email 
 * @date 2022-01-30 17:38:15
 */
public interface WeishengpingbiService extends IService<WeishengpingbiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeishengpingbiVO> selectListVO(Wrapper<WeishengpingbiEntity> wrapper);
   	
   	WeishengpingbiVO selectVO(@Param("ew") Wrapper<WeishengpingbiEntity> wrapper);
   	
   	List<WeishengpingbiView> selectListView(Wrapper<WeishengpingbiEntity> wrapper);
   	
   	WeishengpingbiView selectView(@Param("ew") Wrapper<WeishengpingbiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeishengpingbiEntity> wrapper);
   	

}

