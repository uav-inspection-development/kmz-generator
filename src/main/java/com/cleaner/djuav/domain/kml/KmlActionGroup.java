package com.cleaner.djuav.domain.kml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.util.List;

@Data
@XStreamAlias("wpml:actionGroup")
public class KmlActionGroup {

    @XStreamAlias("wpml:actionGroupId")
    private String actionGroupId;

    @XStreamAlias("wpml:actionGroupStartIndex")
    private String actionGroupStartIndex;

    @XStreamAlias("wpml:actionGroupEndIndex")
    private String actionGroupEndIndex;

    @XStreamAlias("wpml:actionGroupMode")
    private String actionGroupMode;

    @XStreamAlias("wpml:actionTrigger")
    private KmlActionTrigger actionTrigger;

    @XStreamAlias("wpml:action")
    private List<KmlAction> action;





}
