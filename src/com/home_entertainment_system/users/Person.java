package com.home_entertainment_system.users;
import com.home_entertainment_system.remotes.RemoteControl;

import java.util.Scanner;

/**
 * Created by TasdiqueC on 7/28/17.
 */
public class Person {
    public static void main(String args[]) {
        RemoteControl remoteControl = new RemoteControl();
        System.out.println("Click a button [0 = Projector, " +
                "1 = Television, 2 = Surround Sound System: ");
        Scanner sc = new Scanner(System.in);
        int deviceNumber = sc.nextInt();
        remoteControl.controlDevices(deviceNumber);
    }
}