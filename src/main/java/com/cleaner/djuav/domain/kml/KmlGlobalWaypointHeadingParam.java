package com.cleaner.djuav.domain.kml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

@Data
@XStreamAlias("wpml:globalWaypointHeadingParam")
public class KmlGlobalWaypointHeadingParam {

    @XStreamAlias("wpml:waypointHeadingMode")
    private String waypointHeadingMode;

    @XStreamAlias("wpml:waypointHeadingAngle")
    private String waypointHeadingAngle;

    @XStreamAlias("wpml:waypointPoiPoint")
    private String waypointPoiPoint;

    @XStreamAlias("wpml:waypointHeadingPathMode")
    private String waypointHeadingPathMode;

    @XStreamAlias("wpml:waypointHeadingPoiIndex")
    private String waypointHeadingPoiIndex;

}
