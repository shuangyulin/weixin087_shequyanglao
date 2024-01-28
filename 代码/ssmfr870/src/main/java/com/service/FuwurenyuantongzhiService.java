package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuwurenyuantongzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FuwurenyuantongzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FuwurenyuantongzhiView;


/**
 * 服务人员通知
 *
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
public interface FuwurenyuantongzhiService extends IService<FuwurenyuantongzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuwurenyuantongzhiVO> selectListVO(Wrapper<FuwurenyuantongzhiEntity> wrapper);
   	
   	FuwurenyuantongzhiVO selectVO(@Param("ew") Wrapper<FuwurenyuantongzhiEntity> wrapper);
   	
   	List<FuwurenyuantongzhiView> selectListView(Wrapper<FuwurenyuantongzhiEntity> wrapper);
   	
   	FuwurenyuantongzhiView selectView(@Param("ew") Wrapper<FuwurenyuantongzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuwurenyuantongzhiEntity> wrapper);
   	
}

