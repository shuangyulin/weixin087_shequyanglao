package com.dao;

import com.entity.FuwurenyuanyiwanchengshixiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuwurenyuanyiwanchengshixiangVO;
import com.entity.view.FuwurenyuanyiwanchengshixiangView;


/**
 * 服务人员已完成事项
 * 
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
public interface FuwurenyuanyiwanchengshixiangDao extends BaseMapper<FuwurenyuanyiwanchengshixiangEntity> {
	
	List<FuwurenyuanyiwanchengshixiangVO> selectListVO(@Param("ew") Wrapper<FuwurenyuanyiwanchengshixiangEntity> wrapper);
	
	FuwurenyuanyiwanchengshixiangVO selectVO(@Param("ew") Wrapper<FuwurenyuanyiwanchengshixiangEntity> wrapper);
	
	List<FuwurenyuanyiwanchengshixiangView> selectListView(@Param("ew") Wrapper<FuwurenyuanyiwanchengshixiangEntity> wrapper);

	List<FuwurenyuanyiwanchengshixiangView> selectListView(Pagination page,@Param("ew") Wrapper<FuwurenyuanyiwanchengshixiangEntity> wrapper);
	
	FuwurenyuanyiwanchengshixiangView selectView(@Param("ew") Wrapper<FuwurenyuanyiwanchengshixiangEntity> wrapper);
	
}
