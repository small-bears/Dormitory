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


import com.dao.TongzhigonggaoDao;
import com.entity.TongzhigonggaoEntity;
import com.service.TongzhigonggaoService;
import com.entity.vo.TongzhigonggaoVO;
import com.entity.view.TongzhigonggaoView;

@Service("tongzhigonggaoService")
public class TongzhigonggaoServiceImpl extends ServiceImpl<TongzhigonggaoDao, TongzhigonggaoEntity> implements TongzhigonggaoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TongzhigonggaoEntity> page = this.selectPage(
                new Query<TongzhigonggaoEntity>(params).getPage(),
                new EntityWrapper<TongzhigonggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TongzhigonggaoEntity> wrapper) {
		  Page<TongzhigonggaoView> page =new Query<TongzhigonggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TongzhigonggaoVO> selectListVO(Wrapper<TongzhigonggaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TongzhigonggaoVO selectVO(Wrapper<TongzhigonggaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TongzhigonggaoView> selectListView(Wrapper<TongzhigonggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TongzhigonggaoView selectView(Wrapper<TongzhigonggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
