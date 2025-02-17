package com.cleaner.djuav.domain.kml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

@Data
@XStreamAlias("wpml:overlap")
public class KmlOverlap {

    @XStreamAlias("orthoLidarOverlapH")
    private String orthoLidarOverlapH;

    @XStreamAlias("orthoLidarOverlapW")
    private String orthoLidarOverlapW;

    @XStreamAlias("orthoCameraOverlapH")
    private String orthoCameraOverlapH;

    @XStreamAlias("orthoCameraOverlapW")
    private String orthoCameraOverlapW;

    @XStreamAlias("inclinedLidarOverlapH")
    private String inclinedLidarOverlapH;

    @XStreamAlias("inclinedLidarOverlapW")
    private String inclinedLidarOverlapW;

    @XStreamAlias("inclinedCameraOverlapH")
    private String inclinedCameraOverlapH;

    @XStreamAlias("inclinedCameraOverlapW")
    private String inclinedCameraOverlapW;

}
