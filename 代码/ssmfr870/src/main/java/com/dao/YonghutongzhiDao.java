package com.dao;

import com.entity.YonghutongzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghutongzhiVO;
import com.entity.view.YonghutongzhiView;


/**
 * 用户通知
 * 
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
public interface YonghutongzhiDao extends BaseMapper<YonghutongzhiEntity> {
	
	List<YonghutongzhiVO> selectListVO(@Param("ew") Wrapper<YonghutongzhiEntity> wrapper);
	
	YonghutongzhiVO selectVO(@Param("ew") Wrapper<YonghutongzhiEntity> wrapper);
	
	List<YonghutongzhiView> selectListView(@Param("ew") Wrapper<YonghutongzhiEntity> wrapper);

	List<YonghutongzhiView> selectListView(Pagination page,@Param("ew") Wrapper<YonghutongzhiEntity> wrapper);
	
	YonghutongzhiView selectView(@Param("ew") Wrapper<YonghutongzhiEntity> wrapper);
	
}
