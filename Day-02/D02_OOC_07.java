package com.codewithsufyan;

public class D02_OOC_07 {
    public static void main(String[] args) {
        Car01 car = new Car01();
        car.drive();
        car.turnLeft();
        car.brake();

        Train train = new Train();
        train.drive();
        train.turnLeft();
        train.brake();
        train.getNumberOfPeople();

        AdvVehClass advVehicle = new AdvVehClass();
        advVehicle.drive();
        advVehicle.turnLeft();
        advVehicle.brake();
        advVehicle.accelerate();
    }
}

interface IVehicle {
    void drive();
    void turnLeft();
    void brake();
}

interface IPublicTransport {
    int getNumberOfPeople();
}

class MotorisedVehicle {
    void checkMotor() {
        System.out.println("The motor of the vehicle is in good condition");
    }
}

class Car01 extends MotorisedVehicle implements IVehicle {
    @Override
    public void drive() {
        System.out.println("Car is in Drive mode");
    }

    @Override
    public void turnLeft() {
        System.out.println("Car is turning Left");
    }

    @Override
    public void brake() {
        System.out.println("Appling Brakes to car");
    }
}

class  Train implements IVehicle,IPublicTransport {
    @Override
    public void drive() {
        System.out.println("Train is in Drive mode");
    }

    @Override
    public void turnLeft() {
        System.out.println("Train is turning Left");
    }

    @Override
    public void brake() {
        System.out.println("Appling Brakes to train");
    }

    @Override
    public int getNumberOfPeople() {
        int num_people=0;
        System.out.println("Number of people = " + num_people);
        return num_people;
    }
}

interface IAdvancedVehicle extends IVehicle {
    void accelerate();
}

class AdvVehClass implements IAdvancedVehicle {
    @Override
    public void drive() {
        System.out.println("Driving ADV");
    }

    @Override
    public void turnLeft() {
        System.out.println("Turning left ADV");
    }

    @Override
    public void brake() {
        System.out.println("Applying Brakes ADV");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelrating ADV");
    }
}
