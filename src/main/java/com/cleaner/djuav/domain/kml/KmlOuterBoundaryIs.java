package com.cleaner.djuav.domain.kml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

@Data
@XStreamAlias("outerBoundaryIs")
public class KmlOuterBoundaryIs {

    @XStreamAlias("LinearRing")
    private KmlLinearRing linearRing;
}
