package com.company;

import static com.company.entity.Bank.getMoney;
import com.company.entity.Person;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var cedomir = new Person("Cedomit", "Jovanovic", 0f, 30);
        cedomir.lendMoney(50000);

        System.out.println(cedomir.getBudget());

    }
}
