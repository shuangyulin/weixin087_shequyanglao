package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuwurenyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FuwurenyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FuwurenyuanView;


/**
 * 服务人员
 *
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
public interface FuwurenyuanService extends IService<FuwurenyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuwurenyuanVO> selectListVO(Wrapper<FuwurenyuanEntity> wrapper);
   	
   	FuwurenyuanVO selectVO(@Param("ew") Wrapper<FuwurenyuanEntity> wrapper);
   	
   	List<FuwurenyuanView> selectListView(Wrapper<FuwurenyuanEntity> wrapper);
   	
   	FuwurenyuanView selectView(@Param("ew") Wrapper<FuwurenyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuwurenyuanEntity> wrapper);
   	
}

