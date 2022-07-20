package com.codewithsufyan;

public class D02_OOC_02 {
    public static void main(String[] args) {
        //Vehicle vehicle = new Vehicle("First","8055","Petrol",4,120);
        //vehicle.displayMake();
        //vehicle.displayBasicInfo();
        //vehicle.displayDetailInfo();

        TwoWheeler tw = new TwoWheeler();
        tw.setKickStartAvailable(true);
        tw.displayDetailInfo();

        FourWheeler fw = new FourWheeler();
        fw.setAudioSystem("Dolby");
        fw.setNumberOfDoors(6);
        fw.displayDetailInfo();
    }
}

class Vehicle {
    protected String make;
    protected String vehicleNumber;
    protected String fuelType;
    protected int fuelCapacity;
    protected int cc;

    public Vehicle() {
    }

    public Vehicle(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) {
        this.make = make;
        this.vehicleNumber = vehicleNumber;
        this.fuelType = fuelType;
        this.fuelCapacity = fuelCapacity;
        this.cc = cc;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void displayMake() {
        System.out.println("Make of vehicle = " + make);
    }

    public void displayBasicInfo() {
        System.out.println("Make of vehicle = " + make);
        System.out.println("Vehicle number = " + vehicleNumber);
        System.out.println("Fuel Type = " + fuelType);
        System.out.println("Fuel Capacity = " + fuelCapacity);
        System.out.println("CC = " + cc);
    }

    public void displayDetailInfo() {

    }
}

class TwoWheeler extends Vehicle {
    boolean kickStartAvailable;

    public boolean getKickStartAvailable() {
        return kickStartAvailable;
    }

    public void setKickStartAvailable(boolean kickStartAvailable) {
        this.kickStartAvailable = kickStartAvailable;
    }

    public void displayDetailInfo() {
        System.out.println("Kick start available = " + kickStartAvailable);
    }
}

class FourWheeler extends Vehicle {
    String audioSystem;
    int numberOfDoors;

    public String getAudioSystem() {
        return audioSystem;
    }

    public void setAudioSystem(String audioSystem) {
        this.audioSystem = audioSystem;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetailInfo() {
        System.out.println("Audio System = " + audioSystem);
        System.out.println("Number of doors = " + numberOfDoors);

    }
}
