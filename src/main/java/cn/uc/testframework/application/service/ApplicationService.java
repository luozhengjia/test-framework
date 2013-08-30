package cn.uc.testframework.application.service;

import java.util.List;

import cn.uc.testframework.application.model.Application;

public interface ApplicationService {
    /**
     * 查询应用列表
     * 
     * @return
     */
    public List<Application> queryApplicationList();
    
}
