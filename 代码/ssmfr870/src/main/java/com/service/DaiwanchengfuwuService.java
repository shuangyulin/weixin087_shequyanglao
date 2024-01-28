package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DaiwanchengfuwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DaiwanchengfuwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DaiwanchengfuwuView;


/**
 * 待完成服务
 *
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
public interface DaiwanchengfuwuService extends IService<DaiwanchengfuwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DaiwanchengfuwuVO> selectListVO(Wrapper<DaiwanchengfuwuEntity> wrapper);
   	
   	DaiwanchengfuwuVO selectVO(@Param("ew") Wrapper<DaiwanchengfuwuEntity> wrapper);
   	
   	List<DaiwanchengfuwuView> selectListView(Wrapper<DaiwanchengfuwuEntity> wrapper);
   	
   	DaiwanchengfuwuView selectView(@Param("ew") Wrapper<DaiwanchengfuwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DaiwanchengfuwuEntity> wrapper);
   	
}

