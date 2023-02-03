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


import com.dao.SusheguanliyuanDao;
import com.entity.SusheguanliyuanEntity;
import com.service.SusheguanliyuanService;
import com.entity.vo.SusheguanliyuanVO;
import com.entity.view.SusheguanliyuanView;

@Service("susheguanliyuanService")
public class SusheguanliyuanServiceImpl extends ServiceImpl<SusheguanliyuanDao, SusheguanliyuanEntity> implements SusheguanliyuanService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SusheguanliyuanEntity> page = this.selectPage(
                new Query<SusheguanliyuanEntity>(params).getPage(),
                new EntityWrapper<SusheguanliyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SusheguanliyuanEntity> wrapper) {
		  Page<SusheguanliyuanView> page =new Query<SusheguanliyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SusheguanliyuanVO> selectListVO(Wrapper<SusheguanliyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SusheguanliyuanVO selectVO(Wrapper<SusheguanliyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SusheguanliyuanView> selectListView(Wrapper<SusheguanliyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SusheguanliyuanView selectView(Wrapper<SusheguanliyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
