package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.TongzhileixingDao;
import com.entity.TongzhileixingEntity;
import com.service.TongzhileixingService;
import com.entity.vo.TongzhileixingVO;
import com.entity.view.TongzhileixingView;

@Service("tongzhileixingService")
public class TongzhileixingServiceImpl extends ServiceImpl<TongzhileixingDao, TongzhileixingEntity> implements TongzhileixingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TongzhileixingEntity> page = this.selectPage(
                new Query<TongzhileixingEntity>(params).getPage(),
                new EntityWrapper<TongzhileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TongzhileixingEntity> wrapper) {
		  Page<TongzhileixingView> page =new Query<TongzhileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TongzhileixingVO> selectListVO(Wrapper<TongzhileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TongzhileixingVO selectVO(Wrapper<TongzhileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TongzhileixingView> selectListView(Wrapper<TongzhileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TongzhileixingView selectView(Wrapper<TongzhileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
