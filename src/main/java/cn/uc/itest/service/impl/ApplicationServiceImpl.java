package cn.uc.itest.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import cn.uc.itest.dao.ApplicationMapper;
import cn.uc.itest.model.Application;
import cn.uc.itest.service.ApplicationService;

@Service
public class ApplicationServiceImpl implements ApplicationService {
    @Resource
    private ApplicationMapper applicationMapper;

    @Override
    public List<Application> queryApplicationList() {
        return applicationMapper.queryApplicationList();
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationService applicationService = context.getBean(ApplicationService.class);
        List<Application> applicationList = applicationService.queryApplicationList();
        System.out.println(applicationList.size());
    }
}
