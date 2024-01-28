package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChexiaotousuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChexiaotousuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChexiaotousuView;


/**
 * 撤销投诉
 *
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
public interface ChexiaotousuService extends IService<ChexiaotousuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChexiaotousuVO> selectListVO(Wrapper<ChexiaotousuEntity> wrapper);
   	
   	ChexiaotousuVO selectVO(@Param("ew") Wrapper<ChexiaotousuEntity> wrapper);
   	
   	List<ChexiaotousuView> selectListView(Wrapper<ChexiaotousuEntity> wrapper);
   	
   	ChexiaotousuView selectView(@Param("ew") Wrapper<ChexiaotousuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChexiaotousuEntity> wrapper);
   	
}

