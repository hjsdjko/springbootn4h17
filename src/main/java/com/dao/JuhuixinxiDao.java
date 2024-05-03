package com.dao;

import com.entity.JuhuixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JuhuixinxiVO;
import com.entity.view.JuhuixinxiView;


/**
 * 聚会信息
 * 
 * @author 
 * @email 
 * @date 2021-02-06 10:24:23
 */
public interface JuhuixinxiDao extends BaseMapper<JuhuixinxiEntity> {
	
	List<JuhuixinxiVO> selectListVO(@Param("ew") Wrapper<JuhuixinxiEntity> wrapper);
	
	JuhuixinxiVO selectVO(@Param("ew") Wrapper<JuhuixinxiEntity> wrapper);
	
	List<JuhuixinxiView> selectListView(@Param("ew") Wrapper<JuhuixinxiEntity> wrapper);

	List<JuhuixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JuhuixinxiEntity> wrapper);
	
	JuhuixinxiView selectView(@Param("ew") Wrapper<JuhuixinxiEntity> wrapper);
	
}
