package com.entity.view;

import com.entity.ChexiaotousuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 撤销投诉
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
@TableName("chexiaotousu")
public class ChexiaotousuView  extends ChexiaotousuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChexiaotousuView(){
	}
 
 	public ChexiaotousuView(ChexiaotousuEntity chexiaotousuEntity){
 	try {
			BeanUtils.copyProperties(this, chexiaotousuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
