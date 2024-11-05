package com.cleaner.djuav.domain.kml;

import lombok.Data;

/**
 * 航线文件
 */
@Data
public class KmlParams {
    /**
     * 无人机类型
     */
    private Integer droneType;

    /**
     * 无人机子类型
     */
    private Integer subDroneType;

    /**
     * 负载类型
     */
    private Integer payloadType;

    /**
     * 负载挂载位置
     */
    private Integer payloadPosition;

    /**
     * 航点执行高度
     */
    private Double executeHeight;

    /**
     * 航点飞行速度
     */
    private Double autoFlightSpeed;

    /**
     * 图片存储类型
     */
    private String imageFormat;

}

