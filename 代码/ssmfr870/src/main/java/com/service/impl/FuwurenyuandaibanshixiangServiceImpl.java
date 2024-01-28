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


import com.dao.FuwurenyuandaibanshixiangDao;
import com.entity.FuwurenyuandaibanshixiangEntity;
import com.service.FuwurenyuandaibanshixiangService;
import com.entity.vo.FuwurenyuandaibanshixiangVO;
import com.entity.view.FuwurenyuandaibanshixiangView;

@Service("fuwurenyuandaibanshixiangService")
public class FuwurenyuandaibanshixiangServiceImpl extends ServiceImpl<FuwurenyuandaibanshixiangDao, FuwurenyuandaibanshixiangEntity> implements FuwurenyuandaibanshixiangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FuwurenyuandaibanshixiangEntity> page = this.selectPage(
                new Query<FuwurenyuandaibanshixiangEntity>(params).getPage(),
                new EntityWrapper<FuwurenyuandaibanshixiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FuwurenyuandaibanshixiangEntity> wrapper) {
		  Page<FuwurenyuandaibanshixiangView> page =new Query<FuwurenyuandaibanshixiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FuwurenyuandaibanshixiangVO> selectListVO(Wrapper<FuwurenyuandaibanshixiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FuwurenyuandaibanshixiangVO selectVO(Wrapper<FuwurenyuandaibanshixiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FuwurenyuandaibanshixiangView> selectListView(Wrapper<FuwurenyuandaibanshixiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FuwurenyuandaibanshixiangView selectView(Wrapper<FuwurenyuandaibanshixiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
