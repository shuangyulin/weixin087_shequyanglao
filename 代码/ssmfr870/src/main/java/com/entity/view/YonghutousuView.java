package com.entity.view;

import com.entity.YonghutousuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 用户投诉
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
@TableName("yonghutousu")
public class YonghutousuView  extends YonghutousuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YonghutousuView(){
	}
 
 	public YonghutousuView(YonghutousuEntity yonghutousuEntity){
 	try {
			BeanUtils.copyProperties(this, yonghutousuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
