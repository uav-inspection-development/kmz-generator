# Java 生成与解析大疆无人机 KMZ 航线文件
## 目录结构
* file/kmz：存放生成的 KMZ 文件
* domain：XStream 注解的 Java Bean
* enums：航线文件元素标签取值枚举
* util/RouteFileUtils：生成和解析KMZ航线文件的代码都在这个工具类里

# 接口参数
## 生成航线文件
```json
{
    "droneType": 89,
    "payloadType": 81,
    "payloadPosition": 0,
    "imageFormat": "ir,zoom",
    "finishAction": "goHome",
    "globalHeight": 100,
    "autoFlightSpeed": 10,
    "globalWaypointTurnMode": "toPointAndStopWithDiscontinuityCurvature",
    "waypointHeadingMode": "followWayline",
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
## 编辑航线文件
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