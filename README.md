# HLocation Release

HLocation 的公开加固构建产物与运行时签名验证文件。

- 源码仓库：`heruitr/hlocation`（私有）
- 验证服务仓库：`sparr-sherrya/hlocation-releases@main`
- 当前版本：`0.49.0`（selective profile `0.4.0`）
- Root Key ID：`root-2026-b`
- Root SPKI SHA-256：`f7275c82dbc89f79195fd59f2c622ea3d66c01ed2768f1dc83ea5186ede17a12`

## 文件

- `artifacts/HLocation-v0.49.0-selective.apk`：加固 APK
- `artifacts/HLocation-v0.49.0-selective.integrity.json`：APK 完整性 sidecar
- `trust/`、`distribution/`、`license/`、`metadata/`：运行时签名验证文件
- `SHA256SUMS`：公开文件摘要

APK 需要配合 LSPosed 使用；安装后需重启设备。
