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


import com.dao.YonghuyiwanchengshixiangDao;
import com.entity.YonghuyiwanchengshixiangEntity;
import com.service.YonghuyiwanchengshixiangService;
import com.entity.vo.YonghuyiwanchengshixiangVO;
import com.entity.view.YonghuyiwanchengshixiangView;

@Service("yonghuyiwanchengshixiangService")
public class YonghuyiwanchengshixiangServiceImpl extends ServiceImpl<YonghuyiwanchengshixiangDao, YonghuyiwanchengshixiangEntity> implements YonghuyiwanchengshixiangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghuyiwanchengshixiangEntity> page = this.selectPage(
                new Query<YonghuyiwanchengshixiangEntity>(params).getPage(),
                new EntityWrapper<YonghuyiwanchengshixiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghuyiwanchengshixiangEntity> wrapper) {
		  Page<YonghuyiwanchengshixiangView> page =new Query<YonghuyiwanchengshixiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonghuyiwanchengshixiangVO> selectListVO(Wrapper<YonghuyiwanchengshixiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonghuyiwanchengshixiangVO selectVO(Wrapper<YonghuyiwanchengshixiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonghuyiwanchengshixiangView> selectListView(Wrapper<YonghuyiwanchengshixiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghuyiwanchengshixiangView selectView(Wrapper<YonghuyiwanchengshixiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
