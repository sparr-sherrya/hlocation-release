package io.hlocation.contracts.v1

/**
 * Broad movement category used for user-facing scenario descriptions.
 */
enum class MovementClass {
    STATIONARY,
    PEDESTRIAN,
    VEHICLE,
}

/**
 * User-facing movement preference for a scenario.
 */
data class MovementProfile(
    val movementClass: MovementClass,
    val preferredSpeedMetersPerSecond: Double,
)
