package com.company.entity;

import static com.company.entity.Bank.getMoney;
import java.util.ArrayList;
import java.util.List;

public class Person {

  private String name;
  private String surname;
  private int personAge;
  private float budget;
  private List<Car> cars;
  private boolean allowedToDrive;

  public Person(String name, String surname, float budget, int personAge) {
    this.name = name;
    this.surname = surname;
    this.budget = budget;
    this.personAge = personAge;
    this.cars = new ArrayList<>();
    this.allowedToDrive = isAllowedToDrive(personAge);
  }

  private boolean isAllowedToDrive(int age) {
    if(age >= 18) {
      return true;
    }
    return false;
  }

// ternary operator is also a conditional
//  private boolean isAllowedToDrive(int age) {
//    return age >= 18 ? true : false;
//  }

  public void lendMoney(float ammount) {
    var lentAmmount = getMoney(50000);
    increaseBudget(lentAmmount);
  }

  private void increaseBudget(float amount) {
    this.budget += amount;
  }




  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public float getBudget() {
    return budget;
  }

  public List<Car> getCars() {
    return cars;
  }

  public void setBudget(float budget) {
    this.budget = budget;
  }
}
