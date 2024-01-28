package com.dao;

import com.entity.ChexiaotousuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChexiaotousuVO;
import com.entity.view.ChexiaotousuView;


/**
 * 撤销投诉
 * 
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
public interface ChexiaotousuDao extends BaseMapper<ChexiaotousuEntity> {
	
	List<ChexiaotousuVO> selectListVO(@Param("ew") Wrapper<ChexiaotousuEntity> wrapper);
	
	ChexiaotousuVO selectVO(@Param("ew") Wrapper<ChexiaotousuEntity> wrapper);
	
	List<ChexiaotousuView> selectListView(@Param("ew") Wrapper<ChexiaotousuEntity> wrapper);

	List<ChexiaotousuView> selectListView(Pagination page,@Param("ew") Wrapper<ChexiaotousuEntity> wrapper);
	
	ChexiaotousuView selectView(@Param("ew") Wrapper<ChexiaotousuEntity> wrapper);
	
}
