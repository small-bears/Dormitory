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


import com.dao.YuanxijianjieDao;
import com.entity.YuanxijianjieEntity;
import com.service.YuanxijianjieService;
import com.entity.vo.YuanxijianjieVO;
import com.entity.view.YuanxijianjieView;

@Service("yuanxijianjieService")
public class YuanxijianjieServiceImpl extends ServiceImpl<YuanxijianjieDao, YuanxijianjieEntity> implements YuanxijianjieService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuanxijianjieEntity> page = this.selectPage(
                new Query<YuanxijianjieEntity>(params).getPage(),
                new EntityWrapper<YuanxijianjieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuanxijianjieEntity> wrapper) {
		  Page<YuanxijianjieView> page =new Query<YuanxijianjieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuanxijianjieVO> selectListVO(Wrapper<YuanxijianjieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuanxijianjieVO selectVO(Wrapper<YuanxijianjieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuanxijianjieView> selectListView(Wrapper<YuanxijianjieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuanxijianjieView selectView(Wrapper<YuanxijianjieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
