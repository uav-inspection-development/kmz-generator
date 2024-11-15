package com.cleaner.djuav.domain.kml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

@Data
@XStreamAlias("wpml:actionTrigger")
public class KmlActionTrigger {

    @XStreamAlias("wpml:actionTriggerType")
    private String actionTriggerType;

    @XStreamAlias("wpml:actionTriggerParam")
    private String actionTriggerParam;


}
