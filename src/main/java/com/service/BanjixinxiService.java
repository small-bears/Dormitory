package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BanjixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BanjixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BanjixinxiView;


/**
 * 班级信息
 *
 * @author 
 * @email 
 * @date 2022-01-30 17:38:15
 */
public interface BanjixinxiService extends IService<BanjixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BanjixinxiVO> selectListVO(Wrapper<BanjixinxiEntity> wrapper);
   	
   	BanjixinxiVO selectVO(@Param("ew") Wrapper<BanjixinxiEntity> wrapper);
   	
   	List<BanjixinxiView> selectListView(Wrapper<BanjixinxiEntity> wrapper);
   	
   	BanjixinxiView selectView(@Param("ew") Wrapper<BanjixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BanjixinxiEntity> wrapper);
   	

}

