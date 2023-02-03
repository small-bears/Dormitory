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


import com.dao.LaifangdengjiDao;
import com.entity.LaifangdengjiEntity;
import com.service.LaifangdengjiService;
import com.entity.vo.LaifangdengjiVO;
import com.entity.view.LaifangdengjiView;

@Service("laifangdengjiService")
public class LaifangdengjiServiceImpl extends ServiceImpl<LaifangdengjiDao, LaifangdengjiEntity> implements LaifangdengjiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LaifangdengjiEntity> page = this.selectPage(
                new Query<LaifangdengjiEntity>(params).getPage(),
                new EntityWrapper<LaifangdengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LaifangdengjiEntity> wrapper) {
		  Page<LaifangdengjiView> page =new Query<LaifangdengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LaifangdengjiVO> selectListVO(Wrapper<LaifangdengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LaifangdengjiVO selectVO(Wrapper<LaifangdengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LaifangdengjiView> selectListView(Wrapper<LaifangdengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LaifangdengjiView selectView(Wrapper<LaifangdengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
