package com.dao;

import com.entity.YuanxijianjieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuanxijianjieVO;
import com.entity.view.YuanxijianjieView;


/**
 * 院系简介
 * 
 * @author 
 * @email 
 * @date 2022-01-30 17:38:15
 */
public interface YuanxijianjieDao extends BaseMapper<YuanxijianjieEntity> {
	
	List<YuanxijianjieVO> selectListVO(@Param("ew") Wrapper<YuanxijianjieEntity> wrapper);
	
	YuanxijianjieVO selectVO(@Param("ew") Wrapper<YuanxijianjieEntity> wrapper);
	
	List<YuanxijianjieView> selectListView(@Param("ew") Wrapper<YuanxijianjieEntity> wrapper);

	List<YuanxijianjieView> selectListView(Pagination page,@Param("ew") Wrapper<YuanxijianjieEntity> wrapper);
	
	YuanxijianjieView selectView(@Param("ew") Wrapper<YuanxijianjieEntity> wrapper);
	

}
