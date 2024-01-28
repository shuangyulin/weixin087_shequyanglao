package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghuyiwanchengshixiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonghuyiwanchengshixiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghuyiwanchengshixiangView;


/**
 * 用户已完成事项
 *
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
public interface YonghuyiwanchengshixiangService extends IService<YonghuyiwanchengshixiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghuyiwanchengshixiangVO> selectListVO(Wrapper<YonghuyiwanchengshixiangEntity> wrapper);
   	
   	YonghuyiwanchengshixiangVO selectVO(@Param("ew") Wrapper<YonghuyiwanchengshixiangEntity> wrapper);
   	
   	List<YonghuyiwanchengshixiangView> selectListView(Wrapper<YonghuyiwanchengshixiangEntity> wrapper);
   	
   	YonghuyiwanchengshixiangView selectView(@Param("ew") Wrapper<YonghuyiwanchengshixiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghuyiwanchengshixiangEntity> wrapper);
   	
}

