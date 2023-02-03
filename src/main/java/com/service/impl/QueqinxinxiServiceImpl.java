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


import com.dao.QueqinxinxiDao;
import com.entity.QueqinxinxiEntity;
import com.service.QueqinxinxiService;
import com.entity.vo.QueqinxinxiVO;
import com.entity.view.QueqinxinxiView;

@Service("queqinxinxiService")
public class QueqinxinxiServiceImpl extends ServiceImpl<QueqinxinxiDao, QueqinxinxiEntity> implements QueqinxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QueqinxinxiEntity> page = this.selectPage(
                new Query<QueqinxinxiEntity>(params).getPage(),
                new EntityWrapper<QueqinxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QueqinxinxiEntity> wrapper) {
		  Page<QueqinxinxiView> page =new Query<QueqinxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QueqinxinxiVO> selectListVO(Wrapper<QueqinxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QueqinxinxiVO selectVO(Wrapper<QueqinxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QueqinxinxiView> selectListView(Wrapper<QueqinxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QueqinxinxiView selectView(Wrapper<QueqinxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
