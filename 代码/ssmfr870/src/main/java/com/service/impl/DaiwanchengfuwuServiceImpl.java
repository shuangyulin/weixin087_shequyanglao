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


import com.dao.DaiwanchengfuwuDao;
import com.entity.DaiwanchengfuwuEntity;
import com.service.DaiwanchengfuwuService;
import com.entity.vo.DaiwanchengfuwuVO;
import com.entity.view.DaiwanchengfuwuView;

@Service("daiwanchengfuwuService")
public class DaiwanchengfuwuServiceImpl extends ServiceImpl<DaiwanchengfuwuDao, DaiwanchengfuwuEntity> implements DaiwanchengfuwuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DaiwanchengfuwuEntity> page = this.selectPage(
                new Query<DaiwanchengfuwuEntity>(params).getPage(),
                new EntityWrapper<DaiwanchengfuwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DaiwanchengfuwuEntity> wrapper) {
		  Page<DaiwanchengfuwuView> page =new Query<DaiwanchengfuwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DaiwanchengfuwuVO> selectListVO(Wrapper<DaiwanchengfuwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DaiwanchengfuwuVO selectVO(Wrapper<DaiwanchengfuwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DaiwanchengfuwuView> selectListView(Wrapper<DaiwanchengfuwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DaiwanchengfuwuView selectView(Wrapper<DaiwanchengfuwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
