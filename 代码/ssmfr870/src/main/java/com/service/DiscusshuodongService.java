package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusshuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusshuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusshuodongView;


/**
 * 活动评论表
 *
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
public interface DiscusshuodongService extends IService<DiscusshuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusshuodongVO> selectListVO(Wrapper<DiscusshuodongEntity> wrapper);
   	
   	DiscusshuodongVO selectVO(@Param("ew") Wrapper<DiscusshuodongEntity> wrapper);
   	
   	List<DiscusshuodongView> selectListView(Wrapper<DiscusshuodongEntity> wrapper);
   	
   	DiscusshuodongView selectView(@Param("ew") Wrapper<DiscusshuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusshuodongEntity> wrapper);
   	
}

