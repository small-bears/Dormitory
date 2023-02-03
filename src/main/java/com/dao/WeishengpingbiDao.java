package com.dao;

import com.entity.WeishengpingbiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WeishengpingbiVO;
import com.entity.view.WeishengpingbiView;


/**
 * 卫生评比
 * 
 * @author 
 * @email 
 * @date 2022-01-30 17:38:15
 */
public interface WeishengpingbiDao extends BaseMapper<WeishengpingbiEntity> {
	
	List<WeishengpingbiVO> selectListVO(@Param("ew") Wrapper<WeishengpingbiEntity> wrapper);
	
	WeishengpingbiVO selectVO(@Param("ew") Wrapper<WeishengpingbiEntity> wrapper);
	
	List<WeishengpingbiView> selectListView(@Param("ew") Wrapper<WeishengpingbiEntity> wrapper);

	List<WeishengpingbiView> selectListView(Pagination page,@Param("ew") Wrapper<WeishengpingbiEntity> wrapper);
	
	WeishengpingbiView selectView(@Param("ew") Wrapper<WeishengpingbiEntity> wrapper);
	

}
