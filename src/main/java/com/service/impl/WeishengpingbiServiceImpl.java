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


import com.dao.WeishengpingbiDao;
import com.entity.WeishengpingbiEntity;
import com.service.WeishengpingbiService;
import com.entity.vo.WeishengpingbiVO;
import com.entity.view.WeishengpingbiView;

@Service("weishengpingbiService")
public class WeishengpingbiServiceImpl extends ServiceImpl<WeishengpingbiDao, WeishengpingbiEntity> implements WeishengpingbiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WeishengpingbiEntity> page = this.selectPage(
                new Query<WeishengpingbiEntity>(params).getPage(),
                new EntityWrapper<WeishengpingbiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WeishengpingbiEntity> wrapper) {
		  Page<WeishengpingbiView> page =new Query<WeishengpingbiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WeishengpingbiVO> selectListVO(Wrapper<WeishengpingbiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WeishengpingbiVO selectVO(Wrapper<WeishengpingbiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WeishengpingbiView> selectListView(Wrapper<WeishengpingbiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WeishengpingbiView selectView(Wrapper<WeishengpingbiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
