package com.dao;

import com.entity.FuwutuidingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuwutuidingVO;
import com.entity.view.FuwutuidingView;


/**
 * 服务退订
 * 
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
public interface FuwutuidingDao extends BaseMapper<FuwutuidingEntity> {
	
	List<FuwutuidingVO> selectListVO(@Param("ew") Wrapper<FuwutuidingEntity> wrapper);
	
	FuwutuidingVO selectVO(@Param("ew") Wrapper<FuwutuidingEntity> wrapper);
	
	List<FuwutuidingView> selectListView(@Param("ew") Wrapper<FuwutuidingEntity> wrapper);

	List<FuwutuidingView> selectListView(Pagination page,@Param("ew") Wrapper<FuwutuidingEntity> wrapper);
	
	FuwutuidingView selectView(@Param("ew") Wrapper<FuwutuidingEntity> wrapper);
	
}
