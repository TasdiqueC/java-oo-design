package com.home_entertainment_system.devices;

import com.home_entertainment_system.devices.interfaces.volume;

/**
 * Created by TasdiqueC on 7/28/17.
 */
public class SurroundSoundSystem extends Device implements volume {
    public SurroundSoundSystem() {
        deviceName = "Surround Sound System";
    }

    public void volume(){
        System.out.println("Turning up the volume...");
        System.out.println("Oops! Too loud! Turning it back down a little bit...");
    }

    @Override
    public void doTasks() {
        volume();
    }
}
