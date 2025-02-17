package com.cleaner.djuav.domain.kml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

@Data
@XStreamAlias("LinearRing")
public class KmlLinearRing {

    @XStreamAlias("coordinates")
    private String coordinates;

}
