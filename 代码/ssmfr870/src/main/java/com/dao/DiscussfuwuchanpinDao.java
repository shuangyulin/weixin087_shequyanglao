package com.dao;

import com.entity.DiscussfuwuchanpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussfuwuchanpinVO;
import com.entity.view.DiscussfuwuchanpinView;


/**
 * 服务产品评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
public interface DiscussfuwuchanpinDao extends BaseMapper<DiscussfuwuchanpinEntity> {
	
	List<DiscussfuwuchanpinVO> selectListVO(@Param("ew") Wrapper<DiscussfuwuchanpinEntity> wrapper);
	
	DiscussfuwuchanpinVO selectVO(@Param("ew") Wrapper<DiscussfuwuchanpinEntity> wrapper);
	
	List<DiscussfuwuchanpinView> selectListView(@Param("ew") Wrapper<DiscussfuwuchanpinEntity> wrapper);

	List<DiscussfuwuchanpinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussfuwuchanpinEntity> wrapper);
	
	DiscussfuwuchanpinView selectView(@Param("ew") Wrapper<DiscussfuwuchanpinEntity> wrapper);
	
}
