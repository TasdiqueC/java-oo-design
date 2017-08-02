package com.manufacturer.processes;

/**
 * Created by TasdiqueC on 7/28/17.
 */
public class SmartphoneManufacturingProcess extends GeneralManufacturingProcess {
    public SmartphoneManufacturingProcess(String name) {
        super(name);
    }

    @Override
    protected void assembleDevice() {
        System.out.println("Smartphone assembled");
    }

    @Override
    protected void testDevice() {
        System.out.println("Smartphone tested");
    }

    @Override
    protected void packageDevice() {
        System.out.println("Smartphone packaged");
    }

    @Override
    protected void storeDevice() {
        System.out.println("Smartphone stored");
    }
}
