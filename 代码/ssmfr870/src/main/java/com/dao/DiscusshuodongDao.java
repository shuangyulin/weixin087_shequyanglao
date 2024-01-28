package com.dao;

import com.entity.DiscusshuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusshuodongVO;
import com.entity.view.DiscusshuodongView;


/**
 * 活动评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
public interface DiscusshuodongDao extends BaseMapper<DiscusshuodongEntity> {
	
	List<DiscusshuodongVO> selectListVO(@Param("ew") Wrapper<DiscusshuodongEntity> wrapper);
	
	DiscusshuodongVO selectVO(@Param("ew") Wrapper<DiscusshuodongEntity> wrapper);
	
	List<DiscusshuodongView> selectListView(@Param("ew") Wrapper<DiscusshuodongEntity> wrapper);

	List<DiscusshuodongView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusshuodongEntity> wrapper);
	
	DiscusshuodongView selectView(@Param("ew") Wrapper<DiscusshuodongEntity> wrapper);
	
}
