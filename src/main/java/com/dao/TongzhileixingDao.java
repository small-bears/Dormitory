package com.dao;

import com.entity.TongzhileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TongzhileixingVO;
import com.entity.view.TongzhileixingView;


/**
 * 通知类型
 * 
 * @author 
 * @email 
 * @date 2022-01-30 17:38:15
 */
public interface TongzhileixingDao extends BaseMapper<TongzhileixingEntity> {
	
	List<TongzhileixingVO> selectListVO(@Param("ew") Wrapper<TongzhileixingEntity> wrapper);
	
	TongzhileixingVO selectVO(@Param("ew") Wrapper<TongzhileixingEntity> wrapper);
	
	List<TongzhileixingView> selectListView(@Param("ew") Wrapper<TongzhileixingEntity> wrapper);

	List<TongzhileixingView> selectListView(Pagination page,@Param("ew") Wrapper<TongzhileixingEntity> wrapper);
	
	TongzhileixingView selectView(@Param("ew") Wrapper<TongzhileixingEntity> wrapper);
	

}
