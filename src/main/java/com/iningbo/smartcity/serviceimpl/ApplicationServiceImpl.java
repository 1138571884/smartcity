package com.iningbo.smartcity.serviceimpl;

import com.iningbo.smartcity.core.AbstractService;
import com.iningbo.smartcity.entity.Application;
import com.iningbo.smartcity.mapper.ApplicationMapper;
import com.iningbo.smartcity.service.ApplicationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
* @author wx
* @date 2019/01/15
*/
@Service
public class ApplicationServiceImpl extends AbstractService<Application> implements ApplicationService {
    @Resource
    private ApplicationMapper tApplicationMapper;
}
