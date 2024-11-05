package com.cleaner.djuav.domain.kml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

@Data
@XStreamAlias("wpml:waypointTurnParam")
public class KmlWaypointTurnParam {

    @XStreamAlias("wpml:waypointTurnMode")
    private String waypointTurnMode;

    @XStreamAlias("wpml:waypointTurnDampingDist")
    private String waypointTurnDampingDist;

}
