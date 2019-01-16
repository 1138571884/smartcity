package com.iningbo.smartcity.serviceimpl;

import com.iningbo.smartcity.core.AbstractService;
import com.iningbo.smartcity.entity.Device;
import com.iningbo.smartcity.mapper.DeviceMapper;
import com.iningbo.smartcity.service.DeviceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
* @author wx
* @date 2019/01/15
*/
@Service
public class DeviceServiceImpl extends AbstractService<Device> implements DeviceService {
    @Resource
    private DeviceMapper tDeviceMapper;
}
