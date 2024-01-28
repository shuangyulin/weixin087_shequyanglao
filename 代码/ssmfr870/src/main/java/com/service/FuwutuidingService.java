package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuwutuidingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FuwutuidingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FuwutuidingView;


/**
 * 服务退订
 *
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
public interface FuwutuidingService extends IService<FuwutuidingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuwutuidingVO> selectListVO(Wrapper<FuwutuidingEntity> wrapper);
   	
   	FuwutuidingVO selectVO(@Param("ew") Wrapper<FuwutuidingEntity> wrapper);
   	
   	List<FuwutuidingView> selectListView(Wrapper<FuwutuidingEntity> wrapper);
   	
   	FuwutuidingView selectView(@Param("ew") Wrapper<FuwutuidingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuwutuidingEntity> wrapper);
   	
}

