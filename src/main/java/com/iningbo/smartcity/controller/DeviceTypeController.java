package com.iningbo.smartcity.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.iningbo.smartcity.core.Result;
import com.iningbo.smartcity.core.ResultGenerator;
import com.iningbo.smartcity.entity.DeviceType;
import com.iningbo.smartcity.service.DeviceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wx
 * @date 2019/01/15
 * <p>
 * 传感器类型
 */
@RestController
@RequestMapping("/device/type")
public class DeviceTypeController {

    @Autowired
    private DeviceTypeService deviceTypeService;

    @PostMapping("/add")
    public Result add(@RequestBody DeviceType deviceType) {
        deviceTypeService.save(deviceType);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        deviceTypeService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(@RequestBody DeviceType deviceType) {
        deviceTypeService.update(deviceType);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        DeviceType deviceType = deviceTypeService.findById(id);
        return ResultGenerator.genSuccessResult(deviceType);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<DeviceType> list = deviceTypeService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }


}
