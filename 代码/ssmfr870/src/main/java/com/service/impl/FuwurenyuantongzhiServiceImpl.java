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


import com.dao.FuwurenyuantongzhiDao;
import com.entity.FuwurenyuantongzhiEntity;
import com.service.FuwurenyuantongzhiService;
import com.entity.vo.FuwurenyuantongzhiVO;
import com.entity.view.FuwurenyuantongzhiView;

@Service("fuwurenyuantongzhiService")
public class FuwurenyuantongzhiServiceImpl extends ServiceImpl<FuwurenyuantongzhiDao, FuwurenyuantongzhiEntity> implements FuwurenyuantongzhiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FuwurenyuantongzhiEntity> page = this.selectPage(
                new Query<FuwurenyuantongzhiEntity>(params).getPage(),
                new EntityWrapper<FuwurenyuantongzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FuwurenyuantongzhiEntity> wrapper) {
		  Page<FuwurenyuantongzhiView> page =new Query<FuwurenyuantongzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FuwurenyuantongzhiVO> selectListVO(Wrapper<FuwurenyuantongzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FuwurenyuantongzhiVO selectVO(Wrapper<FuwurenyuantongzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FuwurenyuantongzhiView> selectListView(Wrapper<FuwurenyuantongzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FuwurenyuantongzhiView selectView(Wrapper<FuwurenyuantongzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
