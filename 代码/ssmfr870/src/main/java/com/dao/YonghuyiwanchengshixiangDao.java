package com.dao;

import com.entity.YonghuyiwanchengshixiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghuyiwanchengshixiangVO;
import com.entity.view.YonghuyiwanchengshixiangView;


/**
 * 用户已完成事项
 * 
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
public interface YonghuyiwanchengshixiangDao extends BaseMapper<YonghuyiwanchengshixiangEntity> {
	
	List<YonghuyiwanchengshixiangVO> selectListVO(@Param("ew") Wrapper<YonghuyiwanchengshixiangEntity> wrapper);
	
	YonghuyiwanchengshixiangVO selectVO(@Param("ew") Wrapper<YonghuyiwanchengshixiangEntity> wrapper);
	
	List<YonghuyiwanchengshixiangView> selectListView(@Param("ew") Wrapper<YonghuyiwanchengshixiangEntity> wrapper);

	List<YonghuyiwanchengshixiangView> selectListView(Pagination page,@Param("ew") Wrapper<YonghuyiwanchengshixiangEntity> wrapper);
	
	YonghuyiwanchengshixiangView selectView(@Param("ew") Wrapper<YonghuyiwanchengshixiangEntity> wrapper);
	
}
