package io.hlocation.contracts.v1

/**
 * Human-readable validation problem for one scenario value.
 */
data class ScenarioProblem(
    val field: String,
    val message: String,
)

/**
 * Result of validating one scenario description.
 */
data class ScenarioValidation(
    val problems: List<ScenarioProblem>,
) {
    val isValid: Boolean
        get() = problems.isEmpty()
}

/**
 * Stateless geographic and naming rules for scenario inputs.
 */
object ScenarioRules {

    private const val MAX_SCENARIO_NAME_LENGTH = 64
    private const val MAX_SCENARIO_POINTS = 256

    /** Returns every validation problem for the given scenario. */
    fun validate(spec: ScenarioSpec): ScenarioValidation {
        val problems = mutableListOf<ScenarioProblem>()
        if (spec.name.isBlank()) {
            problems += ScenarioProblem("name", "Scenario name must not be blank")
        } else if (spec.name.length > MAX_SCENARIO_NAME_LENGTH) {
            problems += ScenarioProblem(
                "name",
                "Scenario name must not exceed $MAX_SCENARIO_NAME_LENGTH characters",
            )
        }
        if (spec.points.isEmpty()) {
            problems += ScenarioProblem("points", "Scenario must contain at least one point")
        } else if (spec.points.size > MAX_SCENARIO_POINTS) {
            problems += ScenarioProblem(
                "points",
                "Scenario must not contain more than $MAX_SCENARIO_POINTS points",
            )
        }
        spec.points.forEachIndexed { index, point ->
            if (!isValidLatitude(point.latitudeDegrees)) {
                problems += ScenarioProblem(
                    "points[$index].latitudeDegrees",
                    "Latitude must be within -90.0 and 90.0",
                )
            }
            if (!isValidLongitude(point.longitudeDegrees)) {
                problems += ScenarioProblem(
                    "points[$index].longitudeDegrees",
                    "Longitude must be within -180.0 and 180.0",
                )
            }
        }
        return ScenarioValidation(problems)
    }

    /** Returns true only for finite latitude values inside the geographic range. */
    fun isValidLatitude(value: Double): Boolean = value in -90.0..90.0

    /** Returns true only for finite longitude values inside the geographic range. */
    fun isValidLongitude(value: Double): Boolean = value in -180.0..180.0
}
