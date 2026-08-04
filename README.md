# HLocation

HLocation 是面向 Android 的位置场景工具。

本仓库是公开分发仓库，不是生产源码仓库。它用于保存：

- 已发布的安装产物与完整性 sidecar；
- 客户端使用的签名验证文件；
- 与生产实现隔离的脱敏公共契约示例。

## 公共契约

`public-contracts/` 只描述通用产品边界，采用独立设计的包名、类型名和方法名。它不复制生产源码，也不与内部模块、进程、协议或安全机制建立一一对应关系。

这些文件可用于了解基础的数据建模与接口抽象，但不是可构建的应用、运行时 SDK 或兼容层。

## Release

可安装产物通过本仓库的 [Releases](https://github.com/sparr-sherrya/hlocation-release/releases) 发布。
