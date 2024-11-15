package com.cleaner.djuav.controller;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.IoUtil;
import cn.hutool.core.util.ObjectUtil;
import com.cleaner.djuav.domain.kml.KmlInfo;
import com.cleaner.djuav.domain.kml.KmlParams;
import com.cleaner.djuav.util.RouteFileUtils;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

import static com.cleaner.djuav.util.RouteFileUtils.parseKml;

@RestController
public class UavRouteController {

    /**
     * 解析kmz文件
     * @param file
     */
    @PostMapping("/parseKmz")
    public void test(@RequestParam("file") MultipartFile file) {
        try (ArchiveInputStream archiveInputStream = new ZipArchiveInputStream(file.getInputStream())) {
            ArchiveEntry entry;
            while (!Objects.isNull(entry = archiveInputStream.getNextEntry())) {
                String name = entry.getName();
                if (name.toLowerCase().endsWith(".kml")) {
                    KmlInfo kmlInfo = RouteFileUtils.parseKml(archiveInputStream);
                    System.out.println("kml = " + kmlInfo);
                } else if (name.toLowerCase().endsWith(".wpml")) {
                    KmlInfo kmlInfo = RouteFileUtils.parseKml(archiveInputStream);
                    System.out.println("wpml = " + kmlInfo);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 生成kmz文件
     * @param args
     */
    public static void main(String[] args) {
        KmlParams kmlParams = new KmlParams();
        kmlParams.setDroneType(89);
        kmlParams.setPayloadType(42);
        kmlParams.setPayloadPosition(0);
        kmlParams.setExecuteHeight(100.0);
        kmlParams.setAutoFlightSpeed(10.0);
        RouteFileUtils.buildKmz("航线kmz文件", kmlParams);
    }
}
