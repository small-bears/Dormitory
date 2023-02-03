package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TongzhigonggaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TongzhigonggaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TongzhigonggaoView;


/**
 * 通知公告
 *
 * @author 
 * @email 
 * @date 2022-01-30 17:38:15
 */
public interface TongzhigonggaoService extends IService<TongzhigonggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TongzhigonggaoVO> selectListVO(Wrapper<TongzhigonggaoEntity> wrapper);
   	
   	TongzhigonggaoVO selectVO(@Param("ew") Wrapper<TongzhigonggaoEntity> wrapper);
   	
   	List<TongzhigonggaoView> selectListView(Wrapper<TongzhigonggaoEntity> wrapper);
   	
   	TongzhigonggaoView selectView(@Param("ew") Wrapper<TongzhigonggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TongzhigonggaoEntity> wrapper);
   	

}

