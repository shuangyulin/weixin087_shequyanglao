package com.entity.vo;

import com.entity.FuwuchanpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 服务产品
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
public class FuwuchanpinVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 服务类型
	 */
	
	private String fuwuleixing;
		
	/**
	 * 服务介绍
	 */
	
	private String fuwujieshao;
		
	/**
	 * 服务人员
	 */
	
	private String fuwurenyuan;
		
	/**
	 * 服务人员介绍
	 */
	
	private String fuwurenyuanjieshao;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
	/**
	 * 设置：服务类型
	 */
	 
	public void setFuwuleixing(String fuwuleixing) {
		this.fuwuleixing = fuwuleixing;
	}
	
	/**
	 * 获取：服务类型
	 */
	public String getFuwuleixing() {
		return fuwuleixing;
	}
				
	
	/**
	 * 设置：服务介绍
	 */
	 
	public void setFuwujieshao(String fuwujieshao) {
		this.fuwujieshao = fuwujieshao;
	}
	
	/**
	 * 获取：服务介绍
	 */
	public String getFuwujieshao() {
		return fuwujieshao;
	}
				
	
	/**
	 * 设置：服务人员
	 */
	 
	public void setFuwurenyuan(String fuwurenyuan) {
		this.fuwurenyuan = fuwurenyuan;
	}
	
	/**
	 * 获取：服务人员
	 */
	public String getFuwurenyuan() {
		return fuwurenyuan;
	}
				
	
	/**
	 * 设置：服务人员介绍
	 */
	 
	public void setFuwurenyuanjieshao(String fuwurenyuanjieshao) {
		this.fuwurenyuanjieshao = fuwurenyuanjieshao;
	}
	
	/**
	 * 获取：服务人员介绍
	 */
	public String getFuwurenyuanjieshao() {
		return fuwurenyuanjieshao;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
			
}
