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


import com.dao.FuwurenyuanDao;
import com.entity.FuwurenyuanEntity;
import com.service.FuwurenyuanService;
import com.entity.vo.FuwurenyuanVO;
import com.entity.view.FuwurenyuanView;

@Service("fuwurenyuanService")
public class FuwurenyuanServiceImpl extends ServiceImpl<FuwurenyuanDao, FuwurenyuanEntity> implements FuwurenyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FuwurenyuanEntity> page = this.selectPage(
                new Query<FuwurenyuanEntity>(params).getPage(),
                new EntityWrapper<FuwurenyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FuwurenyuanEntity> wrapper) {
		  Page<FuwurenyuanView> page =new Query<FuwurenyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FuwurenyuanVO> selectListVO(Wrapper<FuwurenyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FuwurenyuanVO selectVO(Wrapper<FuwurenyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FuwurenyuanView> selectListView(Wrapper<FuwurenyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FuwurenyuanView selectView(Wrapper<FuwurenyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
