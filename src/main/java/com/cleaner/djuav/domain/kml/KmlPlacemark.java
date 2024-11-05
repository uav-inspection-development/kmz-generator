package com.cleaner.djuav.domain.kml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

@Data
@XStreamAlias("Placemark")
public class KmlPlacemark {

    @XStreamAlias("Point")
    private KmlPoint kmlPoint;

    @XStreamAlias("wpml:index")
    private String index;

    @XStreamAlias("wpml:height")
    private String height;

    @XStreamAlias("wpml:ellipsoidHeight")
    private String ellipsoidHeight;

    @XStreamAlias("wpml:useGlobalHeight")
    private String useGlobalHeight;

    @XStreamAlias("wpml:useGlobalSpeed")
    private String useGlobalSpeed;

    @XStreamAlias("wpml:waypointSpeed")
    private String waypointSpeed;

    @XStreamAlias("wpml:useGlobalHeadingParam")
    private String useGlobalHeadingParam;

    @XStreamAlias("wpml:useGlobalTurnParam")
    private String useGlobalTurnParam;

    @XStreamAlias("wpml:useStraightLine")
    private String useStraightLine;

    @XStreamAlias("wpml:isRisky")
    private String isRisky;

    @XStreamAlias("wpml:waypointHeadingParam")
    private KmlWaypointHeadingParam waypointHeadingParam;

    @XStreamAlias("wpml:waypointTurnParam")
    private KmlWaypointTurnParam waypointTurnParam;

    @XStreamAlias("wpml:gimbalPitchAngle")
    private String gimbalPitchAngle;

    @XStreamAlias("wpml:actionGroup")
    private KmlActionGroup actionGroup;

    // 下面 wpml 文件使用
    @XStreamAlias("wpml:executeHeight")
    private String executeHeight;

    @XStreamAlias("wpml:waypointGimbalHeadingParam")
    private KmlWaypointGimbalHeadingParam waypointGimbalHeadingParam ;

}
