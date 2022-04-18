package com.company.entity;

public class Car {


  private static int id;

  static {
    id = 1;
  }


  private FuelType fuelType;
  private int price;
  private boolean engine = true;
  private int engineSize;
  private int enginePower;
  private float fuelConsumption;
  private float fuelCapacity;
  private int registrationNumber;
  private int km;
  private int speed;
  private int maxSpeed;


  public Car(Long id,FuelType fuelType , boolean engine, int engineSize, int enginePower, float fuelConsumption,
      float fuelCapacity, int price, int km, int speed, int maxSpeed) {
    this.fuelType = fuelType;
    this.engine = engine;
    this.engineSize = engineSize;
    this.enginePower = enginePower;
    this.fuelConsumption = fuelConsumption;
    this.fuelCapacity = fuelCapacity;
    this.price = price;
    this.registrationNumber = registrateCar();
    this.km = km;
    this.speed = speed;
    this.maxSpeed = maxSpeed;
  }

  public void turnOnOffEngine(boolean turn){
  if(turn){
    this.engine = true;
    System.out.println(" Engine is On");
  }System.out.println("Engine is Off");
  }

  public void stopEngine(){
    engineMode();
  }

  public void startEngine(){
    engineMode();
  }

  private void engineMode(){
    System.out.println("Your engine is ");
    if(this.engine == true){
      System.out.println("ON");
    }else{
      System.out.println("OFF");
    }
  }


  public int accelerate(int acceleration, int maxSpeed){
    if(this.speed >0 && this.speed < maxSpeed){
      this.speed += speed;
    }else{
      if(acceleration >0){
        System.out.println("you still have " + acceleration + "to reach your maximum speed");
      }
    }
    return this.speed;
  }

  public void breakCar(int speed){
    if(this.speed < speed){
      this.speed -= speed;
    }else if(this.speed - speed <= 0){
      System.out.println("your car has stopped");
    }
  }


  // ternary operator is also a conditional
//  private boolean isAllowedToDrive(int age) {
//    return age >= 18 ? true : false;
//  }

  public int getRegistrationNumber() {
    return registrationNumber;
  }

  public int registrateCar() {
    ++id;
    return id;
  }

  public static int getId() {
    return id;
  }

  public FuelType getFuelType() {
    return fuelType;
  }

  public int getPrice() {
    return price;
  }

  public boolean isEngine() {
    return engine;
  }

  public int getEngineSize() {
    return engineSize;
  }

  public int getEnginePower() {
    return enginePower;
  }

  public float getFuelConsumption() {
    return fuelConsumption;
  }

  public float getFuelCapacity() {
    return fuelCapacity;
  }

  public int getKm() {
    return km;
  }

  public int getSpeed() {
    return speed;
  }

  public int getMaxSpeed() {
    return maxSpeed;
  }
}
