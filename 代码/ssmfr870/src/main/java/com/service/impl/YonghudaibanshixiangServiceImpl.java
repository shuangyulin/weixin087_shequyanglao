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


import com.dao.YonghudaibanshixiangDao;
import com.entity.YonghudaibanshixiangEntity;
import com.service.YonghudaibanshixiangService;
import com.entity.vo.YonghudaibanshixiangVO;
import com.entity.view.YonghudaibanshixiangView;

@Service("yonghudaibanshixiangService")
public class YonghudaibanshixiangServiceImpl extends ServiceImpl<YonghudaibanshixiangDao, YonghudaibanshixiangEntity> implements YonghudaibanshixiangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghudaibanshixiangEntity> page = this.selectPage(
                new Query<YonghudaibanshixiangEntity>(params).getPage(),
                new EntityWrapper<YonghudaibanshixiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghudaibanshixiangEntity> wrapper) {
		  Page<YonghudaibanshixiangView> page =new Query<YonghudaibanshixiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonghudaibanshixiangVO> selectListVO(Wrapper<YonghudaibanshixiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonghudaibanshixiangVO selectVO(Wrapper<YonghudaibanshixiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonghudaibanshixiangView> selectListView(Wrapper<YonghudaibanshixiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghudaibanshixiangView selectView(Wrapper<YonghudaibanshixiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
