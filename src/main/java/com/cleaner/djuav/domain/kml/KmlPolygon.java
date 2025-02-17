package com.cleaner.djuav.domain.kml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

@Data
@XStreamAlias("Polygon")
public class KmlPolygon {

    @XStreamAlias("outerBoundaryIs")
    private KmlOuterBoundaryIs outerBoundaryIs;
}
