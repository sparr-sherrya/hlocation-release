package io.hlocation.contracts.v1

/**
 * Persistence boundary for named user scenarios.
 */
interface ScenarioStore {
    /** Persists or replaces one named scenario. */
    fun save(spec: ScenarioSpec)

    /** Returns the stored scenario with the given name, or null when absent. */
    fun load(name: String): ScenarioSpec?

    /** Returns all stored scenario names without guaranteed ordering. */
    fun listNames(): List<String>

    /** Removes one named scenario; returns true when it existed. */
    fun remove(name: String): Boolean
}
