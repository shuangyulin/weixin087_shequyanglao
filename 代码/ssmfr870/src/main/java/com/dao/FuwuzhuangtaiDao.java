package com.dao;

import com.entity.FuwuzhuangtaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuwuzhuangtaiVO;
import com.entity.view.FuwuzhuangtaiView;


/**
 * 服务状态
 * 
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
public interface FuwuzhuangtaiDao extends BaseMapper<FuwuzhuangtaiEntity> {
	
	List<FuwuzhuangtaiVO> selectListVO(@Param("ew") Wrapper<FuwuzhuangtaiEntity> wrapper);
	
	FuwuzhuangtaiVO selectVO(@Param("ew") Wrapper<FuwuzhuangtaiEntity> wrapper);
	
	List<FuwuzhuangtaiView> selectListView(@Param("ew") Wrapper<FuwuzhuangtaiEntity> wrapper);

	List<FuwuzhuangtaiView> selectListView(Pagination page,@Param("ew") Wrapper<FuwuzhuangtaiEntity> wrapper);
	
	FuwuzhuangtaiView selectView(@Param("ew") Wrapper<FuwuzhuangtaiEntity> wrapper);
	
}
