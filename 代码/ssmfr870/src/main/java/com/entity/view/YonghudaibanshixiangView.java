package com.entity.view;

import com.entity.YonghudaibanshixiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 用户待办事项
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
@TableName("yonghudaibanshixiang")
public class YonghudaibanshixiangView  extends YonghudaibanshixiangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YonghudaibanshixiangView(){
	}
 
 	public YonghudaibanshixiangView(YonghudaibanshixiangEntity yonghudaibanshixiangEntity){
 	try {
			BeanUtils.copyProperties(this, yonghudaibanshixiangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
