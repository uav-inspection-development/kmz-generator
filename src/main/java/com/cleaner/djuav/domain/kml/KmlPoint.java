package com.cleaner.djuav.domain.kml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

@Data
@XStreamAlias("Point")
public class KmlPoint {

    @XStreamAlias("coordinates")
    private String coordinates;

}
