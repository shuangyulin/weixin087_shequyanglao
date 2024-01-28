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


import com.dao.DiscussfuwurenyuantongzhiDao;
import com.entity.DiscussfuwurenyuantongzhiEntity;
import com.service.DiscussfuwurenyuantongzhiService;
import com.entity.vo.DiscussfuwurenyuantongzhiVO;
import com.entity.view.DiscussfuwurenyuantongzhiView;

@Service("discussfuwurenyuantongzhiService")
public class DiscussfuwurenyuantongzhiServiceImpl extends ServiceImpl<DiscussfuwurenyuantongzhiDao, DiscussfuwurenyuantongzhiEntity> implements DiscussfuwurenyuantongzhiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussfuwurenyuantongzhiEntity> page = this.selectPage(
                new Query<DiscussfuwurenyuantongzhiEntity>(params).getPage(),
                new EntityWrapper<DiscussfuwurenyuantongzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussfuwurenyuantongzhiEntity> wrapper) {
		  Page<DiscussfuwurenyuantongzhiView> page =new Query<DiscussfuwurenyuantongzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussfuwurenyuantongzhiVO> selectListVO(Wrapper<DiscussfuwurenyuantongzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussfuwurenyuantongzhiVO selectVO(Wrapper<DiscussfuwurenyuantongzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussfuwurenyuantongzhiView> selectListView(Wrapper<DiscussfuwurenyuantongzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussfuwurenyuantongzhiView selectView(Wrapper<DiscussfuwurenyuantongzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
