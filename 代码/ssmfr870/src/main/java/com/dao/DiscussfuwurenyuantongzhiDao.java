package com.dao;

import com.entity.DiscussfuwurenyuantongzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussfuwurenyuantongzhiVO;
import com.entity.view.DiscussfuwurenyuantongzhiView;


/**
 * 服务人员通知评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
public interface DiscussfuwurenyuantongzhiDao extends BaseMapper<DiscussfuwurenyuantongzhiEntity> {
	
	List<DiscussfuwurenyuantongzhiVO> selectListVO(@Param("ew") Wrapper<DiscussfuwurenyuantongzhiEntity> wrapper);
	
	DiscussfuwurenyuantongzhiVO selectVO(@Param("ew") Wrapper<DiscussfuwurenyuantongzhiEntity> wrapper);
	
	List<DiscussfuwurenyuantongzhiView> selectListView(@Param("ew") Wrapper<DiscussfuwurenyuantongzhiEntity> wrapper);

	List<DiscussfuwurenyuantongzhiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussfuwurenyuantongzhiEntity> wrapper);
	
	DiscussfuwurenyuantongzhiView selectView(@Param("ew") Wrapper<DiscussfuwurenyuantongzhiEntity> wrapper);
	
}
