package com.entity.view;

import com.entity.JuhuixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 聚会信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-06 10:24:23
 */
@TableName("juhuixinxi")
public class JuhuixinxiView  extends JuhuixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JuhuixinxiView(){
	}
 
 	public JuhuixinxiView(JuhuixinxiEntity juhuixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, juhuixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
