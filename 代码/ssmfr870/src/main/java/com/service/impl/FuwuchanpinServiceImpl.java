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


import com.dao.FuwuchanpinDao;
import com.entity.FuwuchanpinEntity;
import com.service.FuwuchanpinService;
import com.entity.vo.FuwuchanpinVO;
import com.entity.view.FuwuchanpinView;

@Service("fuwuchanpinService")
public class FuwuchanpinServiceImpl extends ServiceImpl<FuwuchanpinDao, FuwuchanpinEntity> implements FuwuchanpinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FuwuchanpinEntity> page = this.selectPage(
                new Query<FuwuchanpinEntity>(params).getPage(),
                new EntityWrapper<FuwuchanpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FuwuchanpinEntity> wrapper) {
		  Page<FuwuchanpinView> page =new Query<FuwuchanpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FuwuchanpinVO> selectListVO(Wrapper<FuwuchanpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FuwuchanpinVO selectVO(Wrapper<FuwuchanpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FuwuchanpinView> selectListView(Wrapper<FuwuchanpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FuwuchanpinView selectView(Wrapper<FuwuchanpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
