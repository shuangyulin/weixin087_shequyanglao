package com.dao;

import com.entity.DaiwanchengfuwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DaiwanchengfuwuVO;
import com.entity.view.DaiwanchengfuwuView;


/**
 * 待完成服务
 * 
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
public interface DaiwanchengfuwuDao extends BaseMapper<DaiwanchengfuwuEntity> {
	
	List<DaiwanchengfuwuVO> selectListVO(@Param("ew") Wrapper<DaiwanchengfuwuEntity> wrapper);
	
	DaiwanchengfuwuVO selectVO(@Param("ew") Wrapper<DaiwanchengfuwuEntity> wrapper);
	
	List<DaiwanchengfuwuView> selectListView(@Param("ew") Wrapper<DaiwanchengfuwuEntity> wrapper);

	List<DaiwanchengfuwuView> selectListView(Pagination page,@Param("ew") Wrapper<DaiwanchengfuwuEntity> wrapper);
	
	DaiwanchengfuwuView selectView(@Param("ew") Wrapper<DaiwanchengfuwuEntity> wrapper);
	
}
