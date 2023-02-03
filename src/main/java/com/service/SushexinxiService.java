package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SushexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SushexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SushexinxiView;


/**
 * 宿舍信息
 *
 * @author 
 * @email 
 * @date 2022-01-30 17:38:15
 */
public interface SushexinxiService extends IService<SushexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SushexinxiVO> selectListVO(Wrapper<SushexinxiEntity> wrapper);
   	
   	SushexinxiVO selectVO(@Param("ew") Wrapper<SushexinxiEntity> wrapper);
   	
   	List<SushexinxiView> selectListView(Wrapper<SushexinxiEntity> wrapper);
   	
   	SushexinxiView selectView(@Param("ew") Wrapper<SushexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SushexinxiEntity> wrapper);
   	

}

