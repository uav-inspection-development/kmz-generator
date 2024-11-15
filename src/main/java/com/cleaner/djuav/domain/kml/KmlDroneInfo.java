package com.cleaner.djuav.domain.kml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

@Data
@XStreamAlias("wpml:droneInfo")
public class KmlDroneInfo {

    @XStreamAlias("wpml:droneEnumValue")
    private String droneEnumValue;

    @XStreamAlias("wpml:droneSubEnumValue")
    private String droneSubEnumValue;

}
