package com.manufacturer.processes;

/**
 * Created by TasdiqueC on 7/28/17.
 */
public class LaptopManufacturingProcess extends GeneralManufacturingProcess {
    public LaptopManufacturingProcess(String name) {
        super(name);
    }

    @Override
    protected void assembleDevice() {
        System.out.println("Laptop assembled.");
    }

    @Override
    protected void testDevice() {
        System.out.println("Laptop tested");
    }

    @Override
    protected void packageDevice() {
        System.out.println("Laptop packaged");
    }

    @Override
    protected void storeDevice() {
        System.out.println("laptop stored");
    }
}
