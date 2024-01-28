package com.dao;

import com.entity.FuwuchanpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuwuchanpinVO;
import com.entity.view.FuwuchanpinView;


/**
 * 服务产品
 * 
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
public interface FuwuchanpinDao extends BaseMapper<FuwuchanpinEntity> {
	
	List<FuwuchanpinVO> selectListVO(@Param("ew") Wrapper<FuwuchanpinEntity> wrapper);
	
	FuwuchanpinVO selectVO(@Param("ew") Wrapper<FuwuchanpinEntity> wrapper);
	
	List<FuwuchanpinView> selectListView(@Param("ew") Wrapper<FuwuchanpinEntity> wrapper);

	List<FuwuchanpinView> selectListView(Pagination page,@Param("ew") Wrapper<FuwuchanpinEntity> wrapper);
	
	FuwuchanpinView selectView(@Param("ew") Wrapper<FuwuchanpinEntity> wrapper);
	
}
