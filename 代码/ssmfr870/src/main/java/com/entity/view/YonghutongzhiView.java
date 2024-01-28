package com.entity.view;

import com.entity.YonghutongzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 用户通知
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
@TableName("yonghutongzhi")
public class YonghutongzhiView  extends YonghutongzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YonghutongzhiView(){
	}
 
 	public YonghutongzhiView(YonghutongzhiEntity yonghutongzhiEntity){
 	try {
			BeanUtils.copyProperties(this, yonghutongzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
