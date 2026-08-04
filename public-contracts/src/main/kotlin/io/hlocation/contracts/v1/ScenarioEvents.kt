package io.hlocation.contracts.v1

/**
 * Change event describing one public scenario transition.
 */
data class ScenarioChangeEvent(
    val previousPhase: ScenarioPhase,
    val currentPhase: ScenarioPhase,
    val scenarioName: String?,
)

/**
 * Platform-neutral observer for public scenario lifecycle changes.
 */
fun interface ScenarioObserver {
    fun onScenarioChanged(event: ScenarioChangeEvent)
}
