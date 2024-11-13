# Java 生成与解析大疆无人机 KMZ 航线文件
## 目录结构
* file/kmz：存放生成的 KMZ 文件
* domain：XStream 注解的 Java Bean
* enums：航线文件元素标签取值枚举
* util/RouteFileUtils：生成和解析KMZ航线文件的代码都在这个工具类里