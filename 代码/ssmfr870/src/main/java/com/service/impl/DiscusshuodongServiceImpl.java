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


import com.dao.DiscusshuodongDao;
import com.entity.DiscusshuodongEntity;
import com.service.DiscusshuodongService;
import com.entity.vo.DiscusshuodongVO;
import com.entity.view.DiscusshuodongView;

@Service("discusshuodongService")
public class DiscusshuodongServiceImpl extends ServiceImpl<DiscusshuodongDao, DiscusshuodongEntity> implements DiscusshuodongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusshuodongEntity> page = this.selectPage(
                new Query<DiscusshuodongEntity>(params).getPage(),
                new EntityWrapper<DiscusshuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusshuodongEntity> wrapper) {
		  Page<DiscusshuodongView> page =new Query<DiscusshuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusshuodongVO> selectListVO(Wrapper<DiscusshuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusshuodongVO selectVO(Wrapper<DiscusshuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusshuodongView> selectListView(Wrapper<DiscusshuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusshuodongView selectView(Wrapper<DiscusshuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
