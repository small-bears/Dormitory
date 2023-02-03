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


import com.dao.SushelouxinxiDao;
import com.entity.SushelouxinxiEntity;
import com.service.SushelouxinxiService;
import com.entity.vo.SushelouxinxiVO;
import com.entity.view.SushelouxinxiView;

@Service("sushelouxinxiService")
public class SushelouxinxiServiceImpl extends ServiceImpl<SushelouxinxiDao, SushelouxinxiEntity> implements SushelouxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SushelouxinxiEntity> page = this.selectPage(
                new Query<SushelouxinxiEntity>(params).getPage(),
                new EntityWrapper<SushelouxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SushelouxinxiEntity> wrapper) {
		  Page<SushelouxinxiView> page =new Query<SushelouxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SushelouxinxiVO> selectListVO(Wrapper<SushelouxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SushelouxinxiVO selectVO(Wrapper<SushelouxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SushelouxinxiView> selectListView(Wrapper<SushelouxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SushelouxinxiView selectView(Wrapper<SushelouxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
