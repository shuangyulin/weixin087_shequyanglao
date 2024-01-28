package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussfuwuchanpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussfuwuchanpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussfuwuchanpinView;


/**
 * 服务产品评论表
 *
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
public interface DiscussfuwuchanpinService extends IService<DiscussfuwuchanpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussfuwuchanpinVO> selectListVO(Wrapper<DiscussfuwuchanpinEntity> wrapper);
   	
   	DiscussfuwuchanpinVO selectVO(@Param("ew") Wrapper<DiscussfuwuchanpinEntity> wrapper);
   	
   	List<DiscussfuwuchanpinView> selectListView(Wrapper<DiscussfuwuchanpinEntity> wrapper);
   	
   	DiscussfuwuchanpinView selectView(@Param("ew") Wrapper<DiscussfuwuchanpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussfuwuchanpinEntity> wrapper);
   	
}

