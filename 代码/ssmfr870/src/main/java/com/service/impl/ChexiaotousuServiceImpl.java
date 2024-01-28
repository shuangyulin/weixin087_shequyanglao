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


import com.dao.ChexiaotousuDao;
import com.entity.ChexiaotousuEntity;
import com.service.ChexiaotousuService;
import com.entity.vo.ChexiaotousuVO;
import com.entity.view.ChexiaotousuView;

@Service("chexiaotousuService")
public class ChexiaotousuServiceImpl extends ServiceImpl<ChexiaotousuDao, ChexiaotousuEntity> implements ChexiaotousuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChexiaotousuEntity> page = this.selectPage(
                new Query<ChexiaotousuEntity>(params).getPage(),
                new EntityWrapper<ChexiaotousuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChexiaotousuEntity> wrapper) {
		  Page<ChexiaotousuView> page =new Query<ChexiaotousuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChexiaotousuVO> selectListVO(Wrapper<ChexiaotousuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChexiaotousuVO selectVO(Wrapper<ChexiaotousuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChexiaotousuView> selectListView(Wrapper<ChexiaotousuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChexiaotousuView selectView(Wrapper<ChexiaotousuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
