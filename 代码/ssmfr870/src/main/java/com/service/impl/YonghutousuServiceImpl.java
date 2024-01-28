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


import com.dao.YonghutousuDao;
import com.entity.YonghutousuEntity;
import com.service.YonghutousuService;
import com.entity.vo.YonghutousuVO;
import com.entity.view.YonghutousuView;

@Service("yonghutousuService")
public class YonghutousuServiceImpl extends ServiceImpl<YonghutousuDao, YonghutousuEntity> implements YonghutousuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghutousuEntity> page = this.selectPage(
                new Query<YonghutousuEntity>(params).getPage(),
                new EntityWrapper<YonghutousuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghutousuEntity> wrapper) {
		  Page<YonghutousuView> page =new Query<YonghutousuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonghutousuVO> selectListVO(Wrapper<YonghutousuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonghutousuVO selectVO(Wrapper<YonghutousuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonghutousuView> selectListView(Wrapper<YonghutousuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghutousuView selectView(Wrapper<YonghutousuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
