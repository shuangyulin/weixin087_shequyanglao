package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuodongView;


/**
 * 活动
 *
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
public interface HuodongService extends IService<HuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuodongVO> selectListVO(Wrapper<HuodongEntity> wrapper);
   	
   	HuodongVO selectVO(@Param("ew") Wrapper<HuodongEntity> wrapper);
   	
   	List<HuodongView> selectListView(Wrapper<HuodongEntity> wrapper);
   	
   	HuodongView selectView(@Param("ew") Wrapper<HuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuodongEntity> wrapper);
   	
}

