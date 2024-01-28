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


import com.dao.HuodongDao;
import com.entity.HuodongEntity;
import com.service.HuodongService;
import com.entity.vo.HuodongVO;
import com.entity.view.HuodongView;

@Service("huodongService")
public class HuodongServiceImpl extends ServiceImpl<HuodongDao, HuodongEntity> implements HuodongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuodongEntity> page = this.selectPage(
                new Query<HuodongEntity>(params).getPage(),
                new EntityWrapper<HuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuodongEntity> wrapper) {
		  Page<HuodongView> page =new Query<HuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuodongVO> selectListVO(Wrapper<HuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuodongVO selectVO(Wrapper<HuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuodongView> selectListView(Wrapper<HuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuodongView selectView(Wrapper<HuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
