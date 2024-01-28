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

import com.entity.YonghudaibanshixiangEntity;
import com.entity.view.YonghudaibanshixiangView;

import com.service.YonghudaibanshixiangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 用户待办事项
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
@RestController
@RequestMapping("/yonghudaibanshixiang")
public class YonghudaibanshixiangController {
    @Autowired
    private YonghudaibanshixiangService yonghudaibanshixiangService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YonghudaibanshixiangEntity yonghudaibanshixiang, 
		HttpServletRequest request){
    	if(!request.getSession().getAttribute("role").toString().equals("管理员")) {
    		yonghudaibanshixiang.setUserid((Long)request.getSession().getAttribute("userId"));
    	}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			yonghudaibanshixiang.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YonghudaibanshixiangEntity> ew = new EntityWrapper<YonghudaibanshixiangEntity>();
		PageUtils page = yonghudaibanshixiangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yonghudaibanshixiang), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YonghudaibanshixiangEntity yonghudaibanshixiang, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			yonghudaibanshixiang.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YonghudaibanshixiangEntity> ew = new EntityWrapper<YonghudaibanshixiangEntity>();
		PageUtils page = yonghudaibanshixiangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yonghudaibanshixiang), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YonghudaibanshixiangEntity yonghudaibanshixiang){
       	EntityWrapper<YonghudaibanshixiangEntity> ew = new EntityWrapper<YonghudaibanshixiangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yonghudaibanshixiang, "yonghudaibanshixiang")); 
        return R.ok().put("data", yonghudaibanshixiangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YonghudaibanshixiangEntity yonghudaibanshixiang){
        EntityWrapper< YonghudaibanshixiangEntity> ew = new EntityWrapper< YonghudaibanshixiangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yonghudaibanshixiang, "yonghudaibanshixiang")); 
		YonghudaibanshixiangView yonghudaibanshixiangView =  yonghudaibanshixiangService.selectView(ew);
		return R.ok("查询用户待办事项成功").put("data", yonghudaibanshixiangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YonghudaibanshixiangEntity yonghudaibanshixiang = yonghudaibanshixiangService.selectById(id);
        return R.ok().put("data", yonghudaibanshixiang);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YonghudaibanshixiangEntity yonghudaibanshixiang = yonghudaibanshixiangService.selectById(id);
        return R.ok().put("data", yonghudaibanshixiang);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YonghudaibanshixiangEntity yonghudaibanshixiang, HttpServletRequest request){
    	yonghudaibanshixiang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yonghudaibanshixiang);
    	yonghudaibanshixiang.setUserid((Long)request.getSession().getAttribute("userId"));

        yonghudaibanshixiangService.insert(yonghudaibanshixiang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YonghudaibanshixiangEntity yonghudaibanshixiang, HttpServletRequest request){
    	yonghudaibanshixiang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yonghudaibanshixiang);
    	yonghudaibanshixiang.setUserid((Long)request.getSession().getAttribute("userId"));

        yonghudaibanshixiangService.insert(yonghudaibanshixiang);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YonghudaibanshixiangEntity yonghudaibanshixiang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yonghudaibanshixiang);
        yonghudaibanshixiangService.updateById(yonghudaibanshixiang);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yonghudaibanshixiangService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<YonghudaibanshixiangEntity> wrapper = new EntityWrapper<YonghudaibanshixiangEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}
		if(!request.getSession().getAttribute("role").toString().equals("管理员")) {
    		wrapper.eq("userid", (Long)request.getSession().getAttribute("userId"));
    	}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = yonghudaibanshixiangService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
