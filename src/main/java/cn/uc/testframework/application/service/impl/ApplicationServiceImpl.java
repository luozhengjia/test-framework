package cn.uc.testframework.application.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import cn.uc.testframework.application.dao.ApplicationMapper;
import cn.uc.testframework.application.model.Application;
import cn.uc.testframework.application.service.ApplicationService;

@Service
public class ApplicationServiceImpl implements ApplicationService {
    @Autowired
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
