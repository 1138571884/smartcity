package com.iningbo.smartcity.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author wx
 * @date 2019/01/15
 */
@Table(name = "t_device_type")
public class DeviceType {
    /**
     * 设备类型id
     */
    @Id
    @Column(name = "device_type_id")
    private Integer deviceTypeId;

    /**
     * 设备类型名称
     */
    @Column(name = "type_name")
    private String typeName;

    /**
     * 生产商id
     */
    @Column(name = "device_manufacturer_id")
    private Integer deviceManufacturerId;

    /**
     * 生产商名称
     */
    @Column(name = "manufacture_name")
    private String manufactureName;

    /**
     * 传感器数量
     */
    @Column(name = "device_num")
    private Integer deviceNum;

    /**
     * 获取设备类型id
     *
     * @return device_type_id - 设备类型id
     */
    public Integer getDeviceTypeId() {
        return deviceTypeId;
    }

    /**
     * 设置设备类型id
     *
     * @param deviceTypeId 设备类型id
     */
    public void setDeviceTypeId(Integer deviceTypeId) {
        this.deviceTypeId = deviceTypeId;
    }

    /**
     * 获取设备类型名称
     *
     * @return type_name - 设备类型名称
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * 设置设备类型名称
     *
     * @param typeName 设备类型名称
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * 获取生产商id
     *
     * @return device_manufacturer_id - 生产商id
     */
    public Integer getDeviceManufacturerId() {
        return deviceManufacturerId;
    }

    /**
     * 设置生产商id
     *
     * @param deviceManufacturerId 生产商id
     */
    public void setDeviceManufacturerId(Integer deviceManufacturerId) {
        this.deviceManufacturerId = deviceManufacturerId;
    }

    /**
     * 获取生产商名称
     *
     * @return manufacture_name - 生产商名称
     */
    public String getManufactureName() {
        return manufactureName;
    }

    /**
     * 设置生产商名称
     *
     * @param manufactureName 生产商名称
     */
    public void setManufactureName(String manufactureName) {
        this.manufactureName = manufactureName;
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