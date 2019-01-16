package com.iningbo.smartcity.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author wx
 * @date 2019/01/15
 */
@Table(name = "t_device")
public class Device {
    /**
     * 设备id
     */
    @Id
    @Column(name = "device_id")
    private Integer deviceId;

    /**
     * 设备的唯一标识
     */
    @Column(name = "dev_eui")
    private String devEui;

    /**
     * 设备名称
     */
    private String name;

    /**
     * 纬度
     */
    private String lat;

    /**
     * 经度
     */
    private String lon;

    /**
     * 地图位置
     */
    private String address;

    /**
     * 备注
     */
    private String remark;

    /**
     * 设备类型
     */
    @Column(name = "device_type_id")
    private Integer deviceTypeId;

    /**
     * 类型名称
     */
    @Column(name = "type_name")
    private String typeName;

    /**
     * 所属应用
     */
    @Column(name = "application_id")
    private Integer applicationId;

    /**
     * 创建时间
     */
    @Column(name = "created_at")
    private Date createdAt;

    /**
     * 更新时间
     */
    @Column(name = "updated_at")
    private Date updatedAt;

    /**
     * 获取设备id
     *
     * @return device_id - 设备id
     */
    public Integer getDeviceId() {
        return deviceId;
    }

    /**
     * 设置设备id
     *
     * @param deviceId 设备id
     */
    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * 获取设备的唯一标识
     *
     * @return dev_eui - 设备的唯一标识
     */
    public String getDevEui() {
        return devEui;
    }

    /**
     * 设置设备的唯一标识
     *
     * @param devEui 设备的唯一标识
     */
    public void setDevEui(String devEui) {
        this.devEui = devEui;
    }

    /**
     * 获取设备名称
     *
     * @return name - 设备名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置设备名称
     *
     * @param name 设备名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取纬度
     *
     * @return lat - 纬度
     */
    public String getLat() {
        return lat;
    }

    /**
     * 设置纬度
     *
     * @param lat 纬度
     */
    public void setLat(String lat) {
        this.lat = lat;
    }

    /**
     * 获取经度
     *
     * @return lon - 经度
     */
    public String getLon() {
        return lon;
    }

    /**
     * 设置经度
     *
     * @param lon 经度
     */
    public void setLon(String lon) {
        this.lon = lon;
    }

    /**
     * 获取地图位置
     *
     * @return address - 地图位置
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地图位置
     *
     * @param address 地图位置
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取设备类型
     *
     * @return device_type_id - 设备类型
     */
    public Integer getDeviceTypeId() {
        return deviceTypeId;
    }

    /**
     * 设置设备类型
     *
     * @param deviceTypeId 设备类型
     */
    public void setDeviceTypeId(Integer deviceTypeId) {
        this.deviceTypeId = deviceTypeId;
    }

    /**
     * 获取类型名称
     *
     * @return type_name - 类型名称
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * 设置类型名称
     *
     * @param typeName 类型名称
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * 获取所属应用
     *
     * @return application_id - 所属应用
     */
    public Integer getApplicationId() {
        return applicationId;
    }

    /**
     * 设置所属应用
     *
     * @param applicationId 所属应用
     */
    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * 获取创建时间
     *
     * @return created_at - 创建时间
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 设置创建时间
     *
     * @param createdAt 创建时间
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 获取更新时间
     *
     * @return updated_at - 更新时间
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 设置更新时间
     *
     * @param updatedAt 更新时间
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}