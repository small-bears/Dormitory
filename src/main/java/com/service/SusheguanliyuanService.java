package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SusheguanliyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SusheguanliyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SusheguanliyuanView;


/**
 * 宿舍管理员
 *
 * @author 
 * @email 
 * @date 2022-01-30 17:38:15
 */
public interface SusheguanliyuanService extends IService<SusheguanliyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SusheguanliyuanVO> selectListVO(Wrapper<SusheguanliyuanEntity> wrapper);
   	
   	SusheguanliyuanVO selectVO(@Param("ew") Wrapper<SusheguanliyuanEntity> wrapper);
   	
   	List<SusheguanliyuanView> selectListView(Wrapper<SusheguanliyuanEntity> wrapper);
   	
   	SusheguanliyuanView selectView(@Param("ew") Wrapper<SusheguanliyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SusheguanliyuanEntity> wrapper);
   	

}

