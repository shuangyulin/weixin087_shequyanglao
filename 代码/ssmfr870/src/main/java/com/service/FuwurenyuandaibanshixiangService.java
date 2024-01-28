package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuwurenyuandaibanshixiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FuwurenyuandaibanshixiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FuwurenyuandaibanshixiangView;


/**
 * 服务人员待办事项
 *
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
public interface FuwurenyuandaibanshixiangService extends IService<FuwurenyuandaibanshixiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuwurenyuandaibanshixiangVO> selectListVO(Wrapper<FuwurenyuandaibanshixiangEntity> wrapper);
   	
   	FuwurenyuandaibanshixiangVO selectVO(@Param("ew") Wrapper<FuwurenyuandaibanshixiangEntity> wrapper);
   	
   	List<FuwurenyuandaibanshixiangView> selectListView(Wrapper<FuwurenyuandaibanshixiangEntity> wrapper);
   	
   	FuwurenyuandaibanshixiangView selectView(@Param("ew") Wrapper<FuwurenyuandaibanshixiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuwurenyuandaibanshixiangEntity> wrapper);
   	
}

