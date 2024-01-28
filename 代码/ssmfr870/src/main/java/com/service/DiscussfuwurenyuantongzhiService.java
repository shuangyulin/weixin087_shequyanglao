package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussfuwurenyuantongzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussfuwurenyuantongzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussfuwurenyuantongzhiView;


/**
 * 服务人员通知评论表
 *
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
public interface DiscussfuwurenyuantongzhiService extends IService<DiscussfuwurenyuantongzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussfuwurenyuantongzhiVO> selectListVO(Wrapper<DiscussfuwurenyuantongzhiEntity> wrapper);
   	
   	DiscussfuwurenyuantongzhiVO selectVO(@Param("ew") Wrapper<DiscussfuwurenyuantongzhiEntity> wrapper);
   	
   	List<DiscussfuwurenyuantongzhiView> selectListView(Wrapper<DiscussfuwurenyuantongzhiEntity> wrapper);
   	
   	DiscussfuwurenyuantongzhiView selectView(@Param("ew") Wrapper<DiscussfuwurenyuantongzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussfuwurenyuantongzhiEntity> wrapper);
   	
}

