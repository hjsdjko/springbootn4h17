package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JuhuixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JuhuixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JuhuixinxiView;


/**
 * 聚会信息
 *
 * @author 
 * @email 
 * @date 2021-02-06 10:24:23
 */
public interface JuhuixinxiService extends IService<JuhuixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JuhuixinxiVO> selectListVO(Wrapper<JuhuixinxiEntity> wrapper);
   	
   	JuhuixinxiVO selectVO(@Param("ew") Wrapper<JuhuixinxiEntity> wrapper);
   	
   	List<JuhuixinxiView> selectListView(Wrapper<JuhuixinxiEntity> wrapper);
   	
   	JuhuixinxiView selectView(@Param("ew") Wrapper<JuhuixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JuhuixinxiEntity> wrapper);
   	
}

