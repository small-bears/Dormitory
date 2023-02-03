package com.dao;

import com.entity.SusheguanliyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SusheguanliyuanVO;
import com.entity.view.SusheguanliyuanView;


/**
 * 宿舍管理员
 * 
 * @author 
 * @email 
 * @date 2022-01-30 17:38:15
 */
public interface SusheguanliyuanDao extends BaseMapper<SusheguanliyuanEntity> {
	
	List<SusheguanliyuanVO> selectListVO(@Param("ew") Wrapper<SusheguanliyuanEntity> wrapper);
	
	SusheguanliyuanVO selectVO(@Param("ew") Wrapper<SusheguanliyuanEntity> wrapper);
	
	List<SusheguanliyuanView> selectListView(@Param("ew") Wrapper<SusheguanliyuanEntity> wrapper);

	List<SusheguanliyuanView> selectListView(Pagination page,@Param("ew") Wrapper<SusheguanliyuanEntity> wrapper);
	
	SusheguanliyuanView selectView(@Param("ew") Wrapper<SusheguanliyuanEntity> wrapper);
	

}
