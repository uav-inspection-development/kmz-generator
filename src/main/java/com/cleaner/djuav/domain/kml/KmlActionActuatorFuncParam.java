package com.cleaner.djuav.domain.kml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

@Data
@XStreamAlias("wpml:actionActuatorFuncParam")
public class KmlActionActuatorFuncParam {

    // gimbalRotate

    @XStreamAlias("wpml:gimbalHeadingYawBase")
    private String gimbalHeadingYawBase;

    @XStreamAlias("wpml:gimbalRotateMode")
    private String gimbalRotateMode;

    @XStreamAlias("wpml:gimbalPitchRotateEnable")
    private String gimbalPitchRotateEnable;

    @XStreamAlias("wpml:gimbalPitchRotateAngle")
    private String gimbalPitchRotateAngle;

    @XStreamAlias("wpml:gimbalRollRotateEnable")
    private String gimbalRollRotateEnable;

    @XStreamAlias("wpml:gimbalRollRotateAngle")
    private String gimbalRollRotateAngle;

    @XStreamAlias("wpml:gimbalYawRotateEnable")
    private String gimbalYawRotateEnable;

    @XStreamAlias("wpml:gimbalYawRotateAngle")
    private String gimbalYawRotateAngle;

    @XStreamAlias("wpml:gimbalRotateTimeEnable")
    private String gimbalRotateTimeEnable;

    @XStreamAlias("wpml:gimbalRotateTime")
    private String gimbalRotateTime;

    // takePhoto

    @XStreamAlias("wpml:payloadPositionIndex")
    private String payloadPositionIndex;

    @XStreamAlias("wpml:fileSuffix")
    private String fileSuffix;

    @XStreamAlias("wpml:payloadLensIndex")
    private String payloadLensIndex;

    @XStreamAlias("wpml:useGlobalPayloadLensIndex")
    private String useGlobalPayloadLensIndex;


    // rotateYaw

    @XStreamAlias("wpml:aircraftHeading")
    private String aircraftHeading;

    @XStreamAlias("wpml:aircraftPathMode")
    private String aircraftPathMode;

    // hover

    @XStreamAlias("wpml:hoverTime")
    private String hoverTime;

    // zoom

    @XStreamAlias("wpml:focalLength")
    private String focalLength;
}
