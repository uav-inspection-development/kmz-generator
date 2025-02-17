package com.cleaner.djuav.domain.kml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

@Data
@XStreamAlias("LineString")
public class KmlLineString {

    @XStreamAlias("coordinates")
    private String coordinates;

}
