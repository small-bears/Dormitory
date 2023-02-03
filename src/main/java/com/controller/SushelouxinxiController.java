package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.SushelouxinxiEntity;
import com.entity.view.SushelouxinxiView;

import com.service.SushelouxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 宿舍楼信息
 * 后端接口
 * @author 
 * @email 
 * @date 2022-01-30 17:38:15
 */
@RestController
@RequestMapping("/sushelouxinxi")
public class SushelouxinxiController {
    @Autowired
    private SushelouxinxiService sushelouxinxiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,SushelouxinxiEntity sushelouxinxi, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("susheguanliyuan")) {
			sushelouxinxi.setSuguanzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<SushelouxinxiEntity> ew = new EntityWrapper<SushelouxinxiEntity>();
    	PageUtils page = sushelouxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, sushelouxinxi), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,SushelouxinxiEntity sushelouxinxi, 
		HttpServletRequest request){
        EntityWrapper<SushelouxinxiEntity> ew = new EntityWrapper<SushelouxinxiEntity>();
    	PageUtils page = sushelouxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, sushelouxinxi), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( SushelouxinxiEntity sushelouxinxi){
       	EntityWrapper<SushelouxinxiEntity> ew = new EntityWrapper<SushelouxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( sushelouxinxi, "sushelouxinxi")); 
        return R.ok().put("data", sushelouxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(SushelouxinxiEntity sushelouxinxi){
        EntityWrapper< SushelouxinxiEntity> ew = new EntityWrapper< SushelouxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( sushelouxinxi, "sushelouxinxi")); 
		SushelouxinxiView sushelouxinxiView =  sushelouxinxiService.selectView(ew);
		return R.ok("查询宿舍楼信息成功").put("data", sushelouxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        SushelouxinxiEntity sushelouxinxi = sushelouxinxiService.selectById(id);
        return R.ok().put("data", sushelouxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        SushelouxinxiEntity sushelouxinxi = sushelouxinxiService.selectById(id);
        return R.ok().put("data", sushelouxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SushelouxinxiEntity sushelouxinxi, HttpServletRequest request){
    	sushelouxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(sushelouxinxi);

        sushelouxinxiService.insert(sushelouxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody SushelouxinxiEntity sushelouxinxi, HttpServletRequest request){
    	sushelouxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(sushelouxinxi);

        sushelouxinxiService.insert(sushelouxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SushelouxinxiEntity sushelouxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(sushelouxinxi);
        sushelouxinxiService.updateById(sushelouxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        sushelouxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<SushelouxinxiEntity> wrapper = new EntityWrapper<SushelouxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("susheguanliyuan")) {
			wrapper.eq("suguanzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = sushelouxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	





}
