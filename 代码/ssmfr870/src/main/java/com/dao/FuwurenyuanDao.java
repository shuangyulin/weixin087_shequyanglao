package com.dao;

import com.entity.FuwurenyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuwurenyuanVO;
import com.entity.view.FuwurenyuanView;


/**
 * 服务人员
 * 
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
public interface FuwurenyuanDao extends BaseMapper<FuwurenyuanEntity> {
	
	List<FuwurenyuanVO> selectListVO(@Param("ew") Wrapper<FuwurenyuanEntity> wrapper);
	
	FuwurenyuanVO selectVO(@Param("ew") Wrapper<FuwurenyuanEntity> wrapper);
	
	List<FuwurenyuanView> selectListView(@Param("ew") Wrapper<FuwurenyuanEntity> wrapper);

	List<FuwurenyuanView> selectListView(Pagination page,@Param("ew") Wrapper<FuwurenyuanEntity> wrapper);
	
	FuwurenyuanView selectView(@Param("ew") Wrapper<FuwurenyuanEntity> wrapper);
	
}
