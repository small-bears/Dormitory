package com.dao;

import com.entity.SushelouxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SushelouxinxiVO;
import com.entity.view.SushelouxinxiView;


/**
 * 宿舍楼信息
 * 
 * @author 
 * @email 
 * @date 2022-01-30 17:38:15
 */
public interface SushelouxinxiDao extends BaseMapper<SushelouxinxiEntity> {
	
	List<SushelouxinxiVO> selectListVO(@Param("ew") Wrapper<SushelouxinxiEntity> wrapper);
	
	SushelouxinxiVO selectVO(@Param("ew") Wrapper<SushelouxinxiEntity> wrapper);
	
	List<SushelouxinxiView> selectListView(@Param("ew") Wrapper<SushelouxinxiEntity> wrapper);

	List<SushelouxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<SushelouxinxiEntity> wrapper);
	
	SushelouxinxiView selectView(@Param("ew") Wrapper<SushelouxinxiEntity> wrapper);
	

}
