package com.home_entertainment_system.remotes;

import com.home_entertainment_system.devices.Device;
import com.home_entertainment_system.devices.Projector;
import com.home_entertainment_system.devices.SurroundSoundSystem;
import com.home_entertainment_system.devices.Television;

/**
 * Created by TasdiqueC on 7/28/17.
 */
public class RemoteControl {
    static Device device;

    public static void controlDevices (int deviceNumber) {
        switch (deviceNumber) {
            case 0:
                device = new Projector();
                device.onOffDevice(1);
                device.onOffDevice(0);
                break;
            case 1:
                device = new Television();
                device.onOffDevice(1);
                device.onOffDevice(0);
                break;
            case 2:
                device = new SurroundSoundSystem();
                device.onOffDevice(1);
                device.onOffDevice(0);
                break;
        }
    }
}
