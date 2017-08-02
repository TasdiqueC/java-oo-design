package com.home_entertainment_system.devices;

import com.home_entertainment_system.devices.interfaces.brightness;
import com.home_entertainment_system.devices.interfaces.enjoy;

/**
 * Created by TasdiqueC on 7/28/17.
 */
public class Television extends Device implements enjoy, brightness {
    public Television () {
        deviceName = "Television";
    }

    public void enjoy() {
        System.out.println("Enjoy your viewing!");
    }

    public void brightness() {
        System.out.println("Turning up brightness for your eyes' sake...");
    }

    @Override
    public void doTasks() {
        brightness();
        enjoy();
    }
}
