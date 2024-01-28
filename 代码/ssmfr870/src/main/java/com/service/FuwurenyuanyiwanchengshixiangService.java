package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuwurenyuanyiwanchengshixiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FuwurenyuanyiwanchengshixiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FuwurenyuanyiwanchengshixiangView;


/**
 * 服务人员已完成事项
 *
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
public interface FuwurenyuanyiwanchengshixiangService extends IService<FuwurenyuanyiwanchengshixiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuwurenyuanyiwanchengshixiangVO> selectListVO(Wrapper<FuwurenyuanyiwanchengshixiangEntity> wrapper);
   	
   	FuwurenyuanyiwanchengshixiangVO selectVO(@Param("ew") Wrapper<FuwurenyuanyiwanchengshixiangEntity> wrapper);
   	
   	List<FuwurenyuanyiwanchengshixiangView> selectListView(Wrapper<FuwurenyuanyiwanchengshixiangEntity> wrapper);
   	
   	FuwurenyuanyiwanchengshixiangView selectView(@Param("ew") Wrapper<FuwurenyuanyiwanchengshixiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuwurenyuanyiwanchengshixiangEntity> wrapper);
   	
}

