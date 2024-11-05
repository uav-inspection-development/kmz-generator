package com.cleaner.djuav.domain.kml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

@Data
@XStreamAlias("wpml:waypointGimbalHeadingParam")
public class KmlWaypointGimbalHeadingParam {

    @XStreamAlias("wpml:waypointGimbalPitchAngle")
    private String waypointGimbalPitchAngle;

    @XStreamAlias("wpml:waypointGimbalYawAngle")
    private String waypointGimbalYawAngle;


}
