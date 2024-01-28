package com.dao;

import com.entity.FuwurenyuantongzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuwurenyuantongzhiVO;
import com.entity.view.FuwurenyuantongzhiView;


/**
 * 服务人员通知
 * 
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
public interface FuwurenyuantongzhiDao extends BaseMapper<FuwurenyuantongzhiEntity> {
	
	List<FuwurenyuantongzhiVO> selectListVO(@Param("ew") Wrapper<FuwurenyuantongzhiEntity> wrapper);
	
	FuwurenyuantongzhiVO selectVO(@Param("ew") Wrapper<FuwurenyuantongzhiEntity> wrapper);
	
	List<FuwurenyuantongzhiView> selectListView(@Param("ew") Wrapper<FuwurenyuantongzhiEntity> wrapper);

	List<FuwurenyuantongzhiView> selectListView(Pagination page,@Param("ew") Wrapper<FuwurenyuantongzhiEntity> wrapper);
	
	FuwurenyuantongzhiView selectView(@Param("ew") Wrapper<FuwurenyuantongzhiEntity> wrapper);
	
}
