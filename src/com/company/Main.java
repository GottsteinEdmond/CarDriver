package com.company;

import static com.company.entity.Bank.getMoney;

import com.company.entity.Car;
import com.company.entity.FuelType;
import com.company.entity.Person;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var cedomir = new Person("Cedomir", "Jovanovic", 0f, 30);
       cedomir.lendMoney(50000);

        System.out.println(cedomir.getBudget());
        var driver = new Car(2L, FuelType.DIESEL,true,2000,200,10,60,20000,1000,70,300);
        driver.startEngine();

    }
}
