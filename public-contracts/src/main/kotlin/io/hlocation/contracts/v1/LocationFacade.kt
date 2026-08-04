package io.hlocation.contracts.v1

/**
 * Platform-neutral boundary for applying and clearing a location scenario.
 *
 * This public contract intentionally defines no transport, persistence, platform,
 * or runtime implementation.
 */
interface LocationFacade {
    /** Returns the current coarse-grained public state. */
    fun snapshot(): ScenarioSnapshot

    /** Requests activation of a user-provided scenario. */
    fun activate(spec: ScenarioSpec): Result<ScenarioSnapshot>

    /** Requests deactivation of the current scenario. */
    fun deactivate(): Result<ScenarioSnapshot>
}
