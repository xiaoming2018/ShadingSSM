package com.xiaoming.service.Impl;

import com.xiaoming.dao.MySceneMapper;
import com.xiaoming.model.MyScene;
import com.xiaoming.model.MySceneExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("SceneService")
public class SceneServiceImpl {
    
    @Resource
    private MySceneMapper scenesMapper;

    /**
     * @return scenes 所有场景
     */
    public List<MyScene> getScence(){
        MySceneExample example = new MySceneExample();
        List<MyScene> scenes = scenesMapper.selectByExample(example);
        return scenes;
    }
}
