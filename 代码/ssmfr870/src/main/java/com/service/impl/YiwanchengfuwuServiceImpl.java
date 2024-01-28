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


import com.dao.YiwanchengfuwuDao;
import com.entity.YiwanchengfuwuEntity;
import com.service.YiwanchengfuwuService;
import com.entity.vo.YiwanchengfuwuVO;
import com.entity.view.YiwanchengfuwuView;

@Service("yiwanchengfuwuService")
public class YiwanchengfuwuServiceImpl extends ServiceImpl<YiwanchengfuwuDao, YiwanchengfuwuEntity> implements YiwanchengfuwuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YiwanchengfuwuEntity> page = this.selectPage(
                new Query<YiwanchengfuwuEntity>(params).getPage(),
                new EntityWrapper<YiwanchengfuwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YiwanchengfuwuEntity> wrapper) {
		  Page<YiwanchengfuwuView> page =new Query<YiwanchengfuwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YiwanchengfuwuVO> selectListVO(Wrapper<YiwanchengfuwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YiwanchengfuwuVO selectVO(Wrapper<YiwanchengfuwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YiwanchengfuwuView> selectListView(Wrapper<YiwanchengfuwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YiwanchengfuwuView selectView(Wrapper<YiwanchengfuwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
