# Java 生成与解析大疆无人机 KMZ 航线文件

> 如果该项目对你有帮助的话，欢迎点个 star 支持！

## 实现效果
* KMZ 文件结构
![kmz-01.gif](https://s2.loli.net/2024/11/19/kznUqoeSa7CbBAX.gif)

* template.kml 文件内容
![kmz-02.png](https://s2.loli.net/2024/11/19/tDBySCuWoM3mUpf.png)

## 特点
1. 基于大疆发布的最新航线文件格式标准 v1.11.3 版本开发。
2. 可灵活配置参数生成 KMZ 航线文件，导入到 Pilot2 或机场中使用。支持设置航线结束动作、失控动作，航线飞行高度、速度，航点转弯模式、偏航角模式、航点动作等参数。
3. 支持解析 KMZ 航线文件，方便导入和编辑航线。
4. 提供 Demo 代码，代码结构清晰，注释完善，快速上手，方便二次开发。



## 目录结构
* file/kmz：存放生成的 KMZ 文件
* domain/kml：XStream 注解的 Java Bean
* domain/*.Req：前端请求参数对象
* enums：航线文件元素标签取值枚举
* util/RouteFileUtils：生成和解析 KMZ 航线文件的代码都在这个工具类里



## 接口参数示例
### 生成航线 KMZ 文件
```json
{
  "droneType": 89,
  "payloadType": 81,
  "payloadPosition": 0,
  "imageFormat": "ir,zoom",
  "finishAction": "goHome",
  "exitOnRcLostAction": "goBack",
  "globalHeight": 100,
  "autoFlightSpeed": 10,
  "waypointHeadingReq": {
    "waypointHeadingMode": "followWayline"
  },
  "waypointTurnReq": {
    "waypointTurnMode": "toPointAndStopWithDiscontinuityCurvature"
  },
  "gimbalPitchMode": "usePointSetting",
  "routePointList": [
    {
      "routePointIndex": 1,
      "longitude": 123.45,
      "latitude": 34.56,
      "actions": [
        {
          "actionIndex": 1,
          "hoverTime": 10
        },
        {
          "actionIndex": 2,
          "zoom": 20
        }
      ]
    },
    {
      "routePointIndex": 2,
      "longitude": 123.45,
      "latitude": 34.56
    },
    {
      "routePointIndex": 3,
      "longitude": 123.45,
      "latitude": 34.56
    }
  ]
}


```
### 编辑航线 KMZ 文件
```json
{
  "finishAction": "autoLand",
  "exitOnRcLostAction": "landing",
  "routePointList": [
    {
      "routePointIndex": 1,
      "longitude": 123.45,
      "latitude": 34.56,
      "actions": [
        {
          "actionIndex": 1,
          "hoverTime": 10
        },
        {
          "actionIndex": 2,
          "zoom": 20
        }
      ]
    },
    {
      "routePointIndex": 2,
      "longitude": 123.45,
      "latitude": 34.56
    },
    {
      "routePointIndex": 3,
      "longitude": 123.45,
      "latitude": 34.56,
      "actions": [
        {
          "actionIndex": 1,
          "hoverTime": 10
        },
        {
          "actionIndex": 2,
          "zoom": 30
        }
      ]
    }
  ]
}
```

## Star History

[![Star History Chart](https://api.star-history.com/svg?repos=SongJian-99/dj-uav&type=Date)](https://star-history.com/#SongJian-99/dj-uav&Date)