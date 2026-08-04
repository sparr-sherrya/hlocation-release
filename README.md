# HLocation

HLocation 是基于 Android 与 LSPosed 构建的位置和设备环境模拟项目。

## 技术栈

- Kotlin
- Jetpack Compose
- Material 3
- Android NDK / C++
- LSPosed libxposed API 102
- Binder 与 SharedMemory
- Kotlin Coroutines 与 StateFlow
- Room
- Koin
- 高德地图 SDK
- Gradle、AGP、CMake
- GitHub Actions

## 架构

项目采用多模块、分层和多进程架构。

- **应用层**：负责界面、配置、地图、路线和状态管理。
- **领域层**：承载共享模型、坐标规则和业务策略。
- **数据层**：负责配置、环境数据和本地持久化。
- **通信层**：负责不同进程之间的配置和状态同步。
- **系统运行层**：负责系统进程中的位置与运行时能力。
- **目标进程层**：负责应用进程中的位置与设备环境适配。
- **基础设施层**：负责构建、测试、签名、完整性和自动化发布。

各层通过稳定的数据契约解耦，运行配置以版本化快照在多个进程间同步。
