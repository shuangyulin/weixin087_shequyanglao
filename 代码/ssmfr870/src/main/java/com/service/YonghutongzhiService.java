package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghutongzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonghutongzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghutongzhiView;


/**
 * 用户通知
 *
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
public interface YonghutongzhiService extends IService<YonghutongzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghutongzhiVO> selectListVO(Wrapper<YonghutongzhiEntity> wrapper);
   	
   	YonghutongzhiVO selectVO(@Param("ew") Wrapper<YonghutongzhiEntity> wrapper);
   	
   	List<YonghutongzhiView> selectListView(Wrapper<YonghutongzhiEntity> wrapper);
   	
   	YonghutongzhiView selectView(@Param("ew") Wrapper<YonghutongzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghutongzhiEntity> wrapper);
   	
}

