package com.cleaner.djuav.domain.kml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

@Data
@XStreamAlias("wpml:action")
public class KmlAction {

    @XStreamAlias("wpml:actionId")
    private String actionId;

    @XStreamAlias("wpml:actionActuatorFunc")
    private String actionActuatorFunc;

    @XStreamAlias("wpml:actionActuatorFuncParam")
    private KmlActionActuatorFuncParam actionActuatorFuncParam;


}
