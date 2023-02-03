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


import com.dao.BanjixinxiDao;
import com.entity.BanjixinxiEntity;
import com.service.BanjixinxiService;
import com.entity.vo.BanjixinxiVO;
import com.entity.view.BanjixinxiView;

@Service("banjixinxiService")
public class BanjixinxiServiceImpl extends ServiceImpl<BanjixinxiDao, BanjixinxiEntity> implements BanjixinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BanjixinxiEntity> page = this.selectPage(
                new Query<BanjixinxiEntity>(params).getPage(),
                new EntityWrapper<BanjixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BanjixinxiEntity> wrapper) {
		  Page<BanjixinxiView> page =new Query<BanjixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BanjixinxiVO> selectListVO(Wrapper<BanjixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BanjixinxiVO selectVO(Wrapper<BanjixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BanjixinxiView> selectListView(Wrapper<BanjixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BanjixinxiView selectView(Wrapper<BanjixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
