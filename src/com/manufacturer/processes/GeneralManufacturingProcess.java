package com.manufacturer.processes;

/**
 * Created by TasdiqueC on 7/28/17.
 */
public abstract class GeneralManufacturingProcess {
    private String processName;

    public GeneralManufacturingProcess(String name) {
        processName = name;
    }

    protected abstract void assembleDevice();
    protected abstract void testDevice();
    protected abstract void packageDevice();
    protected abstract void storeDevice();

    // template method
    public void launchProcess() {
        if(processName != null && !processName.isEmpty()) {
            assembleDevice();
            testDevice();
            packageDevice();
            storeDevice();
        }
        else {
            System.out.println("No process name was specified.");
        }
    }
}
