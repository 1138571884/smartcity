package com.iningbo.smartcity.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author wx
 * @date 2019/01/15
 */
@Table(name = "t_application")
public class Application {
    /**
     * 应用id
     */
    @Id
    @Column(name = "application_id")
    private Integer applicationId;

    /**
     * 应用名称
     */
    @Column(name = "application_name")
    private String applicationName;

    /**
     * appeui
     */
    @Column(name = "application_eui")
    private String applicationEui;

    /**
     * 传感器数量
     */
    @Column(name = "device_num")
    private Integer deviceNum;

    /**
     * 获取应用id
     *
     * @return application_id - 应用id
     */
    public Integer getApplicationId() {
        return applicationId;
    }

    /**
     * 设置应用id
     *
     * @param applicationId 应用id
     */
    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * 获取应用名称
     *
     * @return application_name - 应用名称
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * 设置应用名称
     *
     * @param applicationName 应用名称
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * 获取appeui
     *
     * @return application_eui - appeui
     */
    public String getApplicationEui() {
        return applicationEui;
    }

    /**
     * 设置appeui
     *
     * @param applicationEui appeui
     */
    public void setApplicationEui(String applicationEui) {
        this.applicationEui = applicationEui;
    }

    /**
     * 获取传感器数量
     *
     * @return device_num - 传感器数量
     */
    public Integer getDeviceNum() {
        return deviceNum;
    }

    /**
     * 设置传感器数量
     *
     * @param deviceNum 传感器数量
     */
    public void setDeviceNum(Integer deviceNum) {
        this.deviceNum = deviceNum;
    }
}