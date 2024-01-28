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


import com.dao.FuwurenyuanyiwanchengshixiangDao;
import com.entity.FuwurenyuanyiwanchengshixiangEntity;
import com.service.FuwurenyuanyiwanchengshixiangService;
import com.entity.vo.FuwurenyuanyiwanchengshixiangVO;
import com.entity.view.FuwurenyuanyiwanchengshixiangView;

@Service("fuwurenyuanyiwanchengshixiangService")
public class FuwurenyuanyiwanchengshixiangServiceImpl extends ServiceImpl<FuwurenyuanyiwanchengshixiangDao, FuwurenyuanyiwanchengshixiangEntity> implements FuwurenyuanyiwanchengshixiangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FuwurenyuanyiwanchengshixiangEntity> page = this.selectPage(
                new Query<FuwurenyuanyiwanchengshixiangEntity>(params).getPage(),
                new EntityWrapper<FuwurenyuanyiwanchengshixiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FuwurenyuanyiwanchengshixiangEntity> wrapper) {
		  Page<FuwurenyuanyiwanchengshixiangView> page =new Query<FuwurenyuanyiwanchengshixiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FuwurenyuanyiwanchengshixiangVO> selectListVO(Wrapper<FuwurenyuanyiwanchengshixiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FuwurenyuanyiwanchengshixiangVO selectVO(Wrapper<FuwurenyuanyiwanchengshixiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FuwurenyuanyiwanchengshixiangView> selectListView(Wrapper<FuwurenyuanyiwanchengshixiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FuwurenyuanyiwanchengshixiangView selectView(Wrapper<FuwurenyuanyiwanchengshixiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
