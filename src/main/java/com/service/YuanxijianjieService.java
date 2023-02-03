package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuanxijianjieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuanxijianjieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuanxijianjieView;


/**
 * 院系简介
 *
 * @author 
 * @email 
 * @date 2022-01-30 17:38:15
 */
public interface YuanxijianjieService extends IService<YuanxijianjieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuanxijianjieVO> selectListVO(Wrapper<YuanxijianjieEntity> wrapper);
   	
   	YuanxijianjieVO selectVO(@Param("ew") Wrapper<YuanxijianjieEntity> wrapper);
   	
   	List<YuanxijianjieView> selectListView(Wrapper<YuanxijianjieEntity> wrapper);
   	
   	YuanxijianjieView selectView(@Param("ew") Wrapper<YuanxijianjieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuanxijianjieEntity> wrapper);
   	

}

