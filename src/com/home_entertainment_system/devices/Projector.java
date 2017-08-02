package com.home_entertainment_system.devices;

import com.home_entertainment_system.devices.interfaces.brightness;
import com.home_entertainment_system.devices.interfaces.enjoy;
import com.home_entertainment_system.devices.interfaces.volume;

/**
 * Created by TasdiqueC on 7/28/17.
 */
public class Projector extends Device implements brightness, enjoy, volume {
    public Projector() {
        deviceName = "Projector";
    }

    public void brightness() {
        System.out.println("Turning up brightness for your eyes' sake...");
    }

    public void volume() {
        System.out.println("Accessing surround sound and turning up the volume to your preferred settings...");
        SurroundSoundSystem surroundSoundSystem = new SurroundSoundSystem();
        surroundSoundSystem.doTasks();
    }

    public void enjoy() {
        System.out.println("Enjoy your viewing!");
    }

    @Override
    public void doTasks() {
        brightness();
        volume();
        enjoy();
    }
}
