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


import com.dao.FuwuzhuangtaiDao;
import com.entity.FuwuzhuangtaiEntity;
import com.service.FuwuzhuangtaiService;
import com.entity.vo.FuwuzhuangtaiVO;
import com.entity.view.FuwuzhuangtaiView;

@Service("fuwuzhuangtaiService")
public class FuwuzhuangtaiServiceImpl extends ServiceImpl<FuwuzhuangtaiDao, FuwuzhuangtaiEntity> implements FuwuzhuangtaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FuwuzhuangtaiEntity> page = this.selectPage(
                new Query<FuwuzhuangtaiEntity>(params).getPage(),
                new EntityWrapper<FuwuzhuangtaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FuwuzhuangtaiEntity> wrapper) {
		  Page<FuwuzhuangtaiView> page =new Query<FuwuzhuangtaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FuwuzhuangtaiVO> selectListVO(Wrapper<FuwuzhuangtaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FuwuzhuangtaiVO selectVO(Wrapper<FuwuzhuangtaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FuwuzhuangtaiView> selectListView(Wrapper<FuwuzhuangtaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FuwuzhuangtaiView selectView(Wrapper<FuwuzhuangtaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
