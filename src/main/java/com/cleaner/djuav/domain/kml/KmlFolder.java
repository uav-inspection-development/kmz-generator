package com.cleaner.djuav.domain.kml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import lombok.Data;

import java.util.List;

@Data
@XStreamAlias("Folder")
public class KmlFolder {
    @XStreamAlias("wpml:templateType")
    private String templateType;

    @XStreamAlias("wpml:templateId")
    private String templateId;

    @XStreamAlias("wpml:waylineCoordinateSysParam")
    private KmlWayLineCoordinateSysParam waylineCoordinateSysParam;

    @XStreamAlias("wpml:autoFlightSpeed")
    private String autoFlightSpeed;

    @XStreamAlias("wpml:globalHeight")
    private String globalHeight;

    @XStreamAlias("wpml:caliFlightEnable")
    private String caliFlightEnable;

    @XStreamAlias("wpml:gimbalPitchMode")
    private String gimbalPitchMode;

    @XStreamAlias("wpml:globalWaypointHeadingParam")
    private KmlGlobalWaypointHeadingParam globalWaypointHeadingParam;

    @XStreamAlias("wpml:globalWaypointTurnMode")
    private String globalWaypointTurnMode;

    @XStreamAlias("wpml:globalUseStraightLine")
    private String globalUseStraightLine;

    @XStreamAlias("wpml:payloadParam")
    private KmlPayloadParam payloadParam;

    @XStreamImplicit(itemFieldName = "Placemark")
    private List<KmlPlacemark> placemarkList;

    // 以下为 wpml 文件使用
    @XStreamAlias("wpml:executeHeightMode")
    private String executeHeightMode;

    @XStreamAlias("wpml:waylineId")
    private String waylineId;

    @XStreamAlias("wpml:distance")
    private String distance;

    @XStreamAlias("wpml:duration")
    private String duration;


}
