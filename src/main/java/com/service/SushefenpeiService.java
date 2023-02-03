package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SushefenpeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SushefenpeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SushefenpeiView;


/**
 * 宿舍分配
 *
 * @author 
 * @email 
 * @date 2022-01-30 17:38:15
 */
public interface SushefenpeiService extends IService<SushefenpeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SushefenpeiVO> selectListVO(Wrapper<SushefenpeiEntity> wrapper);
   	
   	SushefenpeiVO selectVO(@Param("ew") Wrapper<SushefenpeiEntity> wrapper);
   	
   	List<SushefenpeiView> selectListView(Wrapper<SushefenpeiEntity> wrapper);
   	
   	SushefenpeiView selectView(@Param("ew") Wrapper<SushefenpeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SushefenpeiEntity> wrapper);
   	

}

