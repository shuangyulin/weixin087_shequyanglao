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


import com.dao.DiscussfuwuchanpinDao;
import com.entity.DiscussfuwuchanpinEntity;
import com.service.DiscussfuwuchanpinService;
import com.entity.vo.DiscussfuwuchanpinVO;
import com.entity.view.DiscussfuwuchanpinView;

@Service("discussfuwuchanpinService")
public class DiscussfuwuchanpinServiceImpl extends ServiceImpl<DiscussfuwuchanpinDao, DiscussfuwuchanpinEntity> implements DiscussfuwuchanpinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussfuwuchanpinEntity> page = this.selectPage(
                new Query<DiscussfuwuchanpinEntity>(params).getPage(),
                new EntityWrapper<DiscussfuwuchanpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussfuwuchanpinEntity> wrapper) {
		  Page<DiscussfuwuchanpinView> page =new Query<DiscussfuwuchanpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussfuwuchanpinVO> selectListVO(Wrapper<DiscussfuwuchanpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussfuwuchanpinVO selectVO(Wrapper<DiscussfuwuchanpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussfuwuchanpinView> selectListView(Wrapper<DiscussfuwuchanpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussfuwuchanpinView selectView(Wrapper<DiscussfuwuchanpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
