package cn.uc.itest.dao;

import java.util.List;

import cn.uc.itest.model.Application;

/**
 * 应用服务接口
 * 
 * @author 罗正加
 * @history 2013-08-25 罗正加 新建
 */
public interface ApplicationMapper {

    public List<Application> queryApplicationList();

}