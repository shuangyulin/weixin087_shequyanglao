package com.dao;

import com.entity.FuwurenyuandaibanshixiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuwurenyuandaibanshixiangVO;
import com.entity.view.FuwurenyuandaibanshixiangView;


/**
 * 服务人员待办事项
 * 
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
public interface FuwurenyuandaibanshixiangDao extends BaseMapper<FuwurenyuandaibanshixiangEntity> {
	
	List<FuwurenyuandaibanshixiangVO> selectListVO(@Param("ew") Wrapper<FuwurenyuandaibanshixiangEntity> wrapper);
	
	FuwurenyuandaibanshixiangVO selectVO(@Param("ew") Wrapper<FuwurenyuandaibanshixiangEntity> wrapper);
	
	List<FuwurenyuandaibanshixiangView> selectListView(@Param("ew") Wrapper<FuwurenyuandaibanshixiangEntity> wrapper);

	List<FuwurenyuandaibanshixiangView> selectListView(Pagination page,@Param("ew") Wrapper<FuwurenyuandaibanshixiangEntity> wrapper);
	
	FuwurenyuandaibanshixiangView selectView(@Param("ew") Wrapper<FuwurenyuandaibanshixiangEntity> wrapper);
	
}
