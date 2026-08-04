package io.hlocation.contracts.v1

/**
 * Implementation-independent geographic point used by the public example contract.
 */
data class GeoPoint(
    val latitudeDegrees: Double,
    val longitudeDegrees: Double,
)

/**
 * User-facing description of a location scenario.
 */
data class ScenarioSpec(
    val name: String,
    val points: List<GeoPoint>,
)

/**
 * Coarse public lifecycle state without internal runtime details.
 */
enum class ScenarioPhase {
    INACTIVE,
    ACTIVE,
}

/**
 * Minimal snapshot returned by the public facade.
 */
data class ScenarioSnapshot(
    val phase: ScenarioPhase,
    val scenarioName: String?,
)
