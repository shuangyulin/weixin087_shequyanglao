package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuwuyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FuwuyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FuwuyuyueView;


/**
 * 服务预约
 *
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
public interface FuwuyuyueService extends IService<FuwuyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuwuyuyueVO> selectListVO(Wrapper<FuwuyuyueEntity> wrapper);
   	
   	FuwuyuyueVO selectVO(@Param("ew") Wrapper<FuwuyuyueEntity> wrapper);
   	
   	List<FuwuyuyueView> selectListView(Wrapper<FuwuyuyueEntity> wrapper);
   	
   	FuwuyuyueView selectView(@Param("ew") Wrapper<FuwuyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuwuyuyueEntity> wrapper);
   	
}

