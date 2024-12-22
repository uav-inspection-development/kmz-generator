package com.cleaner.djuav.service;

import com.cleaner.djuav.domain.UavRouteReq;
import org.springframework.web.multipart.MultipartFile;

public interface UavRouteService {

    /**
     * 编辑kmz文件
     */
    void updateKmz(UavRouteReq uavRouteReq);

    /**
     * 生成kmz文件(带航点)
     */
    void buildKmz(UavRouteReq uavRouteReq);
}
