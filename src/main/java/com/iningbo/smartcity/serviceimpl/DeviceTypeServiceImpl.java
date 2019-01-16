package com.iningbo.smartcity.serviceimpl;

import com.iningbo.smartcity.core.AbstractService;
import com.iningbo.smartcity.entity.DeviceType;
import com.iningbo.smartcity.mapper.DeviceTypeMapper;
import com.iningbo.smartcity.service.DeviceTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
* @author wx
* @date 2019/01/15
*/
@Service
public class DeviceTypeServiceImpl extends AbstractService<DeviceType> implements DeviceTypeService {
    @Resource
    private DeviceTypeMapper tDeviceTypeMapper;
}
