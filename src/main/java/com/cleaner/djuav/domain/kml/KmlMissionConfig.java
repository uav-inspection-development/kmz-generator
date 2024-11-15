package com.cleaner.djuav.domain.kml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

@Data
@XStreamAlias("wpml:missionConfig")
public class KmlMissionConfig {

    @XStreamAlias("wpml:flyToWaylineMode")
    private String flyToWayLineMode;

    @XStreamAlias("wpml:finishAction")
    private String finishAction;

    @XStreamAlias("wpml:exitOnRCLost")
    private String exitOnRCLost;

    @XStreamAlias("wpml:executeRCLostAction")
    private String executeRCLostAction;

    @XStreamAlias("wpml:takeOffSecurityHeight")
    private String takeOffSecurityHeight;

    @XStreamAlias("wpml:globalTransitionalSpeed")
    private String globalTransitionalSpeed;

    @XStreamAlias("wpml:globalRTHHeight")
    private String globalRTHHeight;

    @XStreamAlias("wpml:takeOffRefPoint")
    private String takeOffRefPoint;

    @XStreamAlias("wpml:takeOffRefPointAGLHeight")
    private String takeOffRefPointAGLHeight;

    @XStreamAlias("wpml:droneInfo")
    private KmlDroneInfo droneInfo;

    @XStreamAlias("wpml:payloadInfo")
    private KmlPayloadInfo payloadInfo;

}
