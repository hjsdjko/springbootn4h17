package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JuhuixinxiDao;
import com.entity.JuhuixinxiEntity;
import com.service.JuhuixinxiService;
import com.entity.vo.JuhuixinxiVO;
import com.entity.view.JuhuixinxiView;

@Service("juhuixinxiService")
public class JuhuixinxiServiceImpl extends ServiceImpl<JuhuixinxiDao, JuhuixinxiEntity> implements JuhuixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JuhuixinxiEntity> page = this.selectPage(
                new Query<JuhuixinxiEntity>(params).getPage(),
                new EntityWrapper<JuhuixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JuhuixinxiEntity> wrapper) {
		  Page<JuhuixinxiView> page =new Query<JuhuixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JuhuixinxiVO> selectListVO(Wrapper<JuhuixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JuhuixinxiVO selectVO(Wrapper<JuhuixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JuhuixinxiView> selectListView(Wrapper<JuhuixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JuhuixinxiView selectView(Wrapper<JuhuixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
