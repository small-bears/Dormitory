package com.dao;

import com.entity.QueqinxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QueqinxinxiVO;
import com.entity.view.QueqinxinxiView;


/**
 * 缺勤信息
 * 
 * @author 
 * @email 
 * @date 2022-01-30 17:38:15
 */
public interface QueqinxinxiDao extends BaseMapper<QueqinxinxiEntity> {
	
	List<QueqinxinxiVO> selectListVO(@Param("ew") Wrapper<QueqinxinxiEntity> wrapper);
	
	QueqinxinxiVO selectVO(@Param("ew") Wrapper<QueqinxinxiEntity> wrapper);
	
	List<QueqinxinxiView> selectListView(@Param("ew") Wrapper<QueqinxinxiEntity> wrapper);

	List<QueqinxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<QueqinxinxiEntity> wrapper);
	
	QueqinxinxiView selectView(@Param("ew") Wrapper<QueqinxinxiEntity> wrapper);
	

}
