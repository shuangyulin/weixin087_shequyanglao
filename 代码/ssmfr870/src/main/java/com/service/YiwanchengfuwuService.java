package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YiwanchengfuwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YiwanchengfuwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YiwanchengfuwuView;


/**
 * 已完成服务
 *
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
public interface YiwanchengfuwuService extends IService<YiwanchengfuwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YiwanchengfuwuVO> selectListVO(Wrapper<YiwanchengfuwuEntity> wrapper);
   	
   	YiwanchengfuwuVO selectVO(@Param("ew") Wrapper<YiwanchengfuwuEntity> wrapper);
   	
   	List<YiwanchengfuwuView> selectListView(Wrapper<YiwanchengfuwuEntity> wrapper);
   	
   	YiwanchengfuwuView selectView(@Param("ew") Wrapper<YiwanchengfuwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YiwanchengfuwuEntity> wrapper);
   	
}

