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


import com.dao.SushefenpeiDao;
import com.entity.SushefenpeiEntity;
import com.service.SushefenpeiService;
import com.entity.vo.SushefenpeiVO;
import com.entity.view.SushefenpeiView;

@Service("sushefenpeiService")
public class SushefenpeiServiceImpl extends ServiceImpl<SushefenpeiDao, SushefenpeiEntity> implements SushefenpeiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SushefenpeiEntity> page = this.selectPage(
                new Query<SushefenpeiEntity>(params).getPage(),
                new EntityWrapper<SushefenpeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SushefenpeiEntity> wrapper) {
		  Page<SushefenpeiView> page =new Query<SushefenpeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SushefenpeiVO> selectListVO(Wrapper<SushefenpeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SushefenpeiVO selectVO(Wrapper<SushefenpeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SushefenpeiView> selectListView(Wrapper<SushefenpeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SushefenpeiView selectView(Wrapper<SushefenpeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
