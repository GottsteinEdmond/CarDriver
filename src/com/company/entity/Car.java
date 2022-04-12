package com.company.entity;

public class Car {


  private static int id = 1;
  private int registrationNumber;
  private FuelType fuelType;
  private int price;
  private int enginSize;
  private int enginePower;
  private float fuelConsumption;
  private float fuelCapacity;

  public Car(Long id, FuelType fuelType, int enginSize, int enginePower, float fuelConsumption,
      float fuelCapacity, int price) {
    this.fuelType = fuelType;
    this.enginSize = enginSize;
    this.enginePower = enginePower;
    this.fuelConsumption = fuelConsumption;
    this.fuelCapacity = fuelCapacity;
    this.price = price;
    this.registrationNumber = registrateCar();
  }

  public int getRegistrationNumber() {
    return registrationNumber;
  }

  public int registrateCar() {
    ++id;
    return id;
  }
}
