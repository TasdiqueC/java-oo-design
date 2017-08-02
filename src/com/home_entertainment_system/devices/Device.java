package com.home_entertainment_system.devices;

/**
 * Created by TasdiqueC on 7/28/17.
 */
public abstract class Device {
    boolean onStatus;
    String deviceName;

    public Device () {
        onStatus = false;
    }

    public void onOffDevice(int signal){
        if (signal == 1) {
            onStatus = true;
            System.out.println("Turned on " + deviceName + "...");
            this.doTasks();
        }
        else if (signal == 0) {
            onStatus = false;
            System.out.println("Turning off " + deviceName + "...");
        }
    }

    public abstract void doTasks();

    @Override
    public String toString() {
        return "Device{" +
                "onStatus=" + onStatus +
                ", deviceName='" + deviceName + '\'' +
                '}';
    }
}
