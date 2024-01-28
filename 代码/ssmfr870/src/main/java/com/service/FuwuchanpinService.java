package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuwuchanpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FuwuchanpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FuwuchanpinView;


/**
 * 服务产品
 *
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
public interface FuwuchanpinService extends IService<FuwuchanpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuwuchanpinVO> selectListVO(Wrapper<FuwuchanpinEntity> wrapper);
   	
   	FuwuchanpinVO selectVO(@Param("ew") Wrapper<FuwuchanpinEntity> wrapper);
   	
   	List<FuwuchanpinView> selectListView(Wrapper<FuwuchanpinEntity> wrapper);
   	
   	FuwuchanpinView selectView(@Param("ew") Wrapper<FuwuchanpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuwuchanpinEntity> wrapper);
   	
}

