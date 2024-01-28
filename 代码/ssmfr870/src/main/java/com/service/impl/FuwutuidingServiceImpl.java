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


import com.dao.FuwutuidingDao;
import com.entity.FuwutuidingEntity;
import com.service.FuwutuidingService;
import com.entity.vo.FuwutuidingVO;
import com.entity.view.FuwutuidingView;

@Service("fuwutuidingService")
public class FuwutuidingServiceImpl extends ServiceImpl<FuwutuidingDao, FuwutuidingEntity> implements FuwutuidingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FuwutuidingEntity> page = this.selectPage(
                new Query<FuwutuidingEntity>(params).getPage(),
                new EntityWrapper<FuwutuidingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FuwutuidingEntity> wrapper) {
		  Page<FuwutuidingView> page =new Query<FuwutuidingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FuwutuidingVO> selectListVO(Wrapper<FuwutuidingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FuwutuidingVO selectVO(Wrapper<FuwutuidingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FuwutuidingView> selectListView(Wrapper<FuwutuidingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FuwutuidingView selectView(Wrapper<FuwutuidingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
