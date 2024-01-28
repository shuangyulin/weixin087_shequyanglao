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


import com.dao.YonghutongzhiDao;
import com.entity.YonghutongzhiEntity;
import com.service.YonghutongzhiService;
import com.entity.vo.YonghutongzhiVO;
import com.entity.view.YonghutongzhiView;

@Service("yonghutongzhiService")
public class YonghutongzhiServiceImpl extends ServiceImpl<YonghutongzhiDao, YonghutongzhiEntity> implements YonghutongzhiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghutongzhiEntity> page = this.selectPage(
                new Query<YonghutongzhiEntity>(params).getPage(),
                new EntityWrapper<YonghutongzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghutongzhiEntity> wrapper) {
		  Page<YonghutongzhiView> page =new Query<YonghutongzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonghutongzhiVO> selectListVO(Wrapper<YonghutongzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonghutongzhiVO selectVO(Wrapper<YonghutongzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonghutongzhiView> selectListView(Wrapper<YonghutongzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghutongzhiView selectView(Wrapper<YonghutongzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
