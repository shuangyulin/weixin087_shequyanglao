package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghudaibanshixiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonghudaibanshixiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghudaibanshixiangView;


/**
 * 用户待办事项
 *
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
public interface YonghudaibanshixiangService extends IService<YonghudaibanshixiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghudaibanshixiangVO> selectListVO(Wrapper<YonghudaibanshixiangEntity> wrapper);
   	
   	YonghudaibanshixiangVO selectVO(@Param("ew") Wrapper<YonghudaibanshixiangEntity> wrapper);
   	
   	List<YonghudaibanshixiangView> selectListView(Wrapper<YonghudaibanshixiangEntity> wrapper);
   	
   	YonghudaibanshixiangView selectView(@Param("ew") Wrapper<YonghudaibanshixiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghudaibanshixiangEntity> wrapper);
   	
}

