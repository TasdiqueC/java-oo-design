package com.manufacturer.clients;

import com.manufacturer.processes.GeneralManufacturingProcess;
import com.manufacturer.processes.SmartphoneManufacturingProcess;

/**
 * Created by TasdiqueC on 7/28/17.
 */
public class DeviceFactory {
    public static void main(String args[]) {
        GeneralManufacturingProcess manufacturer = new SmartphoneManufacturingProcess("Samsung");
        manufacturer.launchProcess();
    }
}
