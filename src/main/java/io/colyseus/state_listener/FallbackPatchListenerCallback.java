package io.colyseus.state_listener;

public abstract class FallbackPatchListenerCallback {

    /**
     * Called when a change happens to the room state
     *
     * @param patch data
     */
    public abstract void callback(PatchObject patch);
}
