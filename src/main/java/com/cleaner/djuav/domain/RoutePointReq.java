package com.cleaner.djuav.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class RoutePointReq implements Serializable {

    /**
     * 航点编号
     */
    private Integer routePointIndex;

    /**
     * 经度
     */
    private Double longitude;

    /**
     * 纬度
     */
    private Double latitude;

    /**
     * 高度
     */
    private Double height;


    /**
     * 航点动作列表
     */
    private List<PointActionReq> actions;

}
