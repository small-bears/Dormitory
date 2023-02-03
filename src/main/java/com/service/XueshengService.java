package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengView;


/**
 * 学生
 *
 * @author 
 * @email 
 * @date 2022-01-30 17:38:15
 */
public interface XueshengService extends IService<XueshengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengVO> selectListVO(Wrapper<XueshengEntity> wrapper);
   	
   	XueshengVO selectVO(@Param("ew") Wrapper<XueshengEntity> wrapper);
   	
   	List<XueshengView> selectListView(Wrapper<XueshengEntity> wrapper);
   	
   	XueshengView selectView(@Param("ew") Wrapper<XueshengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengEntity> wrapper);
   	

}

