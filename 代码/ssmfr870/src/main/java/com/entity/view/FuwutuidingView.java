package com.entity.view;

import com.entity.FuwutuidingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 服务退订
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
@TableName("fuwutuiding")
public class FuwutuidingView  extends FuwutuidingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FuwutuidingView(){
	}
 
 	public FuwutuidingView(FuwutuidingEntity fuwutuidingEntity){
 	try {
			BeanUtils.copyProperties(this, fuwutuidingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
