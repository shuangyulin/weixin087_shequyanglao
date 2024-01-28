package com.dao;

import com.entity.YonghudaibanshixiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghudaibanshixiangVO;
import com.entity.view.YonghudaibanshixiangView;


/**
 * 用户待办事项
 * 
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
public interface YonghudaibanshixiangDao extends BaseMapper<YonghudaibanshixiangEntity> {
	
	List<YonghudaibanshixiangVO> selectListVO(@Param("ew") Wrapper<YonghudaibanshixiangEntity> wrapper);
	
	YonghudaibanshixiangVO selectVO(@Param("ew") Wrapper<YonghudaibanshixiangEntity> wrapper);
	
	List<YonghudaibanshixiangView> selectListView(@Param("ew") Wrapper<YonghudaibanshixiangEntity> wrapper);

	List<YonghudaibanshixiangView> selectListView(Pagination page,@Param("ew") Wrapper<YonghudaibanshixiangEntity> wrapper);
	
	YonghudaibanshixiangView selectView(@Param("ew") Wrapper<YonghudaibanshixiangEntity> wrapper);
	
}
