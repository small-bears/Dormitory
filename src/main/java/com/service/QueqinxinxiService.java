package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QueqinxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QueqinxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QueqinxinxiView;


/**
 * 缺勤信息
 *
 * @author 
 * @email 
 * @date 2022-01-30 17:38:15
 */
public interface QueqinxinxiService extends IService<QueqinxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QueqinxinxiVO> selectListVO(Wrapper<QueqinxinxiEntity> wrapper);
   	
   	QueqinxinxiVO selectVO(@Param("ew") Wrapper<QueqinxinxiEntity> wrapper);
   	
   	List<QueqinxinxiView> selectListView(Wrapper<QueqinxinxiEntity> wrapper);
   	
   	QueqinxinxiView selectView(@Param("ew") Wrapper<QueqinxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QueqinxinxiEntity> wrapper);
   	

}

