package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuwuzhuangtaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FuwuzhuangtaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FuwuzhuangtaiView;


/**
 * 服务状态
 *
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
public interface FuwuzhuangtaiService extends IService<FuwuzhuangtaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuwuzhuangtaiVO> selectListVO(Wrapper<FuwuzhuangtaiEntity> wrapper);
   	
   	FuwuzhuangtaiVO selectVO(@Param("ew") Wrapper<FuwuzhuangtaiEntity> wrapper);
   	
   	List<FuwuzhuangtaiView> selectListView(Wrapper<FuwuzhuangtaiEntity> wrapper);
   	
   	FuwuzhuangtaiView selectView(@Param("ew") Wrapper<FuwuzhuangtaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuwuzhuangtaiEntity> wrapper);
   	
}

