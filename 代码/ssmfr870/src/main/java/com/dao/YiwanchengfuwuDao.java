package com.dao;

import com.entity.YiwanchengfuwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YiwanchengfuwuVO;
import com.entity.view.YiwanchengfuwuView;


/**
 * 已完成服务
 * 
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
public interface YiwanchengfuwuDao extends BaseMapper<YiwanchengfuwuEntity> {
	
	List<YiwanchengfuwuVO> selectListVO(@Param("ew") Wrapper<YiwanchengfuwuEntity> wrapper);
	
	YiwanchengfuwuVO selectVO(@Param("ew") Wrapper<YiwanchengfuwuEntity> wrapper);
	
	List<YiwanchengfuwuView> selectListView(@Param("ew") Wrapper<YiwanchengfuwuEntity> wrapper);

	List<YiwanchengfuwuView> selectListView(Pagination page,@Param("ew") Wrapper<YiwanchengfuwuEntity> wrapper);
	
	YiwanchengfuwuView selectView(@Param("ew") Wrapper<YiwanchengfuwuEntity> wrapper);
	
}
