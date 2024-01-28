package com.dao;

import com.entity.YonghutousuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghutousuVO;
import com.entity.view.YonghutousuView;


/**
 * 用户投诉
 * 
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
public interface YonghutousuDao extends BaseMapper<YonghutousuEntity> {
	
	List<YonghutousuVO> selectListVO(@Param("ew") Wrapper<YonghutousuEntity> wrapper);
	
	YonghutousuVO selectVO(@Param("ew") Wrapper<YonghutousuEntity> wrapper);
	
	List<YonghutousuView> selectListView(@Param("ew") Wrapper<YonghutousuEntity> wrapper);

	List<YonghutousuView> selectListView(Pagination page,@Param("ew") Wrapper<YonghutousuEntity> wrapper);
	
	YonghutousuView selectView(@Param("ew") Wrapper<YonghutousuEntity> wrapper);
	
}
