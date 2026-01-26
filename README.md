# Content Platform

内容平台项目

## 项目结构

```
content-platform/
├── core/           # 核心模块
├── smart-info/     # 智能信息服务模块
└── pom.xml         # Maven 父工程配置
```

## 技术栈

- Java
- Spring Boot
- Maven

## 构建

```bash
mvn clean install
```

## 运行

```bash
cd smart-info
mvn spring-boot:run
```

## 模块说明

### core
核心模块，提供通用工具类和基础功能

### smart-info
智能信息服务，提供 REST API 接口