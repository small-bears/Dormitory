package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TongzhileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TongzhileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TongzhileixingView;


/**
 * 通知类型
 *
 * @author 
 * @email 
 * @date 2022-01-30 17:38:15
 */
public interface TongzhileixingService extends IService<TongzhileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TongzhileixingVO> selectListVO(Wrapper<TongzhileixingEntity> wrapper);
   	
   	TongzhileixingVO selectVO(@Param("ew") Wrapper<TongzhileixingEntity> wrapper);
   	
   	List<TongzhileixingView> selectListView(Wrapper<TongzhileixingEntity> wrapper);
   	
   	TongzhileixingView selectView(@Param("ew") Wrapper<TongzhileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TongzhileixingEntity> wrapper);
   	

}

