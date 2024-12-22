package com.cleaner.djuav.controller;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.IoUtil;
import cn.hutool.core.util.ObjectUtil;
import com.cleaner.djuav.domain.UavRouteReq;
import com.cleaner.djuav.domain.kml.KmlInfo;
import com.cleaner.djuav.domain.kml.KmlParams;
import com.cleaner.djuav.service.UavRouteService;
import com.cleaner.djuav.util.RouteFileUtils;
import jakarta.annotation.Resource;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

import static com.cleaner.djuav.util.RouteFileUtils.parseKml;

@RestController
public class UavRouteController {

    @Resource
    private UavRouteService routeService;

    /**
     * 编辑kmz文件
     */
    @PostMapping("/updateKmz")
    public void updateKmz(@RequestBody UavRouteReq uavRouteReq) {
        routeService.updateKmz(uavRouteReq);
    }

    /**
     * 生成kmz文件
     */
    @PostMapping("/buildKmz")
    public void buildKmz(@RequestBody UavRouteReq uavRouteReq){
        routeService.buildKmz(uavRouteReq);
    }

}
