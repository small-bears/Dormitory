package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LaifangdengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LaifangdengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LaifangdengjiView;


/**
 * 来访登记
 *
 * @author 
 * @email 
 * @date 2022-01-30 17:38:15
 */
public interface LaifangdengjiService extends IService<LaifangdengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LaifangdengjiVO> selectListVO(Wrapper<LaifangdengjiEntity> wrapper);
   	
   	LaifangdengjiVO selectVO(@Param("ew") Wrapper<LaifangdengjiEntity> wrapper);
   	
   	List<LaifangdengjiView> selectListView(Wrapper<LaifangdengjiEntity> wrapper);
   	
   	LaifangdengjiView selectView(@Param("ew") Wrapper<LaifangdengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LaifangdengjiEntity> wrapper);
   	

}

