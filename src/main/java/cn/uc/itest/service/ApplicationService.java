package cn.uc.itest.service;

import java.util.List;

import cn.uc.itest.model.Application;

public interface ApplicationService {
    /**
     * 查询应用列表
     * 
     * @return
     */
    public List<Application> queryApplicationList();
    
}
