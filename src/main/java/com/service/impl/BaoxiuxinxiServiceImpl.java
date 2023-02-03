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


import com.dao.BaoxiuxinxiDao;
import com.entity.BaoxiuxinxiEntity;
import com.service.BaoxiuxinxiService;
import com.entity.vo.BaoxiuxinxiVO;
import com.entity.view.BaoxiuxinxiView;

@Service("baoxiuxinxiService")
public class BaoxiuxinxiServiceImpl extends ServiceImpl<BaoxiuxinxiDao, BaoxiuxinxiEntity> implements BaoxiuxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaoxiuxinxiEntity> page = this.selectPage(
                new Query<BaoxiuxinxiEntity>(params).getPage(),
                new EntityWrapper<BaoxiuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaoxiuxinxiEntity> wrapper) {
		  Page<BaoxiuxinxiView> page =new Query<BaoxiuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaoxiuxinxiVO> selectListVO(Wrapper<BaoxiuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaoxiuxinxiVO selectVO(Wrapper<BaoxiuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaoxiuxinxiView> selectListView(Wrapper<BaoxiuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaoxiuxinxiView selectView(Wrapper<BaoxiuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
