package com.iningbo.smartcity.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.iningbo.smartcity.core.Result;
import com.iningbo.smartcity.core.ResultGenerator;
import com.iningbo.smartcity.entity.Application;
import com.iningbo.smartcity.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wx
 * @date 2019/01/15
 * <p>
 * 应用
 */
@RestController
@RequestMapping("/application")
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    @PostMapping("/add")
    public Result add(@RequestBody Application application) {
        applicationService.save(application);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        applicationService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(@RequestBody Application application) {
        applicationService.update(application);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Application application = applicationService.findById(id);
        return ResultGenerator.genSuccessResult(application);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Application> list = applicationService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }


}
