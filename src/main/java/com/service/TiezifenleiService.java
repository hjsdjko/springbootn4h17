package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TiezifenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TiezifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TiezifenleiView;


/**
 * 帖子分类
 *
 * @author 
 * @email 
 * @date 2021-02-06 10:24:23
 */
public interface TiezifenleiService extends IService<TiezifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TiezifenleiVO> selectListVO(Wrapper<TiezifenleiEntity> wrapper);
   	
   	TiezifenleiVO selectVO(@Param("ew") Wrapper<TiezifenleiEntity> wrapper);
   	
   	List<TiezifenleiView> selectListView(Wrapper<TiezifenleiEntity> wrapper);
   	
   	TiezifenleiView selectView(@Param("ew") Wrapper<TiezifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TiezifenleiEntity> wrapper);
   	
}

