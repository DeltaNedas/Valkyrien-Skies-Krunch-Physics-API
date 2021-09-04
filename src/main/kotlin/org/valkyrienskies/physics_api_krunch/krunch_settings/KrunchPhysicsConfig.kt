package org.valkyrienskies.physics_api_krunch.krunch_settings

import org.valkyrienskies.physics_api.PhysicsWorld
import org.valkyrienskies.physics_api_krunch.KrunchPhysicsWorld

class KrunchPhysicsConfig {
    // Number of sub-steps to run for each physics tick
    var subSteps = 40

    /**
     * Applies this configuration to [physicsWorld].
     *
     * Note that [physicsWorld] must be of type [KrunchPhysicsWorld].
     */
    fun applyConfigToPhysicsWorld(physicsWorld: PhysicsWorld) {
        physicsWorld as KrunchPhysicsWorld
        physicsWorld.subSteps = subSteps
    }
}
