package com.dao;

import com.entity.SushefenpeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SushefenpeiVO;
import com.entity.view.SushefenpeiView;


/**
 * 宿舍分配
 * 
 * @author 
 * @email 
 * @date 2022-01-30 17:38:15
 */
public interface SushefenpeiDao extends BaseMapper<SushefenpeiEntity> {
	
	List<SushefenpeiVO> selectListVO(@Param("ew") Wrapper<SushefenpeiEntity> wrapper);
	
	SushefenpeiVO selectVO(@Param("ew") Wrapper<SushefenpeiEntity> wrapper);
	
	List<SushefenpeiView> selectListView(@Param("ew") Wrapper<SushefenpeiEntity> wrapper);

	List<SushefenpeiView> selectListView(Pagination page,@Param("ew") Wrapper<SushefenpeiEntity> wrapper);
	
	SushefenpeiView selectView(@Param("ew") Wrapper<SushefenpeiEntity> wrapper);
	

}
