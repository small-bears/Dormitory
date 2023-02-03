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


import com.dao.SushexinxiDao;
import com.entity.SushexinxiEntity;
import com.service.SushexinxiService;
import com.entity.vo.SushexinxiVO;
import com.entity.view.SushexinxiView;

@Service("sushexinxiService")
public class SushexinxiServiceImpl extends ServiceImpl<SushexinxiDao, SushexinxiEntity> implements SushexinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SushexinxiEntity> page = this.selectPage(
                new Query<SushexinxiEntity>(params).getPage(),
                new EntityWrapper<SushexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SushexinxiEntity> wrapper) {
		  Page<SushexinxiView> page =new Query<SushexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SushexinxiVO> selectListVO(Wrapper<SushexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SushexinxiVO selectVO(Wrapper<SushexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SushexinxiView> selectListView(Wrapper<SushexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SushexinxiView selectView(Wrapper<SushexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
