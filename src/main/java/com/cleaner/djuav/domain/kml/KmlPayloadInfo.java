package com.cleaner.djuav.domain.kml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

@Data
@XStreamAlias("wpml:payloadInfo")
public class KmlPayloadInfo {
    @XStreamAlias("wpml:payloadEnumValue")
    private String payloadEnumValue;
    @XStreamAlias("wpml:payloadSubEnumValue")
    private String payloadSubEnumValue;
    @XStreamAlias("wpml:payloadPositionIndex")
    private String payloadPositionIndex;

}
