package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SushelouxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SushelouxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SushelouxinxiView;


/**
 * 宿舍楼信息
 *
 * @author 
 * @email 
 * @date 2022-01-30 17:38:15
 */
public interface SushelouxinxiService extends IService<SushelouxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SushelouxinxiVO> selectListVO(Wrapper<SushelouxinxiEntity> wrapper);
   	
   	SushelouxinxiVO selectVO(@Param("ew") Wrapper<SushelouxinxiEntity> wrapper);
   	
   	List<SushelouxinxiView> selectListView(Wrapper<SushelouxinxiEntity> wrapper);
   	
   	SushelouxinxiView selectView(@Param("ew") Wrapper<SushelouxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SushelouxinxiEntity> wrapper);
   	

}

